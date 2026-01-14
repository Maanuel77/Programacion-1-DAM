package ejercicio_05;

public class Oficina {
    private Empleado[] empleados;
    private int contador;

    public Oficina(int capacidad) {
        this.empleados = new Empleado[capacidad];
        this.contador = 0;
    }

    public void añadirEmpleado(Empleado e) {
        if (contador < empleados.length) {
            empleados[contador] = e;
            contador++;
        } else {
            System.out.println("Error: La oficina está llena.");
        }
    }

    public double calcularSueldoDeUnEmpleado(Empleado e) {
        return e.calcularSueldo();
    }

    public double calcularGastoTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += empleados[i].calcularSueldo();
        }
        return total;
    }
}
