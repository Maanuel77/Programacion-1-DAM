package ejercicio_05;

public class Principal {
    public static void main(String[] args) {

    	Oficina miOficina = new Oficina(5);
        double objetivoVentas = 10000.0;

        Administrativo empGenerico = new Administrativo("Ángel", "DiosProgramador", 1200.0, 1);
        
        Vendedor v1 = new Vendedor("German", "Díaz", 1100.0, 2, 0.10);
        v1.setVentas(15000.0);
        
        Vendedor v2 = new Vendedor("Marta", "Melguizo", 1100.0, 3, 0.10);
        v2.setVentas(5000.0);
        
        Gerente g1 = new Gerente("Gonzalin", "Torrealladodelarroyo", 3000.0, 4, 0.21);

        miOficina.añadirEmpleado(empGenerico);
        miOficina.añadirEmpleado(v1);
        miOficina.añadirEmpleado(v2);
        miOficina.añadirEmpleado(g1);

        Empleado[] nomina = {empGenerico, v1, v2, g1};

        System.out.println("    LISTADO DE NÓMINAS Y OBJETIVOS    ");
        System.out.println("--------------------------------------");

        for (Empleado e : nomina) {
            double sueldoFinal = miOficina.calcularSueldoDeUnEmpleado(e);
            
            System.out.println("Empleado: " + e.toString());
            System.out.println("Sueldo a recibir: " + sueldoFinal + "€");

            if (e instanceof Vendedor) {
                Vendedor v = (Vendedor) e;
                if (v.getVentas() > objetivoVentas) {
                    System.out.println("-- Has superado el objetivo de " + objetivoVentas + "€");
                }
            }
            System.out.println("--------------------------------------");
        }

        double gastoTotal = miOficina.calcularGastoTotal();
        System.out.println("GASTO TOTAL EN SUELDOS: " + gastoTotal + "€");
    }
}