package ejercicio_14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes, bisiesto;
		
		
		System.out.println("Está ante un programa que te dice cuántos días tiene cada mes.");
		System.out.println(" "
				+ "Enero --> 1"
				+ "\n Febrero --> 2"
				+ "\n Marzo --> 3"
				+ "\n Abril --> 4"
				+ "\n Mayo --> 5"
				+ "\n Junio --> 6"
				+ "\n Julio --> 7"
				+ "\n Agosto --> 8"
				+ "\n Septiembre --> 9"
				+ "\n Octubre --> 10"
				+ "\n Noviembre --> 11"
				+ "\n Diciembre --> 12");
		mes = Leer.datoInt();
		
		switch (mes) {
		
		case 1:
			
			System.out.println("En enero hay 31 días.");
			break;
		case 2:
			
			System.out.println("Es año bisiesto? "
					+ "\n 1 sí"
					+ "\n 2 no");
			bisiesto = Leer.datoInt();
			if (bisiesto == 1) {
				
				System.out.println("El mes tiene 29 días.");
			
			}
			if (bisiesto == 2) {
				
				System.out.println("El mes tiene 28 días.");
			}else {
				
				System.out.println("Número incorrecto, introduzca otro número distinto.");
			}
			break;
		case 3:
			
			System.out.println("El mes tiene 31 días.");
			break;
		case 4:
		
			System.out.println("El mes tiene 30 días.");
			break;
		case 5:
			
			System.out.println("El mes tiene 31 días.");
			break;
		case 6:
			
			System.out.println("El mes tiene 30 días.");
			break;
		case 7:
			
			System.out.println("El mes tiene 31 días.");
			break;
			
		case 8:
			
			System.out.println("El mes tiene 31 días.");
			break;
		case 9:
			
			System.out.println("El mes tiene 30 días.");
			break;
		case 10:
			
			System.out.println("El mes tiene 31 días.");
			break;
		case 11:
			
			System.out.println("El mes tiene 30 días.");
			break;
		case 12:
		default:
		
			System.out.println("Número incorrecto, vuelva a introducirlo.");
		}
		
	}

}

