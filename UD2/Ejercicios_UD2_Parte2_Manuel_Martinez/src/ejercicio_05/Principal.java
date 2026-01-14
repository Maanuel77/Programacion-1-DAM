package ejercicio_05;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media;
		int[] enteros;
		int tam, mayor, menor, desde, hasta, suma = 0, cant_Mayor = 1, cant_Menor = 1, posicion, cambio;
		Random r = new Random(System.nanoTime());

		System.out.println("Diga el tamaño de la cadena de enteros: ");
		tam = Leer.datoInt();
		enteros = new int[tam];
		System.out.println("Diga desde que número quieres que empiecen los aleatorios: ");
		desde = Leer.datoInt();
		System.out.println("Diga hasta que número quieres que salgan los aleatorios: ");
		hasta = Leer.datoInt();
		for (int i = 0; i < enteros.length; i++) {

			enteros[i] = r.nextInt(hasta - desde + 1) + desde;
		}

		System.out.println("Los elementos aleatorios son: ");

		for (int i = 0; i < enteros.length; i++) {

			System.out.println((i + 1) + ". " + enteros[i]);
		}

		// Suma array

		for (int i = 0; i < enteros.length; i++) {

			suma = suma + enteros[i];

		}

		System.out.println("La suma de los números del array es: " + suma);

		mayor = enteros[0];
		for (int i = 0; i < enteros.length; i++) {

			if (enteros[i] >= mayor) {
				if (mayor == enteros[i]) {

					cant_Mayor = cant_Mayor + 1;

				} else {

					mayor = enteros[i];
					cant_Mayor = 1;
				}

			}

		}

		menor = enteros[0];
		for (int i = 0; i < enteros.length; i++) {

			if (enteros[i] <= menor) {

				if (menor == enteros[i]) {

					cant_Menor = cant_Menor + 1;

				} else {

					menor = enteros[i];
					cant_Menor = 1;

				}

			}
		}

		System.out.println("El mayor de los números es: " + mayor);
		if (cant_Mayor != 1) {

			System.out.println("Se ha repetido: " + cant_Mayor + "veces");

		}

		System.out.println("El menor de los números es: " + menor);
		if (cant_Menor != 1) {

			System.out.println("Se ha repetido: " + cant_Menor + "veces");

		}

		System.out.println("Diga la posición del número que desea modificar: ");
		posicion = Leer.datoInt();
		System.out.println(
				"El número que desea modificar es el: " + enteros[posicion] + " Por qué número desea cambiarlo? ");
		cambio = Leer.datoInt();
		enteros[posicion - 1] = cambio;
		System.out.println("Se ha cambiado con éxito a: " + enteros[posicion]);
		media = (double) suma / enteros.length;
		System.out.printf("La media es: %.2f", media);
	}
}
