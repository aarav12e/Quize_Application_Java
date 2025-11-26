package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;

    Login() {

        getContentPane().setBackground((Color.white));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz/src/icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Great Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25); 
        rules.setBackground(new Color(30, 144, 254));
        rules.addActionListener(this);
        rules.setForeground(Color.white);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25); 
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        // Action handling code will go here
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            
        } 

        else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}