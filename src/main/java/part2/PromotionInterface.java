package part2;


import part2.entity.Student;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PromotionInterface extends Remote {

    public void add_student(Student stu) throws RemoteException;;
    public StudentInterface get_student(String name) throws RemoteException;;
    public double promotion_score() throws RemoteException;;
}
