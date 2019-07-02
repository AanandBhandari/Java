import java.rmi.*;
public interface AddNum extends Remote {
    // RemoteException represents communication-related exceptions that may occur
    // during the execution ofba remote method call.
    public int add(int a ,int b) throws RemoteException;
}