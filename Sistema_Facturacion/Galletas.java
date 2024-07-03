public class Galletas extends Productos{
    public void precio(){
        int cantidad = 6;
        double precio_galletas = cantidad * galleta;
        System.out.println("Galleta -----> " + cantidad + " ---> $" + precio_galletas);
        listaPrecio.add(precio_galletas);
    }
}
