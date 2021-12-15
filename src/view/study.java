package view;

import model.essentialFactor;
import model.activity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class study extends JFrame {
    public study(essentialFactor ef, activity acc){
        JFrame frame = new JFrame("study");    //创建Frame窗口
        frame.setBounds(600,130,380,550);
        frame.setBackground(new Color(209,172,143));
        frame.setLayout(new BorderLayout());
        Font f = new Font("宋体",Font.BOLD,30);//根据指定字体名称、样式和磅值大小，创建一个新 Font。
        final int[] wuxing = {ef.getKnowledge()};

        String[][] stuActs = {{"英语","数学","语文","历史","物理","化学"},
                {"100","200","50","40","150","180"}};
        String[][] stuShuXing = {{"记忆力","智商","情商","记忆力","智商","想象力"},
                {"60","100","200","140","50","80"}};
        String[] stuSuc = new String[10];//已学习事件添加进去
        //学习事件
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(6,1));

        //事件一
        Panel p1_1 = new Panel();
        p1_1.setBackground(new Color(255,216,167));
        p1_1.setLayout(new BorderLayout());
        Icon icon1 = new ImageIcon("./src/resources/img/smile.png");
        final JLabel[] stuAct1 = {new JLabel()};
        stuAct1[0].setIcon(icon1);

        Panel p1_1_1 = new Panel();
        p1_1_1.setLayout(new GridLayout(2,1));
        JLabel stuText1 = new JLabel(stuActs[0][0]);
        JLabel depText1 = new JLabel("依赖：记忆力");

        Panel p1_1_2 = new Panel();
        p1_1_2.setLayout(new GridLayout(2,1));
        JButton xuexi1 = new JButton("学习");
        xuexi1.setBackground(new Color(244,127,37));
        JLabel wuxing1 = new JLabel("悟性："+stuActs[1][0]);

        p1_1_1.add(stuText1);
        p1_1_1.add(depText1);
        p1_1_2.add(xuexi1);
        p1_1_2.add(wuxing1);

        p1_1.add(stuAct1[0],BorderLayout.WEST);
        p1_1.add(p1_1_1,BorderLayout.CENTER);
        p1_1.add(p1_1_2,BorderLayout.EAST);

        //事件二
        Panel p1_2 = new Panel();
        p1_2.setLayout(new BorderLayout());
        p1_2.setBackground(new Color(255,216,167));
        Icon icon2 = new ImageIcon("./src/resources/img/smile.png");
        JLabel stuAct2 = new JLabel();
        stuAct2.setIcon(icon2);

        Panel p1_2_1 = new Panel();
        p1_2_1.setLayout(new GridLayout(2,1));
        JLabel stuText2 = new JLabel(stuActs[0][1]);
        JLabel depText2 = new JLabel("依赖：智商");

        Panel p1_2_2 = new Panel();
        p1_2_2.setLayout(new GridLayout(2,1));
        JButton xuexi2 = new JButton("学习");
        xuexi2.setBackground(new Color(244,127,37));
        JLabel wuxing2 = new JLabel("悟性："+stuActs[1][1]);

        p1_2_1.add(stuText2);
        p1_2_1.add(depText2);
        p1_2_2.add(xuexi2);
        p1_2_2.add(wuxing2);

        p1_2.add(stuAct2,BorderLayout.WEST);
        p1_2.add(p1_2_1,BorderLayout.CENTER);
        p1_2.add(p1_2_2,BorderLayout.EAST);

        //事件三
        Panel p1_3 = new Panel();
        p1_3.setLayout(new BorderLayout());
        p1_3.setBackground(new Color(255,216,167));
        Icon icon3 = new ImageIcon("./src/resources/img/smile.png");
        JLabel stuAct3 = new JLabel();
        stuAct3.setIcon(icon3);

        Panel p1_3_1 = new Panel();
        p1_3_1.setLayout(new GridLayout(2,1));
        JLabel stuText3 = new JLabel(stuActs[0][2]);
        JLabel depText3 = new JLabel("依赖：情商");

        Panel p1_3_2 = new Panel();
        p1_3_2.setLayout(new GridLayout(2,1));
        JButton xuexi3 = new JButton("学习");
        xuexi3.setBackground(new Color(244,127,37));
        JLabel wuxing3 = new JLabel("悟性："+stuActs[1][2]);

        p1_3_1.add(stuText3);
        p1_3_1.add(depText3);
        p1_3_2.add(xuexi3);
        p1_3_2.add(wuxing3);

        p1_3.add(stuAct3,BorderLayout.WEST);
        p1_3.add(p1_3_1,BorderLayout.CENTER);
        p1_3.add(p1_3_2,BorderLayout.EAST);

        //事件四
        Panel p1_4 = new Panel();
        p1_4.setLayout(new BorderLayout());
        p1_4.setBackground(new Color(255,216,167));
        Icon icon4 = new ImageIcon("./src/resources/img/smile.png");
        JLabel stuAct4 = new JLabel();
        stuAct4.setIcon(icon4);

        Panel p1_4_1 = new Panel();
        p1_4_1.setLayout(new GridLayout(2,1));
        JLabel stuText4 = new JLabel(stuActs[0][3]);
        JLabel depText4 = new JLabel("依赖：情商，记忆力");

        Panel p1_4_2 = new Panel();
        p1_4_2.setLayout(new GridLayout(2,1));
        JButton xuexi4 = new JButton("学习");
        xuexi4.setBackground(new Color(244,127,37));
        JLabel wuxing4 = new JLabel("悟性："+stuActs[1][3]);

        p1_4_1.add(stuText4);
        p1_4_1.add(depText4);
        p1_4_2.add(xuexi4);
        p1_4_2.add(wuxing4);

        p1_4.add(stuAct4,BorderLayout.WEST);
        p1_4.add(p1_4_1,BorderLayout.CENTER);
        p1_4.add(p1_4_2,BorderLayout.EAST);

        //事件五
        Panel p1_5 = new Panel();
        p1_5.setLayout(new BorderLayout());
        p1_5.setBackground(new Color(255,216,167));
        Icon icon5 = new ImageIcon("./src/resources/img/smile.png");
        JLabel stuAct5 = new JLabel();
        stuAct5.setIcon(icon5);

        Panel p1_5_1 = new Panel();
        p1_5_1.setLayout(new GridLayout(2,1));
        JLabel stuText5 = new JLabel(stuActs[0][4]);
        JLabel depText5 = new JLabel("依赖：智力");

        Panel p1_5_2 = new Panel();
        p1_5_2.setLayout(new GridLayout(2,1));
        JButton xuexi5 = new JButton("学习");
        xuexi5.setBackground(new Color(244,127,37));
        JLabel wuxing5 = new JLabel("悟性："+stuActs[1][4]);

        p1_5_1.add(stuText5);
        p1_5_1.add(depText5);
        p1_5_2.add(xuexi5);
        p1_5_2.add(wuxing5);

        p1_5.add(stuAct5,BorderLayout.WEST);
        p1_5.add(p1_5_1,BorderLayout.CENTER);
        p1_5.add(p1_5_2,BorderLayout.EAST);

        //事件六
        Panel p1_6 = new Panel();
        p1_6.setLayout(new BorderLayout());
        p1_6.setBackground(new Color(255,216,167));
        Icon icon6 = new ImageIcon("./src/resources/img/smile.png");
        JLabel stuAct6 = new JLabel();
        stuAct6.setIcon(icon6);

        Panel p1_6_1 = new Panel();
        p1_6_1.setLayout(new GridLayout(2,1));
        JLabel stuText6 = new JLabel(stuActs[0][5]);
        JLabel depText6 = new JLabel("依赖：智力，想象力");

        Panel p1_6_2 = new Panel();
        p1_6_2.setLayout(new GridLayout(2,1));
        JButton xuexi6 = new JButton("学习");
        xuexi6.setBackground(new Color(244,127,37));
        JLabel wuxing6 = new JLabel("悟性："+stuActs[1][5]);

        p1_6_1.add(stuText6);
        p1_6_1.add(depText6);
        p1_6_2.add(xuexi6);
        p1_6_2.add(wuxing6);

        p1_6.add(stuAct6,BorderLayout.WEST);
        p1_6.add(p1_6_1,BorderLayout.CENTER);
        p1_6.add(p1_6_2,BorderLayout.EAST);

        //其他界面按钮
        Panel p2 = new Panel();
        JButton schedule = new JButton("Schedule");
        JButton goals = new JButton("Goals");
        JButton request = new JButton("Request");
        JButton mainPage = new JButton("MainPage");
        p2.add(schedule);
        p2.add(goals);
        p2.add(request);
        p2.add(mainPage);

        p1.add(p1_1);
        p1.add(p1_2);
        p1.add(p1_3);
        p1.add(p1_4);
        p1.add(p1_5);
        p1.add(p1_6);
        panel.add(p1,BorderLayout.NORTH);
        panel.add(p2,BorderLayout.SOUTH);

        //按钮事件
        xuexi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j1 = new JFrame("学会技能");
                j1.setBounds(660,320,245,100);
                Panel panel = new Panel();
                if(wuxing[0] - Integer.valueOf(stuActs[1][0])>=0){
                    panel.setLayout(new GridLayout(2,1));
                    JLabel stuAct = new JLabel(stuText1.getText());
                    JLabel shuxing = new JLabel(stuShuXing[0][0]+" +"+stuShuXing[1][0]);
                    ef.addMemory(Integer.valueOf(stuShuXing[1][0]));
                    panel.add(stuAct);
                    panel.add(shuxing);
                    j1.add(panel);
                    xuexi1.setText("已学习");
                    xuexi1.setEnabled(false);
                    wuxing[0] = wuxing[0] - Integer.valueOf(stuActs[1][0]);
                    ef.minusKnowledge(Integer.valueOf(stuActs[1][0]));
                    //TODO: activity交互
                }else{
                    JLabel noStu = new JLabel("悟性不足！");
                    panel.add(noStu);
                    j1.add(panel);
                }
                j1.setVisible(true);
            }
        });

        xuexi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j1 = new JFrame("学会技能");
                j1.setBounds(660,320,245,100);
                Panel panel = new Panel();
                if(wuxing[0] - Integer.valueOf(stuActs[1][1])>=0){
                    panel.setLayout(new GridLayout(2,1));
                    JLabel stuAct = new JLabel(stuText2.getText());
                    JLabel shuxing = new JLabel(stuShuXing[0][1]+" +"+stuShuXing[1][1]);
                    ef.addIQ(Integer.valueOf(stuShuXing[1][1]));
                    panel.add(stuAct);
                    panel.add(shuxing);
                    j1.add(panel);
                    xuexi2.setText("已学习");
                    xuexi2.setEnabled(false);
                    wuxing[0] = wuxing[0] - Integer.valueOf(stuActs[1][1]);
                    ef.minusKnowledge(Integer.valueOf(stuActs[1][1]));
                    //TODO: activity交互

                }else{
                    JLabel noStu = new JLabel("悟性不足！");
                    panel.add(noStu);
                    j1.add(panel);
                }
                j1.setVisible(true);
            }
        });

        xuexi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j1 = new JFrame("学会技能");
                j1.setBounds(660,320,245,100);
                Panel panel = new Panel();
                if(wuxing[0] - Integer.valueOf(stuActs[1][2])>=0){
                    panel.setLayout(new GridLayout(2,1));
                    JLabel stuAct = new JLabel(stuText3.getText());
                    JLabel shuxing = new JLabel(stuShuXing[0][2]+" +"+stuShuXing[1][2]);
                    ef.addEQ(Integer.valueOf(stuShuXing[1][2]));
                    panel.add(stuAct);
                    panel.add(shuxing);
                    j1.add(panel);
                    xuexi3.setText("已学习");
                    xuexi3.setEnabled(false);
                    wuxing[0] = wuxing[0] - Integer.valueOf(stuActs[1][2]);
                    ef.minusKnowledge(Integer.valueOf(stuActs[1][2]));
                    //TODO: activity交互
                }else{
                    JLabel noStu = new JLabel("悟性不足！");
                    panel.add(noStu);
                    j1.add(panel);
                }
                j1.setVisible(true);
            }
        });

        xuexi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j1 = new JFrame("学会技能");
                j1.setBounds(660,320,245,100);
                Panel panel = new Panel();
                if(wuxing[0] - Integer.valueOf(stuActs[1][3])>=0){
                    panel.setLayout(new GridLayout(2,1));
                    JLabel stuAct = new JLabel(stuText4.getText());
                    JLabel shuxing = new JLabel(stuShuXing[0][3]+" +"+stuShuXing[1][3]);
                    ef.addMemory(Integer.valueOf(stuShuXing[1][3]));
                    panel.add(stuAct);
                    panel.add(shuxing);
                    j1.add(panel);
                    xuexi4.setText("已学习");
                    xuexi4.setEnabled(false);
                    wuxing[0] = wuxing[0] - Integer.valueOf(stuActs[1][3]);
                    ef.minusKnowledge(Integer.valueOf(stuActs[1][3]));
                    //TODO: activity交互
                }else{
                    JLabel noStu = new JLabel("悟性不足！");
                    panel.add(noStu);
                    j1.add(panel);
                }
                j1.setVisible(true);
            }
        });

        xuexi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j1 = new JFrame("学会技能");
                j1.setBounds(660,320,245,100);
                Panel panel = new Panel();
                if(wuxing[0] - Integer.valueOf(stuActs[1][4])>=0){
                    panel.setLayout(new GridLayout(2,1));
                    JLabel stuAct = new JLabel(stuText5.getText());
                    JLabel shuxing = new JLabel(stuShuXing[0][4]+" +"+stuShuXing[1][4]);
                    ef.addIQ(Integer.valueOf(stuShuXing[1][4]));
                    panel.add(stuAct);
                    panel.add(shuxing);
                    j1.add(panel);
                    xuexi5.setText("已学习");
                    xuexi5.setEnabled(false);
                    wuxing[0] = wuxing[0] - Integer.valueOf(stuActs[1][4]);
                    ef.minusKnowledge(Integer.valueOf(stuActs[1][4]));
                    //TODO: activity交互
                }else{
                    JLabel noStu = new JLabel("悟性不足！");
                    panel.add(noStu);
                    j1.add(panel);
                }
                j1.setVisible(true);
            }
        });

        xuexi6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame j1 = new JFrame("学会技能");
                j1.setBounds(660,320,245,100);
                Panel panel = new Panel();
                if(wuxing[0] - Integer.valueOf(stuActs[1][5])>=0){
                    panel.setLayout(new GridLayout(2,1));
                    JLabel stuAct = new JLabel(stuText6.getText());
                    JLabel shuxing = new JLabel(stuShuXing[0][5]+" +"+stuShuXing[1][5]);
                    ef.addImagination(Integer.valueOf(stuShuXing[1][5]));
                    panel.add(stuAct);
                    panel.add(shuxing);
                    j1.add(panel);
                    xuexi6.setText("已学习");
                    xuexi6.setEnabled(false);
                    wuxing[0] = wuxing[0] - Integer.valueOf(stuActs[1][5]);
                    ef.minusKnowledge(Integer.valueOf(stuActs[1][5]));
                    //TODO: activity交互
                }else{
                    JLabel noStu = new JLabel("悟性不足！");
                    panel.add(noStu);
                    j1.add(panel);
                }
                j1.setVisible(true);
            }
        });
        //跳转
        mainPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                mainDialogue m = new mainDialogue(ef, acc);

            }
        });

        request.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                view.request req = new request(ef, acc);

            }
        });

        goals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                goals goa = new goals(ef, acc);
            }
        });

        schedule.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                schedule sch = new schedule(ef, acc);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
