package part1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Hello extends UnicastRemoteObject implements HelloInterface{
    private String message;

    public Hello (String msg) throws RuntimeException, RemoteException {
        super();
        message = msg;
    }

    public String say() throws RemoteException{
        return message;
    }
}


