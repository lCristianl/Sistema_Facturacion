public class Bebidas extends Productos{
    public void precio(){
        int cantidad = 2;
        double precio_bebidas = cantidad * bebida;
        System.out.println("Bebida ------> " + cantidad + " ---> $" + precio_bebidas);
        listaPrecio.add(precio_bebidas);
    }
}
