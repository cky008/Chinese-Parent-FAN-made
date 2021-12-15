package view;

import model.essentialFactor;
import model.activity;
import javax.swing.*;
import java.awt.*;

public class schedule extends JFrame{
    public schedule(essentialFactor ef, activity acc){
        JFrame frame = new JFrame("schedule");    //创建Frame窗口
        frame.setBounds(600,130,380,560);
        frame.setBackground(new Color(209,172,143));
        frame.setLayout(new BorderLayout());
        Font f = new Font("宋体",Font.BOLD,30);//根据指定字体名称、样式和磅值大小，创建一个新 Font。

        //TODO: activity交互
//        String[]stuActs = {"英语","数学","语文","历史","物理","化学"};
//        String[][]shuxing = {{"记忆力","智商","情商","记忆力","智商","想象力"},
//                {"60","100","200","140","50","80"}};
        String[]stuActs = acc.getAcArr();
        String[][]Attributes = {acc.getAttrArrC(), acc.getAttrVArr()};

        //安排事件
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(6,1));

        //安排一
        Panel p1_1 = new Panel();
        p1_1.setBackground(new Color(255,216,167));
        p1_1.setLayout(new BorderLayout());
        Icon icon1 = new ImageIcon("./src/resources/img/smile.png");
        final JLabel[] stuAct1 = {new JLabel()};
        stuAct1[0].setIcon(icon1);

        Panel p1_1_1 = new Panel();
        p1_1_1.setLayout(new GridLayout(2,1));
        JLabel stuText1 = new JLabel("安排一");
        JLabel detail1 = new JLabel("添加至空白处");

        Panel p1_1_2 = new Panel();
        JComboBox jcb1=new JComboBox(stuActs);

        p1_1_1.add(stuText1);
        p1_1_1.add(detail1);
        p1_1_2.add(jcb1);

        p1_1.add(stuAct1[0],BorderLayout.WEST);
        p1_1.add(p1_1_1,BorderLayout.CENTER);
        p1_1.add(p1_1_2,BorderLayout.EAST);

        //安排二
        Panel p1_2 = new Panel();
        p1_2.setBackground(new Color(255,216,167));
        p1_2.setLayout(new BorderLayout());
        Icon icon2 = new ImageIcon("./src/resources/img/smile.png");
        final JLabel[] stuAct2 = {new JLabel()};
        stuAct2[0].setIcon(icon2);

        Panel p1_2_1 = new Panel();
        p1_2_1.setLayout(new GridLayout(2,1));
        JLabel stuText2 = new JLabel("安排二");
        JLabel detail2 = new JLabel("添加至空白处");

        Panel p1_2_2 = new Panel();
        JComboBox jcb2=new JComboBox(stuActs);

        p1_2_1.add(stuText2);
        p1_2_1.add(detail2);
        p1_2_2.add(jcb2);

        p1_2.add(stuAct2[0],BorderLayout.WEST);
        p1_2.add(p1_2_1,BorderLayout.CENTER);
        p1_2.add(p1_2_2,BorderLayout.EAST);

        //安排三
        Panel p1_3 = new Panel();
        p1_3.setBackground(new Color(255,216,167));
        p1_3.setLayout(new BorderLayout());
        Icon icon3 = new ImageIcon("./src/resources/img/smile.png");
        final JLabel[] stuAct3 = {new JLabel()};
        stuAct3[0].setIcon(icon3);

        Panel p1_3_1 = new Panel();
        p1_3_1.setLayout(new GridLayout(2,1));
        JLabel stuText3 = new JLabel("安排三");
        JLabel detail3 = new JLabel("添加至空白处");

        Panel p1_3_2 = new Panel();
        JComboBox jcb3=new JComboBox(stuActs);

        p1_3_1.add(stuText3);
        p1_3_1.add(detail3);
        p1_3_2.add(jcb3);

        p1_3.add(stuAct3[0],BorderLayout.WEST);
        p1_3.add(p1_3_1,BorderLayout.CENTER);
        p1_3.add(p1_3_2,BorderLayout.EAST);

        //安排四
        Panel p1_4 = new Panel();
        p1_4.setBackground(new Color(255,216,167));
        p1_4.setLayout(new BorderLayout());
        Icon icon4 = new ImageIcon("./src/resources/img/smile.png");
        final JLabel[] stuAct4 = {new JLabel()};
        stuAct4[0].setIcon(icon4);

        Panel p1_4_1 = new Panel();
        p1_4_1.setLayout(new GridLayout(2,1));
        JLabel stuText4 = new JLabel("安排四");
        JLabel detail4 = new JLabel("添加至空白处");

        Panel p1_4_2 = new Panel();
        JComboBox jcb4=new JComboBox(stuActs);

        p1_4_1.add(stuText4);
        p1_4_1.add(detail4);
        p1_4_2.add(jcb4);

        p1_4.add(stuAct4[0],BorderLayout.WEST);
        p1_4.add(p1_4_1,BorderLayout.CENTER);
        p1_4.add(p1_4_2,BorderLayout.EAST);

