package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.essentialFactor;

public class goals extends JFrame {

    public goals(essentialFactor ef){
        JFrame frame = new JFrame("goals");    //创建Frame窗口
        frame.setBounds(600,130,380,550);
        frame.setLayout(new BorderLayout());
        Font f = new Font("宋体",Font.BOLD,30);//根据指定字体名称、样式和磅值大小，创建一个新 Font。

        //期望事件
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(3,1));

        //事件一
        Panel p1_1 = new Panel();
        p1_1.setBackground(new Color(242,222,197));
        p1_1.setLayout(new BorderLayout());

        Panel p1_1_1 = new Panel();
        p1_1_1.setLayout(new GridLayout(1,2));
        JLabel goalAct1 = new JLabel("设计师资质");
        JLabel turnLim1 = new JLabel("20回");
        p1_1_1.add(goalAct1);
        p1_1_1.add(turnLim1);
        p1_1.add(p1_1_1,BorderLayout.NORTH);

        JLabel miaoshu1 = new JLabel("想成为设计师必备技能！");
        p1_1.add(miaoshu1,BorderLayout.CENTER);

        JButton reqLim1 = new JButton("想象力：达到500");
        reqLim1.setBackground(new Color(178,178,178));
        p1_1.add(reqLim1,BorderLayout.SOUTH);

        //事件二
        Panel p1_2 = new Panel();
        p1_2.setBackground(new Color(242,222,197));
        p1_2.setLayout(new BorderLayout());

        Panel p1_2_1 = new Panel();
        p1_2_1.setLayout(new GridLayout(1,2));
        JLabel goalAct2 = new JLabel("处理人际关系");
        JLabel turnLim2 = new JLabel("4回");
        p1_2_1.add(goalAct2);
        p1_2_1.add(turnLim2);
        p1_2.add(p1_2_1,BorderLayout.NORTH);

        JLabel miaoshu2 = new JLabel("学会和人相处！");
        p1_2.add(miaoshu2,BorderLayout.CENTER);

        JButton reqLim2 = new JButton("情商：达到300");
        reqLim2.setBackground(new Color(178,178,178));
        p1_2.add(reqLim2,BorderLayout.SOUTH);

        //事件三
        Panel p1_3 = new Panel();
        p1_3.setBackground(new Color(242,222,197));
        p1_3.setLayout(new BorderLayout());

        Panel p1_3_1 = new Panel();
        p1_3_1.setLayout(new GridLayout(1,2));
        JLabel goalAct3 = new JLabel("重点高中达标");
        JLabel turnLim3 = new JLabel("8回");
        p1_3_1.add(goalAct3);
        p1_3_1.add(turnLim3);
        p1_3.add(p1_3_1,BorderLayout.NORTH);

        JLabel miaoshu3 = new JLabel("中考决定了高中，高中决定大学！");
        p1_3.add(miaoshu3,BorderLayout.CENTER);

        JButton reqLim3 = new JButton("智商：达到100");
        reqLim3.setBackground(new Color(178,178,178));
        p1_3.add(reqLim3,BorderLayout.SOUTH);

        //其他界面按钮
        Panel p2 = new Panel();
        JButton study = new JButton("Study");
        JButton schedule = new JButton("Schedule");
        JButton request = new JButton("Request");
        JButton mainPage = new JButton("MainPage");
        p2.add(study);
        p2.add(schedule);
        p2.add(request);
        p2.add(mainPage);


        p1.add(p1_1);
        p1.add(p1_2);
        p1.add(p1_3);

        panel.add(p1,BorderLayout.CENTER);
        panel.add(p2,BorderLayout.SOUTH);

        //跳转
        mainPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                mainDialogueBOX m = new mainDialogueBOX(ef);

            }
        });

        request.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                request req = new request(ef);

            }
        });

        study.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                study stu = new study(ef);
            }
        });

        schedule.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                schedule sch = new schedule(ef);
            }
        });

        reqLim1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ef.getImagination()>=500){
                    reqLim1.setText("已达到期望！");
                }
            }
        });

        reqLim2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ef.getEQ()>=300){
                    reqLim2.setText("已达到期望！");
                }
            }
        });
        reqLim3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ef.getIQ()>=100){
                    reqLim3.setText("已达到期望！");
                }
            }
        });
        //frame
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
