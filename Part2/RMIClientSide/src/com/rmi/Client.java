package com.rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
    	try {
    		Registry registry = LocateRegistry.getRegistry(1889);
            //PromotionInterface p = (PromotionInterface) Naming.lookup( "rmi://localhost:1889/Server" );
    		PromotionInterface p = (PromotionInterface) registry.lookup( "rmi://localhost:1889/Server" );

            p.add_student("shu","1000",30);
            System.out.println(p.get_student("shu"));
            p.get_student("shu").add_exam("math","90","1");
            System.out.println(p.get_student("shu").print_exams());
			
		} catch (NotBoundException e) {
		    e.printStackTrace();
		} catch (RemoteException e) {
		    e.printStackTrace();
		}
        
    }
}
