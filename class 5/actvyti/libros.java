package actvyti;

public class libros {
    // Atributos
    String titulo;
    String autor;
    int paginas;

    public static void main(String[] args) {
        libros libro1 = new libros("Cien años de soledad", "Gabriel García Márquez", 417);
        libros libro2 = new libros("Don Quijote de la Mancha", "Miguel de Cervantes", 928);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }

    public libros(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + this.titulo + ", escrito por " + this.autor + ", tiene " + this.paginas + " páginas.");

  
  
  
  
  
  
  
  
  
    }


 
 
 

  //crea un constructor que reciba los 3 parametros para inicializar 
   // Crea un metodo mostrarInfo() que imprima: ”Libro: [titulo], escrito por [autor]”.
   //3. En el main, instancia dos libros diferentes y muestra su informacion.
}