package ejercicio_06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota_1, nota_2, nota_3, media, aprobado = 5;
		
		System.out.println("Hola bienvenido, este programa calcula la nota media de 3 calificaciones.");
		
		System.out.println("Introduzca la primera nota: ");
		nota_1 = Leer.datoDouble();
		System.out.println("Introduzca la segunda nota: ");
		nota_2 = Leer.datoDouble();
		System.out.println("Introduzca la tercera nota: ");
		nota_3 = Leer.datoDouble();
		
		media = (nota_1 + nota_2 + nota_3)/3;
		
		if (media >= aprobado){
			
			System.out.printf("El alumno está aprobado con una media de %.2f", media);
			
		} else {
			
			System.out.printf("El alumno está suspenso con una nota de %.2f", media);
			
		}
		
	}
}