        //安排五
        Panel p1_5 = new Panel();
        p1_5.setBackground(new Color(255,216,167));
        p1_5.setLayout(new BorderLayout());
        Icon icon5 = new ImageIcon("./src/resources/img/smile.png");
        final JLabel[] stuAct5 = {new JLabel()};
        stuAct5[0].setIcon(icon5);

        Panel p1_5_1 = new Panel();
        p1_5_1.setLayout(new GridLayout(2,1));
        JLabel stuText5 = new JLabel("安排五");
        JLabel detail5 = new JLabel("添加至空白处");

        Panel p1_5_2 = new Panel();
        JComboBox jcb5=new JComboBox(stuActs);

        p1_5_1.add(stuText5);
        p1_5_1.add(detail5);
        p1_5_2.add(jcb5);

        p1_5.add(stuAct5[0],BorderLayout.WEST);
        p1_5.add(p1_5_1,BorderLayout.CENTER);
        p1_5.add(p1_5_2,BorderLayout.EAST);

        //安排六
        Panel p1_6 = new Panel();
        p1_6.setBackground(new Color(255,216,167));
        p1_6.setLayout(new BorderLayout());
        Icon icon6 = new ImageIcon("./src/resources/img/smile.png");
        final JLabel[] stuAct6 = {new JLabel()};
        stuAct6[0].setIcon(icon6);

        Panel p1_6_1 = new Panel();
        p1_6_1.setLayout(new GridLayout(2,1));
        JLabel stuText6 = new JLabel("安排六");
        JLabel detail6 = new JLabel("添加至空白处");

        Panel p1_6_2 = new Panel();
        JComboBox jcb6=new JComboBox(stuActs);

        p1_6_1.add(stuText6);
        p1_6_1.add(detail6);
        p1_6_2.add(jcb6);

        p1_6.add(stuAct6[0],BorderLayout.WEST);
        p1_6.add(p1_6_1,BorderLayout.CENTER);
        p1_6.add(p1_6_2,BorderLayout.EAST);

        p1.add(p1_1);
        p1.add(p1_2);
        p1.add(p1_3);
        p1.add(p1_4);
        p1.add(p1_5);
        p1.add(p1_6);

