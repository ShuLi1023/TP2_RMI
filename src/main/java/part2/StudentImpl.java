package part2;



import part2.entity.Exam;
import part2.entity.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class StudentImpl extends UnicastRemoteObject implements StudentInterface {

    public Student student;


    public StudentImpl(Student student) throws RemoteException {
        this.student = student;
    }

    public String getName() throws RemoteException{
        return student.getName();
    }
    @Override
    public void add_exam(Exam exam) throws RemoteException {
        student.getExams().add(exam);
    }
    @Override
    public ArrayList<String> print_exams() throws RemoteException {
        ArrayList<String> examNames = new ArrayList<String>();
        int len = student.getExams().size();
        for (int i = 0;i < len; i++ ){
            examNames.add(student.getExams().get(i).getName());
        }
        return examNames;
    }
    @Override
    public double calculate_average() throws RemoteException {
        double examScore = 0;
        int len = student.getExams().size();
        for (int i = 0;i < len; i++ ){
            examScore += student.getExams().get(i).getScore()*student.getExams().get(i).getCoefficient();
        }
        return examScore;
    }
}
