package com.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
   
    public static void main (String[] argv) {
    	try {
            //StudentInterface s = new Student();
            PromotionInterface p = new Promotion();
            Registry registry = LocateRegistry.createRegistry(1889);
            registry.rebind( "rmi://localhost:1889/Server" , p);
            //Naming.rebind( "rmi://localhost:1889/Server" , p);
            System.out.println( "Hello Server is ready." );
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
}
