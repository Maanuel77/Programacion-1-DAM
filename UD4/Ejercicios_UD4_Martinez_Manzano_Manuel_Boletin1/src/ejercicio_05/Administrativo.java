package ejercicio_05;

public class Administrativo extends Empleado {

 public Administrativo(String nombre, String apellidos, double sueldoBase, int nEmpleado) {
     super(nombre, apellidos, sueldoBase, nEmpleado);
 }

 @Override
 public double calcularSueldo() {
     return this.sueldoBase;
 }
}
