package ACTIVIDADEVALUATIVA;

public class Hotel {
    //Desarrollar una clase ReservaHotel que permita gestionar las reservas en un hotel. La clase debe incluir atributos como el nombre del cliente, fecha de entrada,
    //  fecha de salida, y numero de habitacion. Implementar metodos para crear una nueva reserva, cancelar una reserva y consultar la informacion de la reserva. 
 //Crear la clase ReservaHotel con los atributos correspondientes. 
// Implementar los metodos nuevaReserva(), cancelarReserva() y consultarReserva(). 
 //Crear varios objetos ReservaHotel y simular el proceso de gestion de reservas en un hotel.

  private String nombreCliente;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroHabitacion;

    public Hotel(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroHabitacion) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
    }

    public void nuevaReserva() {
        System.out.println("Reserva creada para " + nombreCliente + " en la habitación " + numeroHabitacion +
                " desde " + fechaEntrada + " hasta " + fechaSalida);
    }

    public void cancelarReserva() {
        System.out.println("Reserva cancelada para " + nombreCliente + " en la habitación " + numeroHabitacion);
    }

    public void consultarReserva() {
        System.out.println("Información de la reserva:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha de entrada: " + fechaEntrada);
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("Número de habitación: " + numeroHabitacion);
    }
}
