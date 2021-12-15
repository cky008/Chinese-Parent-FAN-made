package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.essentialFactor;
import model.activity;
public class request extends JFrame{

    public request(essentialFactor ef, activity acc){
        JFrame frame = new JFrame("request");    //创建Frame窗口
        frame.setBounds(450,130,700,600);
        frame.setLayout(new BorderLayout());
        Font f = new Font("宋体",Font.BOLD,30);//根据指定字体名称、样式和磅值大小，创建一个新 Font。

        //索取次数
        final int[] times = {ef.getTimes()};
        Panel panel1 = new Panel();
        JLabel text1 = new JLabel("可向父母索取");
        JLabel text2 = new JLabel(String.valueOf(times[0]));
        JLabel text3 = new JLabel("次");
        panel1.add(text1);
        panel1.add(text2);
        panel1.add(text3);

        //索取事件
        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(5,1));
        String[][] reqActs = {{"小区滑梯","沙发蹦床","平板游戏","电子琴","橡皮泥","游乐园"},
                {"26","27","28","38","30","40"}};
        String[][] reqAttr = {{"5","5","1","3","2","3"},
                {"60","100","200","140","50","80"}};
        int face = ef.getFace();

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
        if(((face-Float.parseFloat(reqActs[1][0]))/Float.parseFloat(reqActs[1][0]))>=0.75){
            clickReq.setBackground(new Color(255,125,0));

        }
        else{
            clickReq.setBackground(new Color(130,130,130));
        }

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
        if(((face-Float.parseFloat(reqActs[1][1]))/Float.parseFloat(reqActs[1][1]))>=0.75){
            clickReq2.setBackground(new Color(255,125,0));
        }
        else{
            clickReq2.setBackground(new Color(130,130,130));
        }

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
        if(((face-Float.parseFloat(reqActs[1][2]))/Float.parseFloat(reqActs[1][2]))>=0.75){
            clickReq3.setBackground(new Color(255,125,0));
        }
        else{
            clickReq3.setBackground(new Color(130,130,130));
        }

        panel2_3.add(panel2_3_1);
        panel2_3.add(clickReq3);

        panel2.add(panel2_3);

        //事件四
        Panel panel2_4 = new Panel();
        panel2_4.setBackground(new Color(255,216,167));
        panel2_4.setLayout(new GridLayout(1,2));

        Panel panel2_4_1 = new Panel();
        panel2_4_1.setLayout(new BorderLayout());
        Icon icon4 = new ImageIcon("./src/resources/img/smile.png");
        JLabel smile4 = new JLabel();
        smile4.setIcon(icon4);
        JLabel reqAct4 = new JLabel(reqActs[0][3]);
        JLabel successRate4 = new JLabel("成功率: "+((face-Float.parseFloat(reqActs[1][3]))/Float.parseFloat(reqActs[1][3]))*100 + "%");
        panel2_4_1.add(smile4,BorderLayout.WEST);
        panel2_4_1.add(reqAct4,BorderLayout.CENTER);
        panel2_4_1.add(successRate4,BorderLayout.EAST);

        JButton clickReq4 = new JButton("索取");
        clickReq4.setFont(f);
        if(((face-Float.parseFloat(reqActs[1][3]))/Float.parseFloat(reqActs[1][3]))>=0.75){
            clickReq4.setBackground(new Color(255,125,0));
        }
        else{
            clickReq4.setBackground(new Color(130,130,130));
        }

        panel2_4.add(panel2_4_1);
        panel2_4.add(clickReq4);

        panel2.add(panel2_4);

        //事件五
        Panel panel2_5 = new Panel();
        panel2_5.setBackground(new Color(255,216,167));
        panel2_5.setLayout(new GridLayout(1,2));

        Panel panel2_5_1 = new Panel();
        panel2_5_1.setLayout(new BorderLayout());
        Icon icon5 = new ImageIcon("./src/resources/img/smile.png");
        JLabel smile5 = new JLabel();
        smile5.setIcon(icon5);
        JLabel reqAct5 = new JLabel(reqActs[0][4]);
        JLabel successRate5 = new JLabel("成功率: "+((face-Float.parseFloat(reqActs[1][4]))/Float.parseFloat(reqActs[1][4]))*100 + "%");
        panel2_5_1.add(smile5,BorderLayout.WEST);
        panel2_5_1.add(reqAct5,BorderLayout.CENTER);
        panel2_5_1.add(successRate5,BorderLayout.EAST);

        JButton clickReq5 = new JButton("索取");
        clickReq5.setFont(f);
        if(((face-Float.parseFloat(reqActs[1][4]))/Float.parseFloat(reqActs[1][4]))>=0.75){
            clickReq5.setBackground(new Color(255,125,0));
        }
        else{
            clickReq5.setBackground(new Color(130,130,130));
        }

        panel2_5.add(panel2_5_1);
        panel2_5.add(clickReq5);

        panel2.add(panel2_5);

