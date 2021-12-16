package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Vector;
import  model.essentialFactor;
import model.activity;
public class mainDialogue {

    public mainDialogue(essentialFactor ef, activity acc){
        //activity
        //invisible glue
        Component vGlue = Box.createVerticalGlue();
        Component hGlue = Box.createHorizontalGlue();
        Component glue = Box.createGlue();

        //info
        Box infoBox = Box.createHorizontalBox();
        Box infoDetail = Box.createVerticalBox();
        JLabel infoName = new JLabel("毛毛");
        infoName.setForeground(Color.WHITE);
        JLabel infoAge = new JLabel("3岁");
        infoAge.setForeground(Color.WHITE);
        JButton infoButton = new JButton("Me");

        infoDetail.add(infoName);
        infoDetail.add(infoAge);
        infoBox.add(infoButton);
        infoBox.add(infoDetail);

        //data
        Box dataBox = Box.createHorizontalBox();
        JLabel dataKnowledge = new JLabel(String.valueOf(ef.getKnowledge()));
        JLabel dataAction = new JLabel(String.valueOf(ef.getAction()));
        JLabel dataTurn = new JLabel(String.valueOf(ef.getTurn()));
        JButton knowledgeButton = new JButton("悟性");
        JButton actionButton = new JButton("行动力");
        JButton turnButton = new JButton("周数");
        dataAction.setForeground(Color.WHITE);
        dataKnowledge.setForeground(Color.WHITE);
        dataTurn.setForeground(Color.WHITE);
        dataBox.add(knowledgeButton);
        dataBox.add(dataKnowledge);
        dataBox.add(actionButton);
        dataBox.add(dataAction);
        dataBox.add(turnButton);
        dataBox.add(dataTurn);

        //Essential Factor
        Box essentialFactor = Box.createVerticalBox();
        essentialFactor.add(newEFBox("智商",ef.getIQ(),ef.getIQRate()));
        essentialFactor.add(newEFBox("情商",ef.getEQ(),ef.getEQRate()));
        essentialFactor.add(newEFBox("体魄",ef.getConstitution(),ef.getConstitutionRate()));
        essentialFactor.add(newEFBox("记忆力",ef.getMemory(),ef.getMemoryRate()));
        essentialFactor.add(newEFBox("想象力",ef.getImagination(),ef.getImaginationRate()));
        essentialFactor.add(newEFBox("魅力",ef.getCharm(),ef.getCharmRate()));
        essentialFactor.add(newEFBox("面子",ef.getFace()));

        //console
        JPanel consolePanel = new JPanel();
        consolePanel.setLayout(null);
        consolePanel.setBackground(null);
        consolePanel.setOpaque(false);
        consolePanel.setBorder(new EmptyBorder(0, 0, 50, 50));
//        Vector<String> v = new Vector<String>();
        Vector<String> v = new Vector<>();
        v.add("大肚");
        v.add("晶晶");
        v.add("凌酱");
        v.add("旭桑");
        v.add("绒绒");
        JList<String> console = new JList<>(v);
//        JList<String> console = new JList<String>(v);
        console.setBorder(BorderFactory.createTitledBorder("制作团队"));
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

        study.addActionListener(e -> {
            frame.setVisible(false);
            view.study stu = new study(ef, acc);
        });

        request.addActionListener(e -> {
            frame.setVisible(false);
            view.request req = new request(ef, acc);
        });

        absorbFragments.addActionListener(e -> {
            frame.setVisible(false);
            view.absorbFragments abF = new absorbFragments(ef, acc);
        });

        goals.addActionListener(e -> {
            frame.setVisible(false);
            goals goa = new goals(ef, acc);
        });

        schedule.addActionListener(e -> {
            frame.setVisible(false);
            schedule sch = new schedule(ef, acc);
        });
    }

    public static Box newEFBox(String s1, int EFdata, int EFturn) {
        Box returnBox = Box.createHorizontalBox();
        returnBox.add(new JLabel(s1));
        Component hGlue = Box.createHorizontalGlue();
        returnBox.add(hGlue);
        JLabel tempJL1 = new JLabel(String.valueOf(EFdata));
//        tempJL1.setForeground(Color.WHITE);
        JLabel tempJL2 = new JLabel("+" + EFturn + "/turn");
//        tempJL2.setForeground(Color.WHITE);
        returnBox.add(tempJL1);
        returnBox.add(tempJL2);
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
