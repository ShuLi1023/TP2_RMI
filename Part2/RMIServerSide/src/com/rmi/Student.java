package com.rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class Student extends UnicastRemoteObject implements StudentInterface,Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
    String id;
    Integer age;
    ArrayList<Map<String,String>> exams;
    Map<String,String> exam;


    public ArrayList<Map<String, String>> getExams() {
		return exams;
	}


	public void setExams(ArrayList<Map<String, String>> exams) {
		this.exams = exams;
	}


	public Map<String, String> getExam() {
		return exam;
	}


	public void setExam(Map<String, String> exam) {
		this.exam = exam;
	}


	public Student() throws RemoteException {
        
    }


    /*private void initializeStudents() throws RemoteException {
        Student stu1 = new Student("Sue","01",20);
        Student stu2 = new Student("Anna","02",21);
        Student stu3 = new Student("Oscar","03",22);
        stu1.add_exam("Math","90","1");
        stu1.add_exam("English","85","0");
        stu2.add_exam("Math","95","1");
        TreeSet<Student> students = new TreeSet<Student>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
    }*/



    public String getName() throws RemoteException {
        return name;
    }

    public Integer getAge() throws RemoteException {
        return age;
    }

    public String getId() throws RemoteException {
        return id;
    }

    public void setName(String name) throws RemoteException {
        this.name = name;
    }

    public void setAge(Integer age) throws RemoteException {
        this.age = age;
    }

    public void setId(String id) throws RemoteException {
        this.id = id;
    }

    public void add_exam(String name, String score, String coefficient) throws RemoteException {
        exam = new HashMap<String, String>();
        exam.put("name",name);
        exam.put("score",score);
        exam.put("coefficient",coefficient);
        exams.add(exam);
    }

    public ArrayList<String> print_exams() throws RemoteException {
        ArrayList<String> examNames = new ArrayList<String>();
        Iterator<Map<String, String>> it = exams.iterator();
        while (it.hasNext()){
            String examName = it.next().get("name");
            examNames.add(examName);
        }
        return examNames;
    }

    public double calculate_average() throws RemoteException {
        Iterator<Map<String, String>> it = exams.iterator();
        double examScore = 0, averageScore = 0;
        while (it.hasNext()){
            examScore = Double.parseDouble(it.next().get("score"));
            examScore += examScore;
        }
        averageScore = examScore/exams.size();
        return averageScore;
    }
}
