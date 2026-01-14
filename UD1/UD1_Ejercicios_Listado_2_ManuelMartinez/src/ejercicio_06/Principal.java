package ejercicio_06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prec_Hora, prec_Hora_Extra, din_Normal, din_Extra, din_Total;
		int horas, horas_Extra;
		String nombre;
		
		System.out.println ("Hola, está ante un programa que calcula su sueldo, introduzca su nombre: ");
		nombre = Leer.dato();
		System.out.println ("Hola "+ nombre +" diga, el precio que tiene en su empresa una hora normal trabajada: ");
		prec_Hora = Leer.datoDouble();
		System.out.println ("Ahora diga el precio que tiene en su empresa una hora extra trabajada: ");
		prec_Hora_Extra = Leer.datoDouble();
		System.out.println ("A continuación la cantidad de horas normales que ha trabajado: ");
		horas = Leer.datoInt();
		System.out.println ("Por último la cantidad de horas extra trabajadas: ");
		horas_Extra = Leer.datoInt();
		
		din_Normal = prec_Hora * horas;
		din_Extra = prec_Hora_Extra * horas_Extra;
		din_Total = din_Normal + din_Extra;
		
		System.out.printf("Hola, %s su sueldo se expondrá a continuación \n -------------------------------------------\n\n", nombre);
		System.out.printf("Horas laborables: %d h ----> %.2f €",horas, din_Normal);
		System.out.printf("\nHoras extra:\t   %d h ----> %.2f €" ,horas_Extra, din_Extra);
		System.out.printf("\n-------------------------------------------");
		System.out.printf("\n\t\t\t Total = %.2f €", din_Total);
		System.out.printf("\n\nUsted ha ganado este mes %.2f €, gracias por usar nuestro programa :)", din_Total);
	}

}
