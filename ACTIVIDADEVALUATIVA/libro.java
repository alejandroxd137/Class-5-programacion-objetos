package ACTIVIDADEVALUATIVA;


//Implementar una clase Libro que represente un libro en una biblioteca con atributos como tıtulo, autor, ISBN, y numero de paginas. 
// Crear m´etodos para prestar el libro, devolverlo y verificar si esta disponible.
// Definirla clase Libro con atributos como titulo, autor, ISBN, numeroPaginas y disponible. 
//  Implementar los m´etodos prestar(), devolver() y estaDisponible(). • Crear varios objetos Libro y simular el proceso de prestamo y 
// devolucion
public class libro{
    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private boolean disponible;

    public libro(String titulo, String autor, String ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true; // Inicialmente el libro está disponible
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba disponible.");
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    // Getters para los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}