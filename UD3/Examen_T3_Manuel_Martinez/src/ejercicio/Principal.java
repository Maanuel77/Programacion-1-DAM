package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, ID = 1, anios_Antiguedad, horas_Trabajadas, cont = 0, encontrar_ID, identificador, encontrar_Edad;
		String nombre;
		
		Profesor[] lista;
		lista = new Profesor[50];
		Administracion a;
		a = new Administracion(lista, 20000);
		System.out.println("Bienvenido a mi programa :)");

		do {

			a.imprimir_Menu_Administracion();
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
				case 1:
					
					System.out.println("Diga el nombre del profesor que desee añadir: ");
					nombre = Leer.dato();
					System.out.println("Diga los años de antigüedad de ese profesor");
					anios_Antiguedad = Leer.datoInt();
					System.out.println("Diga las horas trabajadas de ese profesor");
					horas_Trabajadas = Leer.datoInt();
					
					lista [cont] = new Profesor (nombre, ID, anios_Antiguedad, horas_Trabajadas);
					lista [cont].calcular_Sueldo();
					
					System.out.println("ID "+ nombre+" : " + ID);
					
					ID++;
					cont++;
					
					System.out.println(nombre+": Agregado con éxito.");
					break;
					
				case 2:
					System.out.println("Diga el ID que quiera encontrar: ");
					encontrar_ID = Leer.datoInt();
					identificador = a.find_By_ID(cont, encontrar_ID);
					if (identificador != -1) {
						a.mostrar_Profesor(identificador);
					} else {
						System.out.println("Profesor con ID " + encontrar_ID + " no encontrado.");
					}
					break;
					
				case 3:
					
					System.out.println("Diga la edad por la que desea filtrar:");
					encontrar_Edad = Leer.datoInt();
					a.search_By_Edad(cont, encontrar_Edad);
					break;
				case 4:
					
					System.out.println("Diga la edad mínima para el cálculo de gasto:");
					encontrar_Edad = Leer.datoInt();
					a.calcular_Gasto_Filtrado_Edad(cont, encontrar_Edad);
					break;
				case 5:
					a.mostrar_Datos_Sueldo_Jamon_Chope(cont);
					break;
				case 6:
					System.out.println("Diga el ID del profesor al que desea modificar las horas trabajadas:");
					encontrar_ID = Leer.datoInt();
					identificador = a.find_By_ID(cont, encontrar_ID);
					if (identificador != -1) {
						System.out.println("Diga las nuevas horas trabajadas:");
						horas_Trabajadas = Leer.datoInt();
						a.modificar_Horas_Trabajadas(identificador, horas_Trabajadas);
					} else {
						System.out.println("Profesor con ID " + encontrar_ID + " no encontrado.");
					}
					break;
				case 7:
					a.calcular_Restante_Presupuesto(cont);
					break;
				case 8:
					a.mostrar_Datos_Todos_Profesores(cont);
					break;
				case 9:
					System.out.println("Diga el ID del profesor para calcular el porcentaje gastado:");
					encontrar_ID = Leer.datoInt();
					identificador = a.find_By_ID(cont, encontrar_ID);
					if (identificador != -1) {
						a.porcentaje_Gastado_Unico_Profesor(identificador);
					} else {
						System.out.println("Profesor con ID " + encontrar_ID + " no encontrado.");
					}
					break;
				case 0:
					System.out.println("Saliendo del programa. Que tengas un buen día :)");
					break;
				default:
					System.out.println("Opción no válida. Intente de nuevo.");
			}
		} while (opcion != 0);
	}
}
