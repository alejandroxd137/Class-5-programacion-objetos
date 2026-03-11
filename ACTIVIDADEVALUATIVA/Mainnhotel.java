package ACTIVIDADEVALUATIVA;

public class Mainnhotel {
    public static void main(String[] args) {
        Hotel reserva1 = new Hotel("harry potter", "2024-07-01", "2024-07-05", 101);
        reserva1.nuevaReserva();
        reserva1.consultarReserva();
        reserva1.cancelarReserva();

        System.out.println();

        Hotel reserva2 = new Hotel("Tony Stark", "2024-08-10", "2024-08-15", 202);
        reserva2.nuevaReserva();
        reserva2.consultarReserva();
        reserva2.cancelarReserva();
    }
    
}
