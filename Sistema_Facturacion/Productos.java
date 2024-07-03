import java.util.ArrayList;
import java.util.Scanner;

public class Productos {
    ArrayList<Double> listaPrecio = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    double aceite = 1.5;
    double galleta = 0.5;
    double chocolate = 0.9;
    double bebida = 1.1;
    double fruta = 0.25;

    public void precio(){
        System.out.println("Aceites -> $1.50");
        System.out.println("galletas -> $0.50");
        System.out.println("chocolates -> $0.90");
        System.out.println("bebidas -> $1.10");
        System.out.println("frutas -> $0.25");
                
    }
}