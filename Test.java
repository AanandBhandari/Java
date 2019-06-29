
import javax.swing.*;
import java.awt.event.*;
public class Test extends JFrame {
    JLabel heading,result;
    JTextField str;
    JButton palindrome,reverse,vowel;
    Test(){}
    Test(String s){
        super(s);
    }
    public static void main(String[] args) {
        Test jf = new Test("Helloworld");
        jf.setComponents();
        jf.setVisible(true);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
    public void setComponents() {
        // heading
        setLayout(null);
        heading = new JLabel("Input any String");
        heading.setBounds(50,50,200,20);
        add(heading);
        // Input field
        str = new JTextField();
        str.setBounds(50,80,100,20);
        add(str);
        // palindrome button
        palindrome = new JButton("Find Palindrome");
        palindrome.setBounds(50, 110, 200, 20);
        add(palindrome);
        palindrome.addActionListener(new PalindromeHandler());
        // reverse button
        reverse = new JButton("Find Reverse");
        reverse.setBounds(50, 140, 200, 20);
        add(reverse);
        reverse.addActionListener(new ReverseHandler());
        // vowel button
        vowel = new JButton("Find Vowel");
        vowel.setBounds(50, 170, 200, 20);
        add(vowel);
        vowel.addActionListener(new VowelHandler());
        // result
        result = new JLabel();
        result.setBounds(50,200,200,20);
        add(result);
    }
    class PalindromeHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String s = str.getText();
            int length = s.length();
            String rev = "";
            for (int i = length - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            if (s.equals(rev)) {
                result.setText(s + " is a Palindrome");
            } else {
                result.setText(s + " is not Palindrome");
            }
        }
    }
    
    class ReverseHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = str.getText();
            int length = s.length();
            String rev = "";
            for (int i = length - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            result.setText(rev + " is a reverse of "+s);
        }
    }
    class VowelHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = str.getText();
            s.toLowerCase();
            int length = s.length();
            String vowel = "";
            for (int i = length - 1; i >= 0; i--) {
                if (s.charAt(i)=='a') {
                    vowel = vowel+"a";
                }
            }
            result.setText(vowel);
        }
    }
}