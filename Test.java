class A implements Runnable {
    public void run() {
        for(int i=0;i<=10;i++) {
            System.out.println("thread A "+i);
        }
    }
}
class B implements Runnable {
    public void run() {
        for(int i = 0 ;i<=10;i++) {
            System.out.println("thread B" + i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Thread a = new Thread(new A());
        Thread b = new Thread(new B());
        a.start();
        b.start();
    }

}