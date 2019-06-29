import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
public class Test extends JFrame{
    JLabel enterP,enterT,enterR,intrest;
    JTextField p,t,r;
    JButton i;
    public Test(){};
    public Test(String s){
        super(s);
    }
    public void setComponents() {
        setLayout(null);
        // intrest 
        intrest = new JLabel();
        intrest.setBounds(100, 170, 200, 20);
        add(intrest);
        // principle
        enterP = new JLabel();
        enterP.setText("Enter Principle");
        enterP.setBounds(50, 50, 200, 20);
        add(enterP);
        p = new JTextField();
        p.setBounds(250, 50, 80, 20);
        add(p);
        // time
        enterT = new JLabel();
        enterT.setText("Enter Time");
        enterT.setBounds(50, 80, 200, 20);
        add(enterT);
        t = new JTextField();
        t.setBounds(250, 80, 80, 20);
        add(t);
        // rate
        enterR = new JLabel();
        enterR.setText("Enter Rate");
        enterR.setBounds(50, 110, 200, 20);
        add(enterR);
        r = new JTextField();
        r.setBounds(250, 110, 80, 20);
        add(r);
        // caluclate Intrest button
        i = new JButton("Calculate Intrest");
        i.setBounds(100, 140, 200, 20);
        i.addActionListener(new Handler());
        add(i);
    }
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int pr = Integer.parseInt(p.getText());
            int ti = Integer.parseInt(t.getText());
            int ra = Integer.parseInt(r.getText());
            double in = (pr*ti*ra)/100;
            // System.out.println(in);
            intrest.setText("Intrest = "+in);
        }
    }
    public static void main(String[] args) {
        Test jf = new Test("simple interest");
        jf.setComponents();
        jf.setVisible(true);
        // jf.setShape(new Ellipse2D.Float(20f, -30f, 250.0f, 150.0f));
        jf.setSize(500,500);
        jf.setLocation(500,300);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

    }
}