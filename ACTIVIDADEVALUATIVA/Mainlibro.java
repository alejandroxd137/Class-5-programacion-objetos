package ACTIVIDADEVALUATIVA;

public class Mainlibro {
    
    public static void Main(String[] args) {
        // Crear varios objetos Libro
        libro libro1 = new libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-0", 417);
        libro libro2 = new libro("1984", "George Orwell", "978-0-452-28423-4", 328);
        libro libro3 = new libro("El Principito", "Antoine de Saint-Exupéry", "978-0-15-601219-5", 96);

        // Simular el proceso de préstamo y devolución
        System.out.println("Disponibilidad inicial:");
        System.out.println(libro1.getTitulo() + ": " + (libro1.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro2.getTitulo() + ": " + (libro2.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro3.getTitulo() + ": " + (libro3.estaDisponible() ? "Disponible" : "No disponible"));

        // Prestar libros
        libro1.prestar();
        libro2.prestar();

        System.out.println("\nDisponibilidad después de prestar algunos libros:");
        System.out.println(libro1.getTitulo() + ": " + (libro1.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro2.getTitulo() + ": " + (libro2.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro3.getTitulo() + ": " + (libro3.estaDisponible() ? "Disponible" : "No disponible"));

        // Devolver un libro
        libro1.devolver();

        System.out.println("\nDisponibilidad después de devolver un libro:");
        System.out.println(libro1.getTitulo() + ": " + (libro1.estaDisponible() ? "Disponible" : "No disponible"));
    }
    
}

