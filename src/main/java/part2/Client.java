package part2;


import part2.entity.Exam;
import part2.entity.Student;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry(1888);
            PromotionInterface p = (PromotionInterface) registry.lookup( "rmi://localhost:1888/Server" );

            Student student1 = new Student("A",27,001);
            Student student2 = new Student("B",28,002);
            p.add_student(student1);
            p.add_student(student2);

            p.get_student("A").add_exam(new Exam("Math",90,0.7));
            p.get_student("A").add_exam(new Exam("English",80,0.5));
            p.get_student("A").add_exam(new Exam("French",85,0.4));

            p.get_student("B").add_exam(new Exam("Math",95,0.7));
            p.get_student("B").add_exam(new Exam("English",85,0.5));

            System.out.println("avg score of A: " + p.get_student("A").calculate_average());
            System.out.println("avg score of B: " + p.get_student("B").calculate_average());
            System.out.println("exams of A: " + p.get_student("A").print_exams());
            System.out.println("exams of B: " + p.get_student("B").print_exams());

            System.out.println("promotion score:  " + p.promotion_score());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
    }


}
