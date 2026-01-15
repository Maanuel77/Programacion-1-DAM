package ejercicio_05;

public class Principal {
    public static void main(String[] args) {

        Oficina miOficina = new Oficina(10);
        double objetivoVentas = 5000.0;

        Empleado eGen = new Empleado("Gonzalin", "Torreón", 1000, 1);
        Vendedor v1 = new Vendedor("Marta", "Melaguizo", 1200, 2, 0.10);
        Gerente g1 = new Gerente("Germán", "Dice", 2500, 3, 0.15);

        v1.setVentas(7000);

        miOficina.añadirEmpleado(eGen);
        miOficina.añadirEmpleado(v1);
        miOficina.añadirEmpleado(g1);

        Empleado[] listaReporte = {eGen, v1, g1};

        System.out.println("--- LISTADO DE NÓMINAS ---");
        for (Empleado e : listaReporte) {
            double sueldoFinal = miOficina.calcularSueldoDeUnEmpleado(e);
            System.out.println(e + " - Sueldo: " + sueldoFinal + "€");

            if (e instanceof Vendedor) {
                Vendedor v = (Vendedor) e;
                if (v.getVentas() > objetivoVentas) {
                    System.out.println("   >>> ¡Felicidades! Has superado el objetivo de ventas.");
                }
            }
        }

        System.out.println("\nGasto total en sueldos de la oficina: " + miOficina.calcularGastoTotal() + "€");
    }
}