        //跳转学习、期望、需求、主页面
        Panel panel3 = new Panel();
        JButton study = new JButton("Study");
        JButton goals = new JButton("Goals");
        JButton schedule = new JButton("Schedule");
        JButton mainPage = new JButton("MainPage");
        panel3.add(study);
        panel3.add(goals);
        panel3.add(schedule);
        panel3.add(mainPage);

        //按钮事件
        clickReq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((((face-Float.parseFloat(reqActs[1][0]))/Float.parseFloat(reqActs[1][0]))>=0.75)&times[0]>0){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                    times[0]--;
                    ef.minusTimes(1);
                    text2.setText(String.valueOf(times[0]));
                    clickReq.setText("已索取");
                    clickReq.setEnabled(false);
                    //TODO: activity交互
                    acc.addActivity(reqActs[0][0],reqAttr[0][0],reqAttr[1][0]);
                }
                if((((face-Float.parseFloat(reqActs[1][0]))/Float.parseFloat(reqActs[1][0]))<0.75)){
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    JLabel reqSuc2 = new JLabel("次数不足！");
                    if(times[0]<=0){
                        j2.add(reqSuc2);
                    }
                    else{
                        j2.add(reqSuc);
                    }
                    j2.setVisible(true);
                }
            }
        });

        clickReq2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((((face-Float.parseFloat(reqActs[1][1]))/Float.parseFloat(reqActs[1][1]))>=0.75)&times[0]>0){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                    times[0]--;
                    ef.minusTimes(1);
                    text2.setText(String.valueOf(times[0]));
                    clickReq2.setText("已索取");
                    clickReq2.setEnabled(false);
                    //TODO: activity交互
                    acc.addActivity(reqActs[0][1],reqAttr[0][1],reqAttr[1][1]);
                }
                if((((face-Float.parseFloat(reqActs[1][1]))/Float.parseFloat(reqActs[1][1]))<0.75)){
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    JLabel reqSuc2 = new JLabel("次数不足！");
                    if(times[0]<=0){
                        j2.add(reqSuc2);
                    }
                    else{
                        j2.add(reqSuc);
                    }
                    j2.setVisible(true);
                }
            }
        });

        clickReq3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((((face-Float.parseFloat(reqActs[1][2]))/Float.parseFloat(reqActs[1][2]))>=0.75)&times[0]>0){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                    times[0]--;
                    ef.minusTimes(1);
                    text2.setText(String.valueOf(times[0]));
                    clickReq3.setText("已索取");
                    clickReq3.setEnabled(false);
                    //TODO: activity交互
                    acc.addActivity(reqActs[0][2],reqAttr[0][2],reqAttr[1][2]);
                }
                if((((face-Float.parseFloat(reqActs[1][2]))/Float.parseFloat(reqActs[1][2]))<0.75)){
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    JLabel reqSuc2 = new JLabel("次数不足！");
                    if(times[0]<=0){
                        j2.add(reqSuc2);
                    }
                    else{
                        j2.add(reqSuc);
                    }
                    j2.setVisible(true);
                }
            }
        });

        clickReq4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((((face-Float.parseFloat(reqActs[1][3]))/Float.parseFloat(reqActs[1][3]))>=0.75)&times[0]>0){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                    times[0]--;
                    ef.minusTimes(1);
                    text2.setText(String.valueOf(times[0]));
                    clickReq4.setText("已索取");
                    clickReq4.setEnabled(false);
                    //TODO: activity交互
                    acc.addActivity(reqActs[0][3],reqAttr[0][3],reqAttr[1][3]);
                }
                if((((face-Float.parseFloat(reqActs[1][3]))/Float.parseFloat(reqActs[1][3]))<0.75)){
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    JLabel reqSuc2 = new JLabel("次数不足！");
                    if(times[0]<=0){
                        j2.add(reqSuc2);
                    }
                    else{
                        j2.add(reqSuc);
                    }
                    j2.setVisible(true);
                }
            }
        });

        clickReq5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((((face-Float.parseFloat(reqActs[1][4]))/Float.parseFloat(reqActs[1][4]))>=0.75)&times[0]>0){
                    JFrame j1 = new JFrame("提醒");
                    j1.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("索取成功！");
                    j1.add(reqSuc);
                    j1.setVisible(true);
                    times[0]--;
                    ef.minusTimes(1);
                    text2.setText(String.valueOf(times[0]));
                    clickReq5.setText("已索取");
                    clickReq5.setEnabled(false);
                    //TODO: activity交互
                    acc.addActivity(reqActs[0][4],reqAttr[0][4],reqAttr[1][4]);
                }
                if((((face-Float.parseFloat(reqActs[1][4]))/Float.parseFloat(reqActs[1][4]))<0.75)){
                    JFrame j2 = new JFrame("提醒");
                    j2.setBounds(710,320,208,100);
                    JLabel reqSuc = new JLabel("面子不足！");
                    JLabel reqSuc2 = new JLabel("次数不足！");
                    if(times[0]<=0){
                        j2.add(reqSuc2);
                    }
                    else{
                        j2.add(reqSuc);
                    }
                    j2.setVisible(true);
                }
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

        study.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                view.study stu = new study(ef, acc);
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

        //frame布局
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
