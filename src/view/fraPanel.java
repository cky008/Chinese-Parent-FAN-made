package view;

import model.fragments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class fraPanel implements ActionListener{

    public static Panel genFraPanel() {
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(10,10,5,5));
//        JButton b1 = new JButton();
//        JButton b2 = new JButton();
//        JButton b3 = new JButton();
//        JButton b4 = new JButton();
//        JButton b5 = new JButton();
//        JButton b6 = new JButton();
//        JButton b7 = new JButton();
//        JButton b8 = new JButton();
//        JButton b9 = new JButton();
//        JButton b10 = new JButton();
//        JButton b11 = new JButton();
//        JButton b12 = new JButton();
//        JButton b13 = new JButton();
//        JButton b14 = new JButton();
//        JButton b15 = new JButton();
//        JButton b16 = new JButton();
//        JButton b17 = new JButton();
//        JButton b18 = new JButton();
//        JButton b19 = new JButton();
//        JButton b20 = new JButton();
//        JButton b21 = new JButton();
//        JButton b22 = new JButton();
//        JButton b23 = new JButton();
//        JButton b24 = new JButton();
//        JButton b25 = new JButton();
//        JButton b26 = new JButton();
//        JButton b27 = new JButton();
//        JButton b28 = new JButton();
//        JButton b29 = new JButton();
//        JButton b30 = new JButton();
//        JButton b31 = new JButton();
//        JButton b32 = new JButton();
//        JButton b33 = new JButton();
//        JButton b34 = new JButton();
//        JButton b35 = new JButton();
//        JButton b36 = new JButton();
//        JButton b37 = new JButton();
//        JButton b38 = new JButton();
//        JButton b39 = new JButton();
//        JButton b40 = new JButton();
//        JButton b41 = new JButton();
//        JButton b42 = new JButton();
//        JButton b43 = new JButton();
//        JButton b44 = new JButton();
//        JButton b45 = new JButton();
//        JButton b46 = new JButton();
//        JButton b47 = new JButton();
//        JButton b48 = new JButton();
//        JButton b49 = new JButton();
//        JButton b50 = new JButton();
//        JButton b51 = new JButton();
//        JButton b52 = new JButton();
//        JButton b53 = new JButton();
//        JButton b54 = new JButton();
//        JButton b55 = new JButton();
//        JButton b56 = new JButton();
//        JButton b57 = new JButton();
//        JButton b58 = new JButton();
//        JButton b59 = new JButton();
//        JButton b60 = new JButton();
//        JButton b61 = new JButton();
//        JButton b62 = new JButton();
//        JButton b63 = new JButton();
//        JButton b64 = new JButton();
//        JButton b65 = new JButton();
//        JButton b66 = new JButton();
//        JButton b67 = new JButton();
//        JButton b68 = new JButton();
//        JButton b69 = new JButton();
//        JButton b70 = new JButton();
//        JButton b71 = new JButton();
//        JButton b72 = new JButton();
//        JButton b73 = new JButton();
//        JButton b74 = new JButton();
//        JButton b75 = new JButton();
//        JButton b76 = new JButton();
//        JButton b77 = new JButton();
//        JButton b78 = new JButton();
//        JButton b79 = new JButton();
//        JButton b80 = new JButton();
//        JButton b81 = new JButton();
//        JButton b82 = new JButton();
//        JButton b83 = new JButton();
//        JButton b84 = new JButton();
//        JButton b85 = new JButton();
//        JButton b86 = new JButton();
//        JButton b87 = new JButton();
//        JButton b88 = new JButton();
//        JButton b89 = new JButton();
//        JButton b90 = new JButton();
//        JButton b91 = new JButton();
//        JButton b92 = new JButton();
//        JButton b93 = new JButton();
//        JButton b94 = new JButton();
//        JButton b95 = new JButton();
//        JButton b96 = new JButton();
//        JButton b97 = new JButton();
//        JButton b98 = new JButton();
//        JButton b99 = new JButton();
//        JButton b100 = new JButton();
//        panel.add(b1);
//        panel.add(b2);
//        panel.add(b3);
//        panel.add(b4);
//        panel.add(b5);
//        panel.add(b6);
//        panel.add(b7);
//        panel.add(b8);
//        panel.add(b9);
//        panel.add(b10);
//        panel.add(b11);
//        panel.add(b12);
//        panel.add(b13);
//        panel.add(b14);
//        panel.add(b15);
//        panel.add(b16);
//        panel.add(b17);
//        panel.add(b18);
//        panel.add(b19);
//        panel.add(b20);
//        panel.add(b21);
//        panel.add(b22);
//        panel.add(b23);
//        panel.add(b24);
//        panel.add(b25);
//        panel.add(b26);
//        panel.add(b27);
//        panel.add(b28);
//        panel.add(b29);
//        panel.add(b30);
//        panel.add(b31);
//        panel.add(b32);
//        panel.add(b33);
//        panel.add(b34);
//        panel.add(b35);
//        panel.add(b36);
//        panel.add(b37);
//        panel.add(b38);
//        panel.add(b39);
//        panel.add(b40);
//        panel.add(b41);
//        panel.add(b42);
//        panel.add(b43);
//        panel.add(b44);
//        panel.add(b45);
//        panel.add(b46);
//        panel.add(b47);
//        panel.add(b48);
//        panel.add(b49);
//        panel.add(b50);
//        panel.add(b51);
//        panel.add(b52);
//        panel.add(b53);
//        panel.add(b54);
//        panel.add(b55);
//        panel.add(b56);
//        panel.add(b57);
//        panel.add(b58);
//        panel.add(b59);
//        panel.add(b60);
//        panel.add(b61);
//        panel.add(b62);
//        panel.add(b63);
//        panel.add(b64);
//        panel.add(b65);
//        panel.add(b66);
//        panel.add(b67);
//        panel.add(b68);
//        panel.add(b69);
//        panel.add(b70);
//        panel.add(b71);
//        panel.add(b72);
//        panel.add(b73);
//        panel.add(b74);
//        panel.add(b75);
//        panel.add(b76);
//        panel.add(b77);
//        panel.add(b78);
//        panel.add(b79);
//        panel.add(b80);
//        panel.add(b81);
//        panel.add(b82);
//        panel.add(b83);
//        panel.add(b84);
//        panel.add(b85);
//        panel.add(b86);
//        panel.add(b87);
//        panel.add(b88);
//        panel.add(b89);
//        panel.add(b90);
//        panel.add(b91);
//        panel.add(b92);
//        panel.add(b93);
//        panel.add(b94);
//        panel.add(b95);
//        panel.add(b96);
//        panel.add(b97);
//        panel.add(b98);
//        panel.add(b99);
//        panel.add(b100);
        fragments fraB = new fragments(10);
        ImageIcon IQIcon = new ImageIcon("./src/resources/img/22.png");
        ImageIcon EQIcon = new ImageIcon("./src/resources/img/32.png");
        ImageIcon ImaginationIcon = new ImageIcon("./src/resources/img/422.png");
        ImageIcon MemoryIcon = new ImageIcon("./src/resources/img/522.png");
        ImageIcon ConstitutionIcon = new ImageIcon("./src/resources/img/622.png");
        ImageIcon KnowledgeIcon = new ImageIcon("./src/resources/img/12.png");
        ImageIcon RandomIcon = new ImageIcon("./src/resources/img/212.png");
        ImageIcon ActionIcon = new ImageIcon("./src/resources/img/242.png");
        ImageIcon nextIcon = new ImageIcon("./src/resources/img/272.png");
        ImageIcon IQEIcon = new ImageIcon("./src/resources/img/25_122.png");
        ImageIcon EQEIcon = new ImageIcon("./src/resources/img/25_222.png");
        ImageIcon ImaginationEIcon = new ImageIcon("./src/resources/img/25_322.png");
        ImageIcon MemoryEIcon = new ImageIcon("./src/resources/img/25_422.png");
        ImageIcon ConstitutionEIcon = new ImageIcon("./src/resources/img/25_52.png");


        int[][] fraArray = fraB.getFra();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int temp = fraArray[i][j];
                JButton tempJButton = new JButton("" + temp);
                tempJButton.setBorderPainted(false);
                tempJButton.setOpaque(false);
                tempJButton.setBackground(Color.white);
                switch (temp) {
                    case 1 -> {
                        tempJButton.setIcon(IQIcon);
                        tempJButton.setToolTipText("add 10 IQ immediately");
                    }
                    case 2 -> {
                        tempJButton.setIcon(EQIcon);
                        tempJButton.setToolTipText("add 10 EQ immediately");
                    }
                    case 3 -> {
                        tempJButton.setIcon(ImaginationIcon);
                        tempJButton.setToolTipText("add 10 Imagination immediately");
                    }
                    case 4 -> {
                        tempJButton.setIcon(MemoryIcon);
                        tempJButton.setToolTipText("add 10 Memory immediately");
                    }
                    case 5 -> {
                        tempJButton.setIcon(ConstitutionIcon);
                        tempJButton.setToolTipText("add 5 Constitution immediately");
                    }
                    case 6 -> {
                        tempJButton.setIcon(IQEIcon);
                        tempJButton.setToolTipText("add more 5 IQ every round");
                    }
                    case 7 -> {
                        tempJButton.setIcon(EQEIcon);
                        tempJButton.setToolTipText("add more 5 EQ every round");
                    }
                    case 8 -> {
                        tempJButton.setIcon(ImaginationEIcon);
                        tempJButton.setToolTipText("add more 5 Imagination every round");
                    }
                    case 9 -> {
                        tempJButton.setIcon(MemoryEIcon);
                        tempJButton.setToolTipText("add more 5 Memory every round");
                    }
                    case 10 -> {
                        tempJButton.setIcon(ConstitutionEIcon);
                        tempJButton.setToolTipText("add more 5 Constitution every round");
                    }
                    case 11 -> {
                        tempJButton.setIcon(KnowledgeIcon);
                        tempJButton.setToolTipText("add 20 Knowledge immediately");
                    }
                    case 12 -> {
                        tempJButton.setIcon(RandomIcon);
                        tempJButton.setToolTipText("add 12 random EF immediately");
                    }
                    case 13 -> {
                        tempJButton.setIcon(ActionIcon);
                        tempJButton.setToolTipText("add 20 Action immediately");
                    }
                    case 14 -> {
                        tempJButton.setIcon(nextIcon);
                        tempJButton.setToolTipText("go to next level and get 50 Action immediately");
                    }
                }
                tempJButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tempJButton.setEnabled(false);
                        switch (tempJButton.getText()) {
                            case "1" -> {
                                tempJButton.setIcon(IQIcon);
                                System.out.println("IQ++");
                            }
                            case "2" -> tempJButton.setIcon(EQIcon);
                            case "3" -> tempJButton.setIcon(ImaginationIcon);
                            case "4 "-> tempJButton.setIcon(MemoryIcon);
                            case "5" -> tempJButton.setIcon(ConstitutionIcon);
                            case "6" -> tempJButton.setIcon(IQEIcon);
                            case "7" -> tempJButton.setIcon(EQEIcon);
                            case "8" -> tempJButton.setIcon(ImaginationEIcon);
                            case "9" -> tempJButton.setIcon(MemoryEIcon);
                            case "10" -> tempJButton.setIcon(ConstitutionEIcon);
                            case "11" -> tempJButton.setIcon(KnowledgeIcon);
                            case "12" -> tempJButton.setIcon(RandomIcon);
                            case "13" -> tempJButton.setIcon(ActionIcon);
                            case "14" -> {
                                System.out.println("Action++");
                                absorbFragments.renewNextLevel();
                            }
                        }
                    }
                });
                panel.add(tempJButton);
            }
        }
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
