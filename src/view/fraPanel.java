package view;

import model.essentialFactor;
import model.fragments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fraPanel implements ActionListener{

    public static Panel genFraPanel(essentialFactor ef) {
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(10,10,5,5));

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
                        tempJButton.setToolTipText("add 10 Constitution immediately");
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
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addIQ(10);
                                }
                            }
                            case "2" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addEQ(10);
                                }
                            }
                            case "3" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addImagination(10);
                                }
                            }
                            case "4 "-> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addMemory(10);
                                }
                            }
                            case "5" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addConstitution(10);
                                }
                            }
                            case "6" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addIQE(5);
                                }
                            }
                            case "7" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addEQE(5);
                                }
                            }
                            case "8" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addImaginationE(5);
                                }
                            }
                            case "9" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addMemoryE(5);
                                }
                            }
                            case "10" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addConstitutionE(5);
                                }
                            }
                            case "11" -> {
                                if (ef.getAction()<10){
                                    JOptionPane.showMessageDialog(null, "行动力不足！", "行动力不足！",JOptionPane.WARNING_MESSAGE);
                                }
                                else {
                                    ef.minusAction(10);
                                    ef.addKnowledge(20);
                                }
                            }
                            case "12" -> {
                                ef.addAction(15);
                            }
                            case "13" -> {
                                ef.addAction(20);
                            }
                            case "14" -> {
                                ef.addAction(50);
                                absorbFragments.renewNextLevel(ef);
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
