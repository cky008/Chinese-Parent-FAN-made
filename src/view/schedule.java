package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class schedule {
    public static void main(String[] args) {
        new schedule();
    }
    static Panel panel1,panel2,panel3;
    static JFrame frame = new JFrame("挖脑洞");
    schedule() {
        frame.setBounds(600,130,350,550);
        frame.setLayout(new BorderLayout());
        Font f = new Font("宋体",Font.BOLD,30);//根据指定字体名称、样式和磅值大小，创建一个新 Font。

        //跳转主页面
        panel3 = new Panel();
        JButton mainPage = new JButton("MainPage");
        panel3.add(mainPage);

        //跳转
        mainPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                mainDialogueBOX m = new mainDialogueBOX();
            }
        });

//        frame.add(panel1,BorderLayout.NORTH);
//        frame.add(panel2,BorderLayout.CENTER);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
