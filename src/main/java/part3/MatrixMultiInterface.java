package part3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MatrixMultiInterface extends Remote {

    public int[][] multi(int[][] A, int[][] B) throws RemoteException;

}
