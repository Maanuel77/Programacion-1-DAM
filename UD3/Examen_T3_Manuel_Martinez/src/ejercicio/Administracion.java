package ejercicio;

import java.util.Arrays;

public class Administracion {

	private Profesor[] lista;
	private double presupuesto;

	public Administracion(Profesor[] lista, double presupuesto) {
		super();
		this.lista = lista;
		this.presupuesto = presupuesto;
	}

	public Profesor[] getLista() {
		return lista;
	}

	public void setLista(Profesor[] lista) {
		this.lista = lista;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Administracion [lista=" + Arrays.toString(lista) + ", presupuesto=" + presupuesto + "]";
	}

	public void imprimir_Menu_Administracion() {

		System.out.println("----------------------------------------");
		System.out.println("-------MENU DE POSIBLES ACCIONES--------");
		System.out.println("1. Agregar un profesor");
		System.out.println("2. Encontrar a un profesor por ID");
		System.out.println("3. Filtrar por años de antigüedad");
		System.out.println("4. Calcular gasto con filtro de años de antigüedad");
		System.out.println("5. Comprobar presupuesto");
		System.out.println("6. Modificar horas trabajadas");
		System.out.println("7. Calcular restante de presupuesto después de pagar los salarios");
		System.out.println("8. Mostrar datos de todos los profesores");
		System.out.println("9. Porcentaje gastado en un único profesor");
		System.out.println("0. Salir del programa");
		System.out.println("----------------------------------------");

	}

	public int find_By_ID(int cant, int ID) {
		for (int i = 0; i < cant; i++) {
			if (lista[i].getId() == ID) {
				return i;
			}
		}
		return -1;
	}

	public void mostrar_Profesor(int identificador) {

		Profesor p = lista[identificador];

		System.out.println("Nombre: " + p.getNombre());
		System.out.println("ID: " + p.getId());
		System.out.println("Años antigüedad: " + p.getAnios_Antiguedad());
		System.out.println("Horas trabajadas: " + p.getHoras_Trabajadas());
		System.out.println("Sueldo de este mes: " + p.getSueldo());
	}

	public void search_By_Edad(int cant, int anios_Antiguedad) {

		boolean encontrado = false;

		System.out.println("\nProfesores con " + anios_Antiguedad + " años de antigüedad o más:");
		System.out.println("----------------------------------------");

		for (int i = 0; i < cant; i++) {
			Profesor p = lista[i];
			if (p.getAnios_Antiguedad() >= anios_Antiguedad) {
				mostrar_Profesor(i);
				System.out.println("----------------------------------------");
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron profesores con esa antigüedad.");
		}
	}

	public void calcular_Gasto_Filtrado_Edad(int cant, int anios_Antiguedad) {
		double gasto_Total = 0;
		for (int i = 0; i < cant; i++) {
			if (lista[i].getAnios_Antiguedad() >= anios_Antiguedad) {
				gasto_Total += lista[i].getSueldo();
			}
		}
		System.out.printf("El gasto total en salarios para profesores con %d años o más de antigüedad es: %.2f€\n ",
				anios_Antiguedad, gasto_Total);
	}

	public void modificar_Horas_Trabajadas(int identificador, int nuevasHoras) {
		lista[identificador].setHoras_Trabajadas(nuevasHoras);
		lista[identificador].calcular_Sueldo();
		System.out.println("Horas trabajadas modificadas para " + lista[identificador].getNombre() + ". Nuevo sueldo: "
				+ lista[identificador].getSueldo() + "€");
	}

	public double calcular_Gasto_Total(int cant) {
		double gasto_Total = 0;
		for (int i = 0; i < cant; i++) {
			gasto_Total += lista[i].getSueldo();
		}
		return gasto_Total;
	}

	public void calcular_Restante_Presupuesto(int cant) {
		double gasto = calcular_Gasto_Total(cant);
		double restante = presupuesto - gasto;
		System.out.printf("Gasto total en salarios: %.2f€\n", gasto);
		System.out.printf("Presupuesto restante después de pagar salarios: %.2f€\n", restante);
	}

	public void mostrar_Datos_Todos_Profesores(int cant) {
		System.out.println("\n--- LISTA DE PROFESORES ---");
		for (int i = 0; i < cant; i++) {
			mostrar_Profesor(i);
			System.out.println("---------------------------");
		}
	}

	public void porcentaje_Gastado_Unico_Profesor(int identificador) {
		double sueldo_Profesor = lista[identificador].getSueldo();
		double porcentaje = (sueldo_Profesor / presupuesto) * 100;
		System.out.printf("El sueldo de %s (%.2f€) representa el %.2f del presupuesto total. \n",
				lista[identificador].getNombre(), sueldo_Profesor, porcentaje);
	}
	public void mostrar_Datos_Sueldo_Jamon_Chope(int cant) {
		System.out.println("\n--- LISTA DE PROFESORES ---");
		for (int i = 0; i < cant; i++) {
			if (lista[i].getSueldo() > 1200) {
				
				System.out.println(lista[i].getNombre() + ": Come Jamón :)");
				
			}else {
				
				System.out.println(lista[i].getNombre() +": Come choped :(");
				
			}
				
		}
		System.out.println("---------------------------");
	}

}