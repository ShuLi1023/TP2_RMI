package part3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MatrixMulti extends UnicastRemoteObject implements MatrixMultiInterface {
    private static final long serialVersionUID = 1L;

    public MatrixMulti() throws RemoteException {
        super();
    }

    public int[][] multi(int[][] A, int[][] B) throws RemoteException {
        int[][] C = new int [A.length][B[0].length];

        for(int row = 0; row < C.length; row++) {
            for (int col = 0; col < C[row].length; col++) {
                for(int i = 0; i < B.length; i++){
                    C[row][col] += A[row][i] * B[i][col];
                }
            }
        }
        return C;
    }
}
