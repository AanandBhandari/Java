class A extends Thread {
    public void run() {
        for(int i = 0;i<=10;i++) {
            System.out.println("thread A"+i);
        }
    }
}
class B extends Thread {
    public void run() {
        for(int i = 0;i<=10;i++) {
            System.out.println("thread B"+i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        A a  = new A();
        B b = new B();
        b.start();
        a.start();
    }
}