package ejercicio_25_a;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cant, pisos = 0, num = 0;

		System.out.println("Hola, bienvenido a mi programa que hace una pirámide de números");
		System.out.println("Introduzca el número de pisos de la pirámide: ");
		cant = Leer.datoInt();

		while (cant != pisos) {
			pisos = pisos + 1;
			while (pisos != num) {

				num = num + 1;
				System.out.println("");
				for (int i = 0; i < num; i++) {

					System.out.printf("*");

				}
			}
		}
	}
}