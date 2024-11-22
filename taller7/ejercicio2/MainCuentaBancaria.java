package taller7.ejercicio2;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0, "Ahorros");
        cuenta.setSaldo(1500.0);
        cuenta.mostrarDetalles();
    }
}