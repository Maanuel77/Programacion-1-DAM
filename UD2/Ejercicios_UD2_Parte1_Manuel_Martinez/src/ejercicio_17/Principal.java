package ejercicio_17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota, media;
		int suspensos = 0;

		System.out.println(
				"Hola, está ante un programa que calcula la nota media de un alumno y el número de suspensos.");
		System.out.println("Introduzca la primera nota.");
		nota = Leer.datoDouble();
		if (nota < 5) {

			suspensos = suspensos + 1;

		}
		media = nota;
		System.out.println("Introduzca la segunda nota.");
		nota = Leer.datoDouble();
		if (nota < 5) {

			suspensos = suspensos + 1;

		}
		media = media + nota;
		System.out.println("Introduzca la tercera nota.");
		nota = Leer.datoDouble();
		if (nota < 5) {

			suspensos = suspensos + 1;

		}
		media = media + nota;
		System.out.println("Introduzca la cuarta nota.");
		nota = Leer.datoDouble();
		if (nota < 5) {

			suspensos = suspensos + 1;

		}
		media = media + nota;
		System.out.println("Introduzca la quinta nota.");
		nota = Leer.datoDouble();
		if (nota < 5) {

			suspensos = suspensos + 1;

		}
		media = media + nota;
		System.out.println("Introduzca la sexta nota.");
		nota = Leer.datoDouble();
		if (nota < 5) {

			suspensos = suspensos + 1;

		}
		media = media + nota;

		media = media / 6;

		if (suspensos == 0) {

			System.out.printf("El alumno no ha suspendido ninguna asignatura y su nota media es de: %.2f", media);

		} else {

			System.out.printf("El alumno ha suspendido %d asignaturas y su nota media es de %.2f", suspensos, media);

		}

	}

}