        //其他界面按钮
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(2,1));
        Panel p2_1 = new Panel();
        JButton study = new JButton("Study");
        JButton goals = new JButton("Goals");
        JButton request = new JButton("Request");
        JButton mainPage = new JButton("MainPage");
        p2_1.add(study);
        p2_1.add(goals);
        p2_1.add(request);
        p2_1.add(mainPage);

        JButton anpai = new JButton("安排");

        p2.add(anpai);
        p2.add(p2_1);

        panel.add(p1,BorderLayout.NORTH);
        panel.add(p2,BorderLayout.SOUTH);

        //事件
        jcb1.addActionListener(e -> {
            int idx = jcb1.getSelectedIndex();
//              detail1.setText(Attributes[0][idx]+"+"+Attributes[1][idx]);
            detail1.setText(Attributes[0][idx]+"+"+Attributes[1][idx]);
            System.out.println(Attributes[0][idx]);
        });

        jcb2.addActionListener(e -> {
            int idx = jcb2.getSelectedIndex();
            detail2.setText(Attributes[0][idx]+"+"+Attributes[1][idx]);
        });

        jcb3.addActionListener(e -> {
            int idx = jcb3.getSelectedIndex();
            detail3.setText(Attributes[0][idx]+"+"+Attributes[1][idx]);
        });

        jcb4.addActionListener(e -> {
            int idx = jcb4.getSelectedIndex();
            detail4.setText(Attributes[0][idx]+"+"+Attributes[1][idx]);
        });

        jcb5.addActionListener(e -> {
            int idx = jcb5.getSelectedIndex();
            detail5.setText(Attributes[0][idx]+"+"+Attributes[1][idx]);
        });

        jcb6.addActionListener(e -> {
            int idx = jcb6.getSelectedIndex();
            detail6.setText(Attributes[0][idx]+"+"+Attributes[1][idx]);
        });

        //跳转
        mainPage.addActionListener(e -> {
            frame.setVisible(false);
            mainDialogue m = new mainDialogue(ef, acc);
        });

        request.addActionListener(e -> {
            frame.setVisible(false);
            view.request req = new request(ef, acc);
        });

        goals.addActionListener(e -> {
            frame.setVisible(false);
            goals goa = new goals(ef, acc);
        });

        study.addActionListener(e -> {
            frame.setVisible(false);
            view.study stu = new study(ef, acc);
        });

        anpai.addActionListener(e -> {
            int index1 = jcb1.getSelectedIndex();
            int index2 = jcb2.getSelectedIndex();
            int index3 = jcb3.getSelectedIndex();
            int index4 = jcb4.getSelectedIndex();
            int index5 = jcb5.getSelectedIndex();
            int index6 = jcb6.getSelectedIndex();
            if (ef.getAction() > 10) {
                JOptionPane.showMessageDialog(null, "今天还有多余的行动力没有消耗噢~", "今天还有多余的行动力没有消耗噢~",JOptionPane.WARNING_MESSAGE);
            }
            else if (index1 == -1) {
                JOptionPane.showMessageDialog(null, "没有安排~", "没有安排~",JOptionPane.WARNING_MESSAGE);
            }
            else {
                essentialFactor.addAttr(acc.getActivity(index1), ef);
                essentialFactor.addAttr(acc.getActivity(index2), ef);
                essentialFactor.addAttr(acc.getActivity(index3), ef);
                essentialFactor.addAttr(acc.getActivity(index4), ef);
                essentialFactor.addAttr(acc.getActivity(index5), ef);
                essentialFactor.addAttr(acc.getActivity(index6), ef);

                ef.nextTurn();
                frame.setVisible(false);
                mainDialogue m = new mainDialogue(ef, acc);
                JOptionPane.showMessageDialog(null, "这是第" + ef.getTurn() + "周", "周数提醒",JOptionPane.WARNING_MESSAGE);
            }

            //增加属性
            /*switch(index1)
            {
                case 0:
                    ef.addMemory(Integer.valueOf(Attributes[1][0]));
                    break;
                case 1:
                    ef.addIQ(Integer.valueOf(Attributes[1][1]));
                    break;
                case 2:
                    ef.addEQ(Integer.valueOf(Attributes[1][2]));
                    break;
                case 3:
                    ef.addMemory(Integer.valueOf(Attributes[1][3]));
                    break;
                case 4:
                    ef.addIQ(Integer.valueOf(Attributes[1][4]));
                    break;
                case 5:
                    ef.addImagination(Integer.valueOf(Attributes[1][5]));
                    break;
            }

            switch(index2)
            {
                case 0:
                    ef.addMemory(Integer.valueOf(Attributes[1][0]));
                    break;
                case 1:
                    ef.addIQ(Integer.valueOf(Attributes[1][1]));
                    break;
                case 2:
                    ef.addEQ(Integer.valueOf(Attributes[1][2]));
                    break;
                case 3:
                    ef.addMemory(Integer.valueOf(Attributes[1][3]));
                    break;
                case 4:
                    ef.addIQ(Integer.valueOf(Attributes[1][4]));
                    break;
                case 5:
                    ef.addImagination(Integer.valueOf(Attributes[1][5]));
                    break;
            }

            switch(index3)
            {
                case 0:
                    ef.addMemory(Integer.valueOf(Attributes[1][0]));
                    break;
                case 1:
                    ef.addIQ(Integer.valueOf(Attributes[1][1]));
                    break;
                case 2:
                    ef.addEQ(Integer.valueOf(Attributes[1][2]));
                    break;
                case 3:
                    ef.addMemory(Integer.valueOf(Attributes[1][3]));
                    break;
                case 4:
                    ef.addIQ(Integer.valueOf(Attributes[1][4]));
                    break;
                case 5:
                    ef.addImagination(Integer.valueOf(Attributes[1][5]));
                    break;
            }

            switch(index4)
            {
                case 0:
                    ef.addMemory(Integer.valueOf(Attributes[1][0]));
                    break;
                case 1:
                    ef.addIQ(Integer.valueOf(Attributes[1][1]));
                    break;
                case 2:
                    ef.addEQ(Integer.valueOf(Attributes[1][2]));
                    break;
                case 3:
                    ef.addMemory(Integer.valueOf(Attributes[1][3]));
                    break;
                case 4:
                    ef.addIQ(Integer.valueOf(Attributes[1][4]));
                    break;
                case 5:
                    ef.addImagination(Integer.valueOf(Attributes[1][5]));
                    break;
            }

            switch(index5)
            {
                case 0:
                    ef.addMemory(Integer.valueOf(Attributes[1][0]));
                    break;
                case 1:
                    ef.addIQ(Integer.valueOf(Attributes[1][1]));
                    break;
                case 2:
                    ef.addEQ(Integer.valueOf(Attributes[1][2]));
                    break;
                case 3:
                    ef.addMemory(Integer.valueOf(Attributes[1][3]));
                    break;
                case 4:
                    ef.addIQ(Integer.valueOf(Attributes[1][4]));
                    break;
                case 5:
                    ef.addImagination(Integer.valueOf(Attributes[1][5]));
                    break;
            }

            switch(index6)
            {
                case 0:
                    ef.addMemory(Integer.valueOf(Attributes[1][0]));
                    break;
                case 1:
                    ef.addIQ(Integer.valueOf(Attributes[1][1]));
                    break;
                case 2:
                    ef.addEQ(Integer.valueOf(Attributes[1][2]));
                    break;
                case 3:
                    ef.addMemory(Integer.valueOf(Attributes[1][3]));
                    break;
                case 4:
                    ef.addIQ(Integer.valueOf(Attributes[1][4]));
                    break;
                case 5:
                    ef.addImagination(Integer.valueOf(Attributes[1][5]));
                    break;
            }*/

        });

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
