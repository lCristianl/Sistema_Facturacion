import java.util.ArrayList;

public class Imprimir_Factura{
    public static void main(String[] args) {

        ArrayList<Double> listaPrecioTotal = new ArrayList<>();

        System.out.println("----------PRECIOS PRODUCTOS----------");
        Productos productos = new Productos();
        productos.precio();

        System.out.println("---------------FACTURA---------------");
        System.out.println("Producto | Cantidad | Precio");
        System.out.println("");
        Productos aceites = new Aceites();
        aceites.precio();
        listaPrecioTotal.addAll(aceites.listaPrecio);
        
        Productos galletas = new Galletas();
        galletas.precio();
        listaPrecioTotal.addAll(galletas.listaPrecio);

        Productos chocolates = new Chocolates();
        chocolates.precio();
        listaPrecioTotal.addAll(chocolates.listaPrecio);

        Productos bebidas = new Bebidas();
        bebidas.precio();
        listaPrecioTotal.addAll(bebidas.listaPrecio);

        Productos frutas = new Frutas();
        frutas.precio();
        listaPrecioTotal.addAll(frutas.listaPrecio);

        double total = 0.0, subtotal = 0.0, iva = 15.2;

        for (double valor : listaPrecioTotal){
            subtotal += valor;
        }

        System.out.println("");
        double iva_productos = (subtotal * iva) / 100; 
        total = subtotal + iva_productos;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("El iva de 15.2% es: $" + (double)Math.round(iva_productos * 100d) / 100d);
        System.out.println("Total: $" + (double)Math.round(total * 100d) / 100d); 
        
    }
    
}
