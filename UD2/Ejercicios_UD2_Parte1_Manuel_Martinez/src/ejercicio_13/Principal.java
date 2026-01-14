package ejercicio_13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia;
		
		System.out.println("Está ante un programa que te dice que día de la semana es según el número que introduzcas.");
		System.out.println("Introduzca un número del 1-7");
		dia = Leer.datoInt();
		
		switch (dia) {
		
		case 1:
			
			System.out.println("Lunes");
			break;
		case 2:
			
			System.out.println("Martes");
			break;
		case 3:
			
			System.out.println("Miércoles");
			break;
		case 4:
		
			System.out.println("Jueves");
			break;
		case 5:
			
			System.out.println("Viernes");
			break;
		case 6:
			
			System.out.println("Sábado");
			break;
		case 7:
			
			System.out.println("Domingo");
			break;
		default:
		
			System.out.println("Número incorrecto.");
		}
		
	}

}
