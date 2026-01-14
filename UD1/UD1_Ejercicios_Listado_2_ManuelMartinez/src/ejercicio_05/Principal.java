package ejercicio_05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		double mantenimiento, intereses, dinero, dinero_Mant, dinero_Inter, dinero_Final;
		int porciento = 100;

		
		System.out.println ("Está ante un programa que calcula el beneficio saldo final que tendrá al abrir una cuenta en el banco: ");
		System.out.println ("Introduzca su nombre: ");
		nombre = Leer.dato();
		System.out.println ("Primero introduzca la cantidad de dinero inicial con la que abrió la cuenta del banco. ");
		dinero = Leer.datoDouble();
		System.out.println ("Ahora introduzca el mantenimiento de la cuenta: ");
		mantenimiento = Leer.datoDouble();
		System.out.println ("Ahora los intereses generados durante el año: ");
		intereses = Leer.datoDouble();
		
		dinero_Mant = dinero * (mantenimiento/porciento);
		dinero_Inter = dinero * (intereses/porciento);
		dinero_Final = dinero - dinero_Mant + dinero_Inter;
		
		
		System.out.printf("\nHola %s\nUsted ingresó a principios de año: %.0f €\n -------------------------------------------\n\n"
				+ "- Mantenimiento %.0f  ----> - %.2f €\n"
				+ "- Intereses     %.0f  ----> + %.2f €\n"
				+ "----------------------------------------\n"
				+ "\t\t   Total: %.2f €",nombre ,dinero, mantenimiento, dinero_Mant, intereses, dinero_Inter, dinero_Final );
		
		
	}

}
