import java.rmi.*;
import java.rmi.server.*;
public class AddImplement extends UnicastRemoteObject implements AddNum {
    public AddImplement()throws RemoteException {
        super();
    }
    public int add(int a ,int b){
        return (a+b) ;
    }
}
// When this constructor calls super(), it activates code in
// UnicastRemoteObject,
// which performs
// the RMI
// linking and
// remote object initialization.