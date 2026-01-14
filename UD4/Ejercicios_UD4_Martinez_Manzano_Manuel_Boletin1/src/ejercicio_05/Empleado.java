package ejercicio_05;

public abstract class Empleado {
    private String nombre;
    private String apellidos;
    protected double sueldoBase;
    private int nEmpleado;

    public Empleado(String nombre, String apellidos, double sueldoBase, int nEmpleado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.nEmpleado = nEmpleado;
    }

    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (ID: " + nEmpleado + ")";
    }
}