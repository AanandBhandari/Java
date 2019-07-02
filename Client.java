import java.rmi.*;
import java.io.*;
public class Client {
    public static void main(String[] args) {
        try {
            String ip = "rmi://localhost/Addition";
            AddNum s = (AddNum)Naming.lookup(ip);
            System.out.println("Sum is "+s.add(1,3));
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}