package ejercicio_05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Ticket[] lista_Ticket;
		lista_Ticket = new Ticket[100];
		Sala s;
		Ticket t = new Ticket();
		s = new Sala(lista_Ticket, 1, 100, t);
		String cartelera = "Spiderman";
		int num_Identificativo, fila, num_Butaca, opcion, ocupacion, cant = 0;
		double precio;

		System.out.println("Bienvenido a mi cine :)");
		do {

			System.out.println("\n1. Ver cartelera");
			System.out.println("2. Comprar una entrada");
			System.out.println("3. Calcular ganancias totales");
			System.out.println("4. Comprar varias entradas");
			System.out.println("5. Modificar el precio de las entradas");
			System.out.println("0. Salir del programa");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:

				System.out.println("La película proyectada: " + cartelera);
				break;
			case 2:
				if (s.comprobar_Ocupacion_Sala(lista_Ticket)) {
					System.out.println("Introduzca su num_Identificativo");
					num_Identificativo = Leer.datoInt();
					System.out.println("Diga 1 si está ocupada o 2 si no lo está");
					ocupacion = Leer.datoInt();
					System.out.println("Diga la fila en la que quiera estar (1-12)");
					fila = Leer.datoInt();
					System.out.println("Diga el número de la butaca en la que se quiere sentar(1-12)");
					num_Butaca = Leer.datoInt();

					lista_Ticket[cant] = new Ticket(num_Identificativo, t.check_Ocupacion(ocupacion), fila, num_Butaca);
					cant++;
				} else {

					System.out.println("Diga su número de entrada (ID) a comprobar:");
					num_Identificativo = Leer.datoInt();

					if (s.comprobar_Asiento_Sala(cant, num_Identificativo)) {

						System.out.println("Vuelva a intentarlo, ese asiento está ocupado (ID ya existente).");

					} else {

						System.out.println("Introduzca su num_Identificativo");
						num_Identificativo = Leer.datoInt();
						System.out.println("Diga 1 si está ocupada o 2 si no lo está");
						ocupacion = Leer.datoInt();
						System.out.println("Diga la fila en la que quiera estar (1-12)");
						fila = Leer.datoInt();
						System.out.println("Diga el número de la butaca en la que se quiere sentar");
						num_Butaca = Leer.datoInt();

						lista_Ticket[cant] = new Ticket(num_Identificativo, t.check_Ocupacion(ocupacion), fila,
								num_Butaca);
						cant++;
						s.sumarGanancia(lista_Ticket[cant - 1].getPrecio());
						System.out.println("Entrada comprada con éxito.");
					}
				}

				break;
			case 3:

				System.out.printf("Las ganancias totales del día son: %.2f€\n", s.calcularGanancias());
				break;

			case 4:

				System.out.println("¿Cuántas entradas desea comprar?");
				int numEntradas = Leer.datoInt();

				if (numEntradas > 0 && cant + numEntradas <= lista_Ticket.length) {

					for (int i = 0; i < numEntradas; i++) {
						System.out.println("\n--- Entrada " + (i + 1) + " ---");
						System.out.println("Introduzca num_Identificativo para esta entrada:");
						num_Identificativo = Leer.datoInt();
						System.out.println("Diga 1 si está ocupada o 2 si no lo está");
						ocupacion = Leer.datoInt();
						System.out.println("Diga la fila en la que quiera estar (1-12)");
						fila = Leer.datoInt();
						System.out.println("Diga el número de la butaca en la que se quiere sentar");
						num_Butaca = Leer.datoInt();

						lista_Ticket[cant] = new Ticket(num_Identificativo, t.check_Ocupacion(ocupacion), fila,
								num_Butaca);
						cant++;
					}

					double total = s.comprarVariasEntradas(numEntradas);
					System.out.printf("Total a pagar por %d entradas: %.2f€\n", numEntradas, total);
					s.sumarGanancia(total);

				} else if (cant + numEntradas > lista_Ticket.length) {
					System.out.println("No hay suficientes asientos disponibles.");
				} else {
					System.out.println("Cantidad de entradas no válida.");
				}

				break;

			case 5:

				System.out.println("Introduzca el nuevo precio base para todas las entradas:");
				precio = Leer.datoDouble();
				s.modificarPrecioEntradas(precio);
				System.out.printf("El nuevo precio base de las entradas es: %.2f€\n", precio);

				break;

			case 0:

				System.out.println("Gracias por usar el programa");
				break;

			default:

				System.out.println("Número introducido incorrecto.");
			}

		} while (opcion != 0);

	}

}