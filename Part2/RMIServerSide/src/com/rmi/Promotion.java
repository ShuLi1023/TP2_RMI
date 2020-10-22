package com.rmi;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Promotion extends UnicastRemoteObject implements PromotionInterface,Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Student> students = new ArrayList<Student>();
    protected Promotion() throws RemoteException {
    }

    public void add_student(String name, String id, Integer age) throws RemoteException {
        Student student = new Student();
        student.setName(name);
        student.setId(id);
        student.setAge(age);
        students.add(student);
    }

    public Student get_student(String name) throws RemoteException {
        Student student = null;
        for (Student getStudent : students) {
            if (getStudent.getName().equals(name)) {
                student = getStudent;
            }
        }
        return student;
    }

    public void promotion_score(String promotion) throws RemoteException {

    }

}
