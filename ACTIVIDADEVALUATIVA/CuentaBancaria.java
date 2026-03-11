package ACTIVIDADEVALUATIVA;

public class CuentaBancaria {
    //Crear una clase CuentaBancaria que represente una cuenta de banco con atributos como numero de cuenta, saldo y titular.
    // Implementar metodos para depositar, retirar dinero y consultar el saldo. 
    // Definir la clase CuentaBancaria con los atributos mencionados. • Implementar los m´etodos depositar(double cantidad)
    // retirar(double cantidad) y consultarSaldo(). • Crear instancias de la clase CuentaBancaria y realizar operaciones de 
    // deposito, retiro y consulta de saldo

    private String numeroCuenta;
 
    private double saldo;
   
     private String titular;

     //constructor
     public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
     
   
        this.numeroCuenta = numeroCuenta;

 
        this.saldo = saldo;

 
        this.titular = titular;

  

}
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Cantidad inválida para retiro o saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }
}
  

 


