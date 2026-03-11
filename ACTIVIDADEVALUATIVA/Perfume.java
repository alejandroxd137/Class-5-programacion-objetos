package ACTIVIDADEVALUATIVA;

public class Perfume {
 //Implementar una clase Perfume que represente un perfume con atributos como nombre, marca, capacidad (en mililitros), y precio. Crear metodos para aplicar el perfume 
 // (reducir la cantidad disponible) consultar la cantidad restante y ajustar el precio. 
 //Definir la clase Perfume con atributos como nombre, marca, capacidad, y precio. 
 // Implementar los metodos aplicarPerfume(double cantidad), consultarCantidadRestante() y ajustarPrecio(double nuevoPrecio). 
 //Crear objetos Perfume y simular el uso del perfume y ajustes en el precio.
private String nombre;
    private String marca;
    private double capacidad; // en mililitros
    private double precio;

    public Perfume(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void aplicarPerfume(double cantidad) {
        if (cantidad > 0 && cantidad <= capacidad) {
            capacidad -= cantidad;
            System.out.println("Se ha aplicado " + cantidad + " ml de perfume. Cantidad restante: " + capacidad + " ml.");
        } else {
            System.out.println("Cantidad inválida para aplicar perfume.");
        }
    }

    public double consultarCantidadRestante() {
        return capacidad;
    }

    public void ajustarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            precio = nuevoPrecio;
            System.out.println("El precio del perfume ha sido ajustado a: $" + precio);
        } else {
            System.out.println("Precio inválido.");
        }
    }

    // Getters para los atributos
    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public double getPrecio() {
        return precio;
    }



}
