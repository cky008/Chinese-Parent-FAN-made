package view;

import model.essentialFactor;
import model.fragments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class absorbFragments{
    static Panel panel1,panel2,panel3;
    static JFrame frame = new JFrame("Absorb Fragments");
    public absorbFragments(essentialFactor ef) {
            //创建Frame窗口
        frame.setBounds(450,130,750,900);
        frame.setLayout(new BorderLayout());
        Font f = new Font("宋体",Font.BOLD,30);//根据指定字体名称、样式和磅值大小，创建一个新 Font。

        //数据面板
        panel1 = new Panel();
        JLabel dataKnowledge = new JLabel("389");
        JLabel dataAction = new JLabel("0/100");
        JButton knowledgeButton = new JButton("悟性");
        JButton actionButton = new JButton("行动力");
        panel1.add(knowledgeButton);
        panel1.add(dataKnowledge);
        panel1.add(actionButton);
        panel1.add(dataAction);

        //挖脑洞面板
        panel2 = fraPanel.genFraPanel();
        fragments fraa = new fragments(10);

        //跳转主页面
        panel3 = new Panel();
        JButton mainPage = new JButton("MainPage");
        panel3.add(mainPage);

        //跳转
        mainPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                mainDialogueBOX m = new mainDialogueBOX(ef);
            }
        });

        //frame布局
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void renewNextLevel() {
        frame.remove(panel2);//移除面板中的所有组件
        frame.add(fraPanel.genFraPanel(),BorderLayout.CENTER);//添加要切换的面板
        frame.repaint();//刷新页面，重绘面板
        frame.validate();//使重绘的面板确认生效
    }
}