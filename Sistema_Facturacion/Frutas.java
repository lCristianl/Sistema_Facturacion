public class Frutas extends Productos{
    public void precio(){
        int cantidad = 12;
        double precio_frutas = cantidad * fruta;
        System.out.println("Fruta -------> " + cantidad + " --> $" + precio_frutas);
        listaPrecio.add(precio_frutas);
    }
}
