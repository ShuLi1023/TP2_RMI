package part1;

import java.rmi.Naming;

class HelloServer{
    public static void main(String[] argv){
        try{
            Naming.rebind("rmi://localhost/helloServer",new Hello("Hello,world"));
            System.out.println("Hello Server is ready.");
        } catch (Exception e) {
            System.out.println("Hello Server failed: " + e);;
        }
    }
}