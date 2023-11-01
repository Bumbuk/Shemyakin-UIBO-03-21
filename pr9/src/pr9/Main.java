package pr9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {
        final int[] score1 = {0,0};
        final String[] team = {"DRAW","N/A"};
        JFrame frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        JButton ac_milan = new JButton("AC Milan");
        JButton real_madrid = new JButton("Real Madrid");
        JLabel result = new JLabel("Result: "+ score1[0] +" X "+ score1[1]);
        JLabel scorer = new JLabel("Last Scorer: "+team[1]);
        JLabel winner = new JLabel("Winner: "+ team[0]);
        ac_milan.setBounds(120,100,130,40);
        ac_milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1[0]++ ;
                if(score1[0]>score1[1]){
                    team[0] = "ac_milan";
                }
                else if(score1[0]<score1[1]){
                    team[0] = "real_madrid";
                }
                else {
                    team[0] = "DRAW";
                }
                team[1] = "ac_milan";
                result.setText("Result: "+ score1[0] +" X "+ score1[1]);
                scorer.setText("Last Scorer: "+team[1]);
                winner.setText("Winner: "+ team[0]);
            }
        });
        frame.add(ac_milan);
        real_madrid.setBounds(270,100,130,40);
        real_madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1[1]++ ;
                if(score1[0]>score1[1]){
                    team[0] = "ac_milan";
                }
                else if(score1[0]<score1[1]){
                    team[0] = "real_madrid";
                }
                else {
                    team[0] = "DRAW";
                }
                team[1] = "real_madrid";
                result.setText("Result: "+ score1[0] +" X "+ score1[1]);
                scorer.setText("Last Scorer: "+team[1]);
                winner.setText("Winner: "+ team[0]);
            }
        });
        frame.add(real_madrid);
        result.setBounds(230,160,130,20);
        frame.add(result);
        scorer.setBounds(230,80,170,20);
        frame.add(scorer);
        winner.setBounds(200,50,130,60);
        frame.add(winner);
        frame.setVisible(true);
}}
