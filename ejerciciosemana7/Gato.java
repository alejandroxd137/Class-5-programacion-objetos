package ejerciciosemana7;

public class Gato {
    
     private int vidas;

    public Gato(String nombre, int edad, int vidas) {
        super();
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando...");
    }

    private String getNombre() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public String toString() {
        return "Gato[ " + super.toString() + ", Vidas=" + vidas + "]";
    }

    public void comer() {
        
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

}

