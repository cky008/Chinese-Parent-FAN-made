package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class mainDialogueBOX {
    public static void main(String[] ars)
    {
        new mainDialogueBOX();
    }
    public mainDialogueBOX(){
        //invisible glue
        Component vGlue = Box.createVerticalGlue();
        Component hGlue = Box.createHorizontalGlue();
        Component glue = Box.createGlue();

        //info
        Box infoBox = Box.createHorizontalBox();
        Box infoDetail = Box.createVerticalBox();
        JLabel infoName = new JLabel("毛毛");
        JLabel infoAge = new JLabel("3岁");
        JButton infoButton = new JButton("Me");

        infoDetail.add(infoName);
        infoDetail.add(infoAge);
        infoBox.add(infoButton);
        infoBox.add(infoDetail);

        //data
        Box dataBox = Box.createHorizontalBox();
        JLabel dataKnowledge = new JLabel("389");
        JLabel dataAction = new JLabel("0/100");
        JButton knowledgeButton = new JButton("悟性");
        JButton actionButton = new JButton("行动力");
        dataBox.add(knowledgeButton);
        dataBox.add(dataKnowledge);
        dataBox.add(actionButton);
        dataBox.add(dataAction);

        //Essential Factor
        Box essentialFactor = Box.createVerticalBox();
        essentialFactor.add(newEFBox("智商",232,3));
        essentialFactor.add(newEFBox("情商",112,5));
        essentialFactor.add(newEFBox("体魄",411,6));
        essentialFactor.add(newEFBox("记忆力",212,4));
        essentialFactor.add(newEFBox("想象力",231,7));
        essentialFactor.add(newEFBox("魅力",23));
        essentialFactor.add(newEFBox("面子",22));

        //console
        JPanel consolePanel = new JPanel();
        consolePanel.setLayout(null);
        consolePanel.setBackground(null);
        consolePanel.setOpaque(false);
        consolePanel.setBorder(new EmptyBorder(0, 0, 50, 50));
//        Vector<String> v = new Vector<String>();
        Vector<String> v = new Vector<>();
        v.add("hi");
        v.add("you");
        v.add("who");
        v.add("are");
        v.add("are");
        v.add("are");
        v.add("are");
        v.add("are");
        JList<String> console = new JList<>(v);
//        JList<String> console = new JList<String>(v);
        console.setBorder(BorderFactory.createTitledBorder("console"));
        console.setBounds(0, 0, 100, 50);
        JScrollPane jsp = new JScrollPane(console);
        jsp.setBounds(0, 230, 300, 130);
        consolePanel.add(jsp);

        //operation
        JButton schedule = new JButton("Schedule");
        JButton absorbFragments = new JButton("Absorb Fragments");
        JButton study = new JButton("Study");
        JButton goals = new JButton("Goals");
        JButton request = new JButton("Request");

        //Main Frame
        JFrame frame=new JFrame("Demo");
        Box main = Box.createVerticalBox();
        Box down = Box.createHorizontalBox();
        Box bar = Box.createHorizontalBox();
        Box left = Box.createVerticalBox();
        Box right = Box.createVerticalBox();
        Box bottom = Box.createHorizontalBox();

        //bar
        bar.add(infoBox);
//        bar.add(hGlue);
        bar.add(dataBox);

        //left
//        left.add(essentialFactor);

        //right
//        right.add(consolePanel);

        //bottom
        bottom.add(schedule);
        bottom.add(absorbFragments);
        bottom.add(study);
        bottom.add(goals);
        bottom.add(request);

        //main
        frame.add(main);
        main.add(bar);
        main.add(down);
        main.add(bottom);
        down.add(essentialFactor);
        down.add(hGlue);
        down.add(consolePanel);

        JLabel bg = new aLabel(new ImageIcon("./src/resources/img/home_bg7.png").getImage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1080,720);
        frame.setVisible(true);
        frame.add(bg);

        study.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                view.study stu = new study();
            }
        });

        request.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                view.request req = new request();
            }
        });

        absorbFragments.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                view.absorbFragments abF = new absorbFragments();
            }
        });

        goals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                goals goa = new goals();
            }
        });

        schedule.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                schedule sch = new schedule();
            }
        });
    }

    public static Box newEFBox(String s1, int EFdata, int EFturn) {
        Box returnBox = Box.createHorizontalBox();
        returnBox.add(new JLabel(s1));
        Component hGlue = Box.createHorizontalGlue();
        returnBox.add(hGlue);
        returnBox.add(new JLabel(String.valueOf(EFdata)));
        returnBox.add(new JLabel("+" + EFturn + "/turn"));
        return returnBox;
    }

    public static Box newEFBox(String s1, int EFdata) {
        Box returnBox = Box.createHorizontalBox();
        returnBox.add(new JLabel(s1));
        Component hGlue = Box.createHorizontalGlue();
        returnBox.add(hGlue);
        returnBox.add(new JLabel(String.valueOf(EFdata)));
        return returnBox;
    }

    private static class aLabel extends JLabel
    {
        private Image image;
        public aLabel(Image image){ this.image = image; }
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            int x = this.getWidth();
            int y = this.getHeight();
            g.drawImage(image, 0, 0, x, y - 28, null);
        }
    }
}
