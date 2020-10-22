package com.rmi;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.*;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
    String name;
    String id;
    Integer age;
    ArrayList<Map<String,String>> exams;
    Map<String,String> exam;


    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



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