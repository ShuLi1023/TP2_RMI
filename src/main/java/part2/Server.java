package part2;




import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public Server(){
        try {
            PromotionInterface p = new PromotionImpl();
            Registry registry = LocateRegistry.createRegistry(1888);
            registry.rebind( "rmi://localhost:1888/Server" , p);
            System.out.println( "Server is ready." );
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }
    public static void main(String args[]) {
        new Server();
    }
}
