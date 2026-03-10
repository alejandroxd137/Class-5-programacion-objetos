package actvyti;

public class Perfildeusario {
     String usuario;
    int seguidores = 0;
    String correo;

  
    public Perfildeusario(String usuario, int seguidores, String correo) {

        this.usuario = usuario;
        this.seguidores = seguidores;
        this.correo  = correo;


  }


    public void mostrarInfo() {
        System.out.println("Nombre: " + this.usuario + ", Seguidores: " + this.seguidores + ", Correo: " + this.correo);}
    
    
  
  
 // Crea un metodo nuevoSeguidor() que incremente el contador en 1 cada vez que se llame.
 
    public void nuevoSeguidor() {
        this.seguidores++;

    }
}
    
//En el main, crea al usuario ”JavaCoderτ simula que gana 3 seguidores.

 class Main { 
    public static void main(String[] args) {
        Perfildeusario usuario = new Perfildeusario("JavaCoder", 0, "javacoder@example.com");
        usuario.mostrarInfo();
        usuario.nuevoSeguidor();
        usuario.nuevoSeguidor();
        usuario.nuevoSeguidor();
        usuario.mostrarInfo();
    }
}