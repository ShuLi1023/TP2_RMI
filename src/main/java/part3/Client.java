package part3;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;

public class Client {
    public static void main(String[] args){
        try{
            Registry registry = LocateRegistry.getRegistry(1888);
            MatrixMultiInterface m = (MatrixMultiInterface) registry.lookup( "rmi://localhost:1888/Server" );

            int[][] A = {
                    new int[]{1,2,3},
                    new int[]{1,2,3},
                    new int[]{1,2,3}
            };
            int[][] B = {
                    new int[]{1,2,3},
                    new int[]{1,2,3},
                    new int[]{1,2,3}
            };

            int[][] C = m.multi(A,B);
            for(int i=0; i <C.length; i++){
                for(int j=0; j < C[i].length; j++){
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println("\r\n");
            }

        } catch (AccessException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }
}
