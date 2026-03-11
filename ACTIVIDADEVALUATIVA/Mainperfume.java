package ACTIVIDADEVALUATIVA;

public class Mainperfume {
    public static void main(String[] args) {
        // Crear una instancia de Perfume
        Perfume perfume = new Perfume("Eau de Parfum", "Chanel", 50.0, 120.0);

        // Consultar cantidad inicial
        System.out.println("Cantidad inicial: " + perfume.consultarCantidadRestante() + " ml");

        // Aplicar perfume
        perfume.aplicarPerfume(10.0);

        // Consultar cantidad restante
        System.out.println("Cantidad restante: " + perfume.consultarCantidadRestante() + " ml");

        // Ajustar precio
        perfume.ajustarPrecio(150.0);
    }
}
