public class Aceites extends Productos{
    public void precio(){
        int cantidad = 3;
        double precio_aceites = cantidad * aceite;
        System.out.println("Aceites -----> " + cantidad + " ---> $" + precio_aceites);
        listaPrecio.add(precio_aceites);
    }
    
}
