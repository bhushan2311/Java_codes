package com.company;
import javax.swing.*;

// public class Swing_basics {
//    public static void main(String[] args) {
//
//        JFrame jf = new JFrame("Dummy Window");
//
//        jf.setSize(400,400);
//        jf.setVisible(true);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // closes the window along with program
//    }
//}



// ----------------- By Extending our class with JFrame ------------------


public class Swing_basics extends JFrame{

    public Swing_basics(){};     // require if the object without argument is made in main
    public Swing_basics(String s)
    {
        super(s);  // string passes to JFrame constructor that takes String argument
    }

    JPanel p1,p2,p3;
    JButton b;

    public void setComp()
    {
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        b = new JButton("dummy");

        setLayout(null);
        p1.setBounds(10,10,380,100);
        b.setBounds(100,150,90,30);
        add(p1);
        add(b);
    }
    public static void main(String[] args) {

        Swing_basics jf = new Swing_basics("Dummy Window");    // object of our class

        jf.setComp();

        jf.setSize(400,400);                // set the window's size
        jf.setVisible(true);                                 // makes a window
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // closes the window along with program
    }
}