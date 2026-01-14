package ejercicio_05;

public class Gerente extends Empleado {
    private double impuesto;

    public Gerente(String nombre, String apellidos, double sueldoBase, int nEmpleado, double impuesto) {
        super(nombre, apellidos, sueldoBase, nEmpleado);
        this.impuesto = impuesto;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * (1 - impuesto);
    }
}