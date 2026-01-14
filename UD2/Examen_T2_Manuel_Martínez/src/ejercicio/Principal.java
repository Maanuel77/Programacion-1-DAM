package ejercicio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int litros[];
		double media, porcentaje;
		int tam, opcion, hasta, desde, modificar, nuevo_Modif, dias_Lluvia = 0, suma = 0, cien = 100, quince = 15,
				mayor, cant = 1;
		Random r = new Random(System.nanoTime());

		System.out.println("Hola, bienvenido a un programa que muestra los datos recogidos de la lluvia.");
		System.out.println("Indique cuántos días ha estado midiendo la lluvia.");
		tam = Leer.datoInt();
		litros = new int[tam];
		System.out.println("Indique desde que cantidad de litros desea comenzar a llenar. ");
		desde = Leer.datoInt();
		System.out.println("Indique hasta que cantidad de litros desea poder llenar en un día. ");
		hasta = Leer.datoInt();

		for (int i = 0; i < litros.length; i++) {

			litros[i] = r.nextInt(hasta - desde + 1) + desde;
		}

		do {

			System.out.println("\n\n1. Mostrar tabla de lluvias. " + "\n2. Modificar litros lluvia"
					+ "\n3. Mostrar número de días" + "\n4. Media de lluvia" + "\n5. Porcentaje de lluvia"
					+ "\n6. Día que más ha llovido y cuántos días lo ha hecho" + "\n7. Repetir con otros números"
					+ "\n0. Salir del programa");
			opcion = Leer.datoInt();
			switch (opcion) {

			case 1:
				System.out.print("Día\tLitros");
				for (int i = 0; i < litros.length; i++) {

					System.out.printf("\n%d\t  %d", (i + 1), litros[i]);
				}
				break;

			case 2:
				for (int i = 0; i < litros.length; i++) {

					System.out.println((i + 1) + ". " + litros[i]);

				}
				System.out.println("Diga que día desea modificar ");
				modificar = Leer.datoInt();
				while (modificar < litros.length) {
					System.out.println("El día " + modificar + " llovió una cantidad de " + litros[modificar - 1]
							+ "L, por cuántos litros deseas cambiar esa cantidad?");
					nuevo_Modif = Leer.datoInt();
					litros[modificar - 1] = nuevo_Modif;
					System.out.println("Ha cambiado exitosamente la cantidad de lluvia del día " + modificar + " por "
							+ litros[modificar - 1] + " Litros");
					modificar = 1384783;
				}
				if (modificar == 1384783) {
					
				}else {
				System.out.println(
						"El día no está guardado en el programa, vuelva a introducir uno que esté dentro del alcance del array");
				}
				break;

			case 3:

				for (int i = 0; i < litros.length; i++) {

					if (litros[i] != 0) {

						dias_Lluvia = dias_Lluvia + 1;

					}

				}

				System.out.println("Ha llovido " + dias_Lluvia + " días");
				break;

			case 4:

				for (int i = 0; i < litros.length; i++) {

					suma = suma + litros[i];

				}

				media = (double) suma / litros.length;
				System.out.printf("Ha llovido una media de %.2f L por día", media);
				break;

			case 5:
				for (int i = 0; i < litros.length; i++) {

					System.out.println((i + 1) + ". " + litros[i]);

				}
				System.out.println("Diga del día que desea saber el porcentaje: ");
				modificar = Leer.datoInt();
				porcentaje = (litros[modificar - 1] * (double) cien) / (double) quince;
				System.out.printf("El día %d llovió un %.2f porciento de lo normal para estas fechas.", modificar,
						porcentaje);
				break;

			case 6:

				mayor = litros[0];
				for (int i = 0; i < litros.length; i++) {

					if (litros[i] >= mayor) {

						if (litros[i] == mayor) {

							cant++;

						} else {

							mayor = litros[i];
							cant = 1;

						}

					}

				}
				System.out.println("La mayor cantidad de agua registrada se ha registrado " + cant
						+ " días y es una cantidad de " + mayor);
				break;

			case 7:

				for (int i = 0; i < litros.length; i++) {

					litros[i] = r.nextInt(hasta - desde + 1) + desde;
				}
				break;

			case 0:

				System.out.println("Gracias por usar el programa :) ");
				break;

			default:

				System.out.println("El número introducido no es una opción del programa, elija un número del válido.");
				break;
			}

		} while (opcion != 0);

	}

}
