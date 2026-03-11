package ACTIVIDADEVALUATIVA;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0, "Juan Pérez");

        // Consultar saldo inicial
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());

        // Depositar dinero
        cuenta.depositar(500.0);

        // Retirar dinero
        cuenta.retirar(200.0);

        // Consultar saldo final
        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
    
}
