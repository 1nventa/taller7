package taller7.ejercicio1;
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.nombre = "Juan";
        empleado.setSalario(5000);
        
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());
    }
}