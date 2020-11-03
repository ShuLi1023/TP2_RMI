package part1;

class HelloClient{
    public static void main (String[] args){
        HelloInterface hello;
        String name = "rmi://localhost/HelloServer";
        try{

        }catch(Exception e){
            System.out.println("HelloClient exception: "+e);
        }
    }
}