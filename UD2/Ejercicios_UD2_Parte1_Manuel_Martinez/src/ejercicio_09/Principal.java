package ejercicio_09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prec_Entradas, prec_Total, descuento;
		int num_Entradas, dia, porciento = 100;
		
		System.out.println("Hola, bienvenido a un programa que calcula el precio de entradas en un cine y aplica un descuento si es necesario.");
		System.out.println("Introduzca el precio de una entrada: ");
		prec_Entradas = Leer.datoDouble();
		System.out.println("Cuantas entradas quiere: ");
		num_Entradas = Leer.datoInt();
		System.out.println("Ahora introduzca el día de la semana: ");
		System.out.println("Lunes --> 1");
		System.out.println("Martes --> 2");
		System.out.println("Miércoles --> 3");
		System.out.println("Jueves --> 4");
		System.out.println("Viernes --> 5");
		System.out.println("Sábado --> 6");
		System.out.println("Domingo --> 7");
		dia = Leer.datoInt();
		
		if (dia == 3) {
			
			System.out.println("¡Por ser el día del espectador tienes un descuento! Introduzca el descuento: ");
			descuento = Leer.datoDouble();
			prec_Total = (prec_Entradas * num_Entradas) * (1 - descuento/porciento);
			System.out.printf("El precio total a pagar es de %.2f€", prec_Total);
			
			
		} else {
			
			prec_Total = prec_Entradas * num_Entradas;
			System.out.printf("El precio total a pagar es de %.2f€", prec_Total);
			
		}
		
	}

}
