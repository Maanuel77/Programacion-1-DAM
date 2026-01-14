package ejercicio;

public class GestionFamiliar {

    private Hijo[] lista;
    private double presupuesto;

    public GestionFamiliar(Hijo[] lista, double presupuesto) {
        super();
        this.lista = lista;
        this.presupuesto = presupuesto;
    }

    public Hijo[] getLista() {
        return lista;
    }

    public void setLista(Hijo[] lista) {
        this.lista = lista;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void imprimirMenu() {
        System.out.println("\n--- GESTIÓN FAMILIAR ---");
        System.out.println("1. Agregar un hijo");
        System.out.println("2. Buscar hijo por ID");
        System.out.println("3. Buscar hijos menores de 14 años");
        System.out.println("4. Calcular gasto en hijos mayores de 14 años");
        System.out.println("5. Modificar horas estudiadas de un hijo");
        System.out.println("6. Calcular presupuesto restante");
        System.out.println("7. Mostrar datos de todos los hijos");
        System.out.println("8. Calcular porcentaje del presupuesto gastado en un hijo");
        System.out.println("9. Comprobar paga (chuches/pipas)");
        System.out.println("0. Salir");
        System.out.println("---------------------------------");
    }

    public boolean agregar(Hijo h, int cont) {
        if (cont < lista.length) {
            lista[cont] = h;
            return true;
        }
        return false;
    }

    public Hijo buscarById(int id, int cant) {
        for (int i = 0; i < cant; i++) {
            if (lista[i].getId() == id) {
                return lista[i];
            }
        }
        return null;
    }

    public Hijo[] buscarByEdad(int cant, int introducir_Menores) {
        int contadorMenores = 0;
        for (int i = 0; i < cant; i++) {
            if (lista[i].getEdad() < introducir_Menores) {
                contadorMenores++;
            }
        }

        Hijo[] menores = new Hijo[contadorMenores];
        int indexMenores = 0;
        for (int i = 0; i < cant; i++) {
            if (lista[i].getEdad() < introducir_Menores) {
                menores[indexMenores] = lista[i];
                indexMenores++;
            }
        }
        return menores;
    }

    public double calcularGasto(int cant, int introducir_Menores) {
        double gastoTotal = 0;
        for (int i = 0; i < cant; i++) {
            if (lista[i].getEdad() > introducir_Menores) {
                gastoTotal += lista[i].getPagaSemanal();
            }
        }
        return gastoTotal;
    }

    public boolean modificar(int id, int nuevasHoras, int cant, double cantPorHora, double porcBote) {
        Hijo h = buscarById(id, cant);
        if (h != null) {
            h.setHoras_estudiadas(nuevasHoras);
            h.calcularPaga(cantPorHora, porcBote);
            return true;
        }
        return false;
    }
    
    private double calcularGastoTotal(int cant) {
        double gastoTotal = 0;
        for (int i = 0; i < cant; i++) {
            gastoTotal += lista[i].getPagaSemanal();
        }
        return gastoTotal;
    }
 
    public double calcularResto(int cant) {
        double gasto = calcularGastoTotal(cant);
        return presupuesto - gasto;
    }

    public Hijo[] mostrarDatos(int cant) {
        Hijo[] todos = new Hijo[cant];
        System.arraycopy(lista, 0, todos, 0, cant);
        return todos;
    }

    public double calcularPorcentaje(int id, int cant) {
        Hijo h = buscarById(id, cant);
        if (h != null) {
            if (presupuesto > 0) {
                 return (h.getPagaSemanal() / presupuesto) * 100;
            } else {
                return 0; 
            }
        }
        return -1;
    }

    public String comprobarPaga(int id, int cant) {
        Hijo h = buscarById(id, cant);
        if (h != null) {
            if (h.getPagaSemanal() > 10) {
                return "tengo para chuches";
            } else {
                return "ni para pipas";
            }
        }
        return null;
    }
}