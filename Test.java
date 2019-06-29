import java.awt.event.*;

import javax.swing.*;

public class Test extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public Test() {
    }

    public Test(String s) {
        super(s);
    }
    public void setComponents() {
        l1 = new JLabel("Addition of two number");
        l2 = new JLabel("Enter first number");
        l3 = new JLabel("Enter second number");
        l4 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");

        // setBounds to all objs
        setLayout(null);
        l1.setBounds(150,50,200,20);
        l2.setBounds(50,80,200,20);
        t1.setBounds(260,80,80,20);
        l3.setBounds(50,110,200,20);
        t2.setBounds(260, 110, 80, 20);
        b1.setBounds(150, 140, 80, 20);
        // add event listner
        b1.addActionListener(new Handler());
        l4.setBounds(50,170,200,40);
        // adding these objs in JFrame
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
    }
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int s = a+b;
            l4.setText("Sum is "+s);
        }
    }

    public static void main(String[] args) {
        Test jf = new Test("Swing Example");
        jf.setComponents();
        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
}