package com.rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PromotionInterface extends Remote {

    public void add_student(String name, String id, Integer age) throws RemoteException;;
    public Student get_student(String name) throws RemoteException;;
    public void promotion_score(String promotion) throws RemoteException;;
}
