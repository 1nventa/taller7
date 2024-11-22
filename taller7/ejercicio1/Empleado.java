package taller7.ejercicio1;
public class Empleado {
    public String nombre;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }
}