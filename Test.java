// class Box {
//     private int l,b,h;
//     public void setDimensions(int l,int b,int h){
//         this.l=l;
//         this.b=b;
//         this.h=h;
//     }
//     public void getDimension(){
//         System.out.print(l);        
//         System.out.print(b);
//         System.out.print(h);
//     }
// }
// public class Test {
//     public static void main(String[] args) {
//         Box cube = new Box();
//         cube.setDimensions(2, 3, 4);
//         cube.getDimension();
//     }
// }

// wrapper Class example
// public class Test {
//     public static void main(String[] args) {
//         Integer i1 = Integer.valueOf("11",2);
//         int a = Integer.parseInt("aanand");
//         System.out.println(a);
//         System.out.println(i1.intValue());
//     }
// }
// package test;
// public class Test {
//     public static void main(String[] args) {
//         System.out.println("helloworld");
//     }
// }

// inheritance
// public class Test {
//     public static void main(String[] args) {
//         Student S1 = new Student();
//         S1.setRoll(2);
//         S1.setAge(10);
//         S1.setName("Aanand");
//         System.out.println(S1.getAge());
//         System.out.println(S1.getName());
//         System.out.println(S1.getRoll());

//     }
// }

// constructor inheritance
// class A {
//     public A () {
//         System.out.println("hello from the A");
//     }
    
// }
// class B extends A{
//     public B() {
//         System.out.println("hello from the B");
//     }
// }
// class Test {
//     public static void main(String[] args) {
//         new B();
//     }
// }
// swing example
// import javax.swing.*;
// public class Test {
//     public static void main(String[] args) {
//         JFrame jf = new JFrame("Swing Example");
//         jf.setVisible(true);
//         jf.setSize(300,300);
//         jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
//     }
// }
// another way
import javax.swing.*;

public class Test extends JFrame {
    public Test(){}
    public Test(String s){
        super(s);
    }
    public static void main(String[] args) {
        Test jf = new Test("Swing Example");
        jf.setVisible(true);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
}