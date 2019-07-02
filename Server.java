import java.rmi.*;
import java.rmi.registry.*;
public class Server {
    public static void main(String[] args) {
        try {
            AddImplement s = new AddImplement();
            LocateRegistry.createRegistry(3000);
            Naming.rebind("Addition", s);
            System.out.println("Server is started..");
        } catch (Exception e) {
            System.out.println("Error!!"+e.getMessage());
        }
    }
}