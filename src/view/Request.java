package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Request extends JFrame{
    public static void main(String[] args)
    {
       new Request();
    }
    public Request(){
        JFrame frame = new JFrame("request");    //创建Frame窗口
        frame.setBounds(450,180,700,400);
        frame.setLayout(new BorderLayout());
        Font f = new Font("宋体",Font.BOLD,30);//根据指定字体名称、样式和磅值大小，创建一个新 Font。

        //索取次数
        int times = 3;
        Panel panel1 = new Panel();
        JLabel text1 = new JLabel("可向父母索取");
        JLabel text2 = new JLabel(String.valueOf(times));
        JLabel text3 = new JLabel("次");
        panel1.add(text1);
        panel1.add(text2);
        panel1.add(text3);

        //索取事件
        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(3,1));
        String[][] reqActs = {{"小区滑梯","沙发蹦床","平板游戏","电子琴","橡皮泥","动漫乐园游"},
                {"22","23","30","60","90","120"}};
        int face = 40;

        //事件一
        Panel panel2_1 = new Panel();
        panel2_1.setBackground(new Color(255,216,167));
        panel2_1.setLayout(new GridLayout(1,2));

        Panel panel2_1_1 = new Panel();
        panel2_1_1.setLayout(new BorderLayout());
        Icon icon = new ImageIcon("./src/resources/img/smile.png");
        JLabel smile = new JLabel();
        smile.setIcon(icon);
        JLabel reqAct = new JLabel(reqActs[0][0]);
        JLabel successRate = new JLabel("成功率: "+((face-Float.parseFloat(reqActs[1][0]))/Float.parseFloat(reqActs[1][0]))*100 + "%");
        panel2_1_1.add(smile,BorderLayout.WEST);
        panel2_1_1.add(reqAct,BorderLayout.CENTER);
        panel2_1_1.add(successRate,BorderLayout.EAST);

        JButton clickReq = new JButton("索取");
        clickReq.setFont(f);
        clickReq.setBackground(new Color(255,125,0));

        panel2_1.add(panel2_1_1);
        panel2_1.add(clickReq);

        panel2.add(panel2_1);

        //事件二
        Panel panel2_2 = new Panel();
        panel2_2.setBackground(new Color(255,216,167));
        panel2_2.setLayout(new GridLayout(1,2));

        Panel panel2_2_1 = new Panel();
        panel2_2_1.setLayout(new BorderLayout());
        Icon icon2 = new ImageIcon("./src/resources/img/smile.png");
        JLabel smile2 = new JLabel();
        smile2.setIcon(icon2);
        JLabel reqAct2 = new JLabel(reqActs[0][1]);

        JLabel successRate2 = new JLabel("成功率: "+((face-Float.parseFloat(reqActs[1][1]))/Float.parseFloat(reqActs[1][1]))*100 + "%");
        panel2_2_1.add(smile2,BorderLayout.WEST);
        panel2_2_1.add(reqAct2,BorderLayout.CENTER);
        panel2_2_1.add(successRate2,BorderLayout.EAST);

        JButton clickReq2 = new JButton("索取");
        clickReq2.setFont(f);
        clickReq2.setBackground(new Color(255,125,0));

        panel2_2.add(panel2_2_1);
        panel2_2.add(clickReq2);

        panel2.add(panel2_2);

        //事件三
        Panel panel2_3 = new Panel();
        panel2_3.setBackground(new Color(255,216,167));
        panel2_3.setLayout(new GridLayout(1,2));

        Panel panel2_3_1 = new Panel();
        panel2_3_1.setLayout(new BorderLayout());
        Icon icon3 = new ImageIcon("./src/resources/img/smile.png");
        JLabel smile3 = new JLabel();
        smile3.setIcon(icon3);
        JLabel reqAct3 = new JLabel(reqActs[0][2]);
        JLabel successRate3 = new JLabel("成功率: "+((face-Float.parseFloat(reqActs[1][2]))/Float.parseFloat(reqActs[1][2]))*100 + "%");
        panel2_3_1.add(smile3,BorderLayout.WEST);
        panel2_3_1.add(reqAct3,BorderLayout.CENTER);
        panel2_3_1.add(successRate3,BorderLayout.EAST);

        JButton clickReq3 = new JButton("索取");
        clickReq3.setFont(f);
        clickReq3.setBackground(new Color(255,125,0));

        panel2_3.add(panel2_3_1);
        panel2_3.add(clickReq3);

        panel2.add(panel2_3);

        //跳转学习、期望、需求、主页面
        Panel panel3 = new Panel();
        JButton study = new JButton("Study");
        JButton goals = new JButton("Goals");
        JButton request = new JButton("Request");
        JButton mainPage = new JButton("MainPage");
        panel3.add(study);
        panel3.add(goals);
        panel3.add(request);
        panel3.add(mainPage);

        clickReq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(((face-Float.parseFloat(reqActs[1][0]))/Float.parseFloat(reqActs[1][0]))>0.75){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                    clickReq.setText("已索取");
                }else{
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    j2.add(reqSuc);
                    j2.setVisible(true);
                }
            }
        });

        clickReq2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(((face-Float.parseFloat(reqActs[1][1]))/Float.parseFloat(reqActs[1][1]))>0.75){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                }else{
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    j2.add(reqSuc);
                    j2.setVisible(true);
                }
            }
        });

        clickReq3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(((face-Float.parseFloat(reqActs[1][2]))/Float.parseFloat(reqActs[1][2]))>0.75){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                }else{
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    j2.add(reqSuc);
                    j2.setVisible(true);
                }
            }
        });

        mainPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                mainDialogueBOX m = new mainDialogueBOX();

            }
        });

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
