package ejerciciosemana7;

public class Perro {


    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super();
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau!");
    }

    private String getNombre() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public String toString() {
        return "Perro[ " + super.toString() + ", Raza=" + raza + "]";
    }

    public void comer() {
        super.comer();
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

    public void buscarPelota() {
        
        throw new UnsupportedOperationException("Unimplemented method 'buscarPelota'");
    }
    
}
