package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Rules You Need To Follow");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Open Sans", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ "<br><br>" +
                "1. Participants must answer questions honestly and not use any unauthorized materials or assistance." + "<br><br>" +
                "2. Quizzes are to be completed individually, and participants should not collaborate with others." + "<br><br>" +
                "3. Participants should remain seated in the entire duration of the quiz." + "<br><br>" +
                "4. Participants should not seek or provide hints." + "<br><br>" +
                "5. Quiz questions are confidential, participants should not disclose them to others." + "<br><br>" +
                "6. Participants must adhere to the specified technical requirements" + "<br><br>" +
                "7. Participants must attempt all questions and complete the entire quiz." + "<br><br>" +
                "8. Participants are not allowed to create multiple entries using different identities." + "<br><br>" +
            "<html>"
        );
        add(rules);

        start = new JButton("Accept");
        start.setBounds(250, 500, 100, 30); 
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.RED);
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Reject");
        back.setBounds(400, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.RED);
        back.addActionListener(this);
        add(back);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
