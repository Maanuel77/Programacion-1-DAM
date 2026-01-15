package ejercicio_05;

public class Vendedor extends Empleado {
    private double ventas;
    private double incentivo;

    public Vendedor(String nombre, String apellidos, double sueldoBase, int nEmpleado, double incentivo) {
        super(nombre, apellidos, sueldoBase, nEmpleado);
        this.incentivo = incentivo;
        this.ventas = 0;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getVentas() {
        return ventas;
    }

    @Override
    public double calcularSueldo() {
        return super.getSueldoBase() + (ventas * incentivo);
    }
}
