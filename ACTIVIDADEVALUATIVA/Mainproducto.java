package ACTIVIDADEVALUATIVA;

public class Mainproducto {
    public static void main(String[] args) {
        // Crear una instancia de Producto
        Producto producto = new Producto("Laptop", 101, 10, 1500.0);

        // Mostrar información del producto
        System.out.println(producto.toString());

        // Agregar stock
        producto.agregarStock(5);
        System.out.println("Después de agregar stock: " + producto.toString());

        // Reducir stock
        producto.reducirStock(3);
        System.out.println("Después de reducir stock: " + producto.toString());

        // Calcular valor del inventario
        double valorInventario = producto.calcularValorInventario();
        System.out.println("Valor del inventario: $" + valorInventario);
    }
}
