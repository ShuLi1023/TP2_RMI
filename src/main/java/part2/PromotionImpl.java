package part2;



import part2.entity.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PromotionImpl extends UnicastRemoteObject implements PromotionInterface {
     ArrayList<StudentImpl> students = new ArrayList<StudentImpl>();

    protected PromotionImpl() throws RemoteException {

    }
    @Override
    public void add_student(Student stu) throws RemoteException {

        StudentImpl student = new StudentImpl(stu);
        students.add(student);
    }
    @Override
    public StudentInterface get_student(String name) throws RemoteException {
        StudentInterface student = null;
        for (StudentImpl getStudent : students) {
            if (getStudent.getName().equals(name)) {
                student = getStudent;
            }
        }
        return student;
    }
    @Override
    public double promotion_score() throws RemoteException {
        double allAvgScore, allScore = 0;
        int len = students.size();
        for (StudentImpl student : students) {
            allScore += student.calculate_average();
        }
        allAvgScore = allScore / (double) len;
        return allAvgScore;
    }

}
