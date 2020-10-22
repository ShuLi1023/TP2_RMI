package com.rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface StudentInterface extends Remote {

    public String getName() throws RemoteException;
    public Integer getAge() throws RemoteException;
    public String getId() throws RemoteException;
    public void setName(String name) throws RemoteException;
    public void setAge(Integer age) throws RemoteException;
    public void setId(String id) throws RemoteException;
    public void add_exam(String name,String score,String coefficient) throws RemoteException;
    public ArrayList<String> print_exams() throws RemoteException;
    public double calculate_average() throws RemoteException;
}
