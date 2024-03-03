package com.company;

import javax.swing.*;
import java.awt.event.*;

public class Swing_basic2 extends JFrame {

    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3;
    JButton b;

    public Swing_basic2(String s)
    {
        super(s);
    }

    public void setComponents()      // user defined
    {
        l1 = new JLabel("* Addition of 2 numbers *");
        l2 = new JLabel("Enter first no.");
        l3 = new JLabel("Enter Second no.");
        l4 = new JLabel("The Addition is : ");
        l5 = new JLabel();

        t1 = new JTextField();
        t2 = new JTextField();
        t3= new JTextField();

        b = new JButton("Add");

        setLayout(null);
        l1.setBounds(70,10,200,40);
        l2.setBounds(40,60,80,20);
        t1.setBounds(160,60,55,20);
        l3.setBounds(40,100,100,20);
        t2.setBounds(160,100,55,20);

        b.setBounds(100,150,60,30);

        l4.setBounds(30,200,100,30);
//        l5.setBounds(131,200,50,30);
        t3.setBounds(131,206,40,20);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b);
        add(l4);
//        add(l5);
        add(t3);
        b.addActionListener(new Handler());     // to perform event/action

    }

    public class Handler implements ActionListener  // inner class that implements interface ActionListener and it must override interface's abstract method
    {
        public void actionPerformed(ActionEvent e)    // override abstract method of interface ActionListener
        {
            int a,b,r;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            r=a+b;
//            l5.setText(String.valueOf(r));
            t3.setText(String.valueOf(r));
        }
    }

    public static void main(String[] args) {
        Swing_basic2 jf = new Swing_basic2("GUI");

        jf.setComponents(); // calling user defined function

        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
