package part3;

import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try{
            MatrixMultiInterface m = new MatrixMulti();
            Registry registry = LocateRegistry.createRegistry(1888);
            registry.rebind( "rmi://localhost:1888/Server" ,m);
            System.out.println( "Server is ready." );
        } catch (AccessException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
