package ACTIVIDADEVALUATIVA;

public class Mainlibro {
    
    
public static void main(String[] args) {
    
        // Crear varios objetos Libro
        libro libro1 = new libro("el principito", "Antoine de Saint-Exupéry", "978-3-16-148410-0", 417);
        libro libro2 = new libro("El Superzorro", "Roald Dahl", "978-3-16-148410-1", 863);
        libro libro3 = new libro("La isla misteriosa", "Julio verne", "978-3-16-148410-2", 576);

        // Simular el proceso de préstamo y devolución
        System.out.println("Disponibilidad inicial:");
        System.out.println(libro1.getTitulo() + ": " + (libro1.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro2.getTitulo() + ": " + (libro2.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro3.getTitulo() + ": " + (libro3.estaDisponible() ? "Disponible" : "No disponible"));

        // Prestar libros
        libro1.prestar();
        libro2.prestar();

        System.out.println("\nDisponibilidad después de prestar:");
        System.out.println(libro1.getTitulo() + ": " + (libro1.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro2.getTitulo() + ": " + (libro2.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro3.getTitulo() + ": " + (libro3.estaDisponible() ? "Disponible" : "No disponible"));

        // Devolver libros
        libro1.devolver();
        libro2.devolver();

        System.out.println("\nDisponibilidad después de devolver:");
        System.out.println(libro1.getTitulo() + ": " + (libro1.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro2.getTitulo() + ": " + (libro2.estaDisponible() ? "Disponible" : "No disponible"));
        System.out.println(libro3.getTitulo() + ": " + (libro3.estaDisponible() ? "Disponible" : "No disponible"));
    }


      
}
