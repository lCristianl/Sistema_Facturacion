public class Chocolates extends Productos{
    public void precio(){
        int cantidad = 5;
        double precio_chocolates = cantidad * chocolate;
        System.out.println("Chocolates --> " + cantidad + " ---> $" + precio_chocolates);
        listaPrecio.add(precio_chocolates);
    }
}
