package ejercicio_05;

public class Oficina {
    private Empleado[] empleados;
    private int contador;

    // Al crear la oficina, definimos cuántos empleados caben
    public Oficina(int capacidad) {
        this.empleados = new Empleado[capacidad];
        this.contador = 0;
    }

    // Método para añadir un empleado al array
    public void añadirEmpleado(Empleado e) {
        if (contador < empleados.length) {
            empleados[contador] = e;
            contador++;
        } else {
            System.out.println("Error: La oficina está llena.");
        }
    }

    // Método que calcula el sueldo de un empleado específico pasado por parámetro
    public double calcularSueldoDeUnEmpleado(Empleado e) {
        return e.calcularSueldo();
    }

    // Método que recorre el array y suma todos los sueldos
    public double calcularGastoTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += empleados[i].calcularSueldo();
        }
        return total;
    }
}
