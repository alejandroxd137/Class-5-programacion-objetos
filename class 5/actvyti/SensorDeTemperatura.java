package actvyti;

public class SensorDeTemperatura {
 
    // 2. Crea un m´etodo ajustar(double nuevaTemp). 
    // 3. Crea un m´etodo verificarAlerta() que imprima ”¡ALERTA en [ubicacion]!”si la temperatura supera los 45,0.
	
    String temperatura;
    String ubicacion;

    public SensorDeTemperatura(String ubicacion) {
        this.ubicacion = ubicacion;
        this.temperatura = "25.0";
    }
    
    public void ajustar(double nuevaTemp) {
        this.temperatura = String.valueOf(nuevaTemp);
    }
    
    public void verificarAlerta() {
        double temp = Double.parseDouble(this.temperatura);
        if (temp > 45.0) {
            System.out.println("¡ALERTA en " + this.ubicacion + "!");
        }
    }
	
}
