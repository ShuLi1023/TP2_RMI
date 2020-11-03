package part2;

import part2.entity.Exam;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface StudentInterface extends Remote {

    public void add_exam(Exam exam) throws RemoteException;
    public ArrayList<String> print_exams() throws RemoteException;
    public double calculate_average() throws RemoteException;
}
