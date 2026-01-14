package ejercicio_04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cant, cant_Pedida, cant_Restante;
		
		System.out.println("Hola bienvenido a un programa que con su saldo del banco y mediante alguna cantidad que ha retirado te dice el dinero restante.");
		System.out.println("Para comenzar introduzca la cantidad de dinero disponible en el banco: ");
		cant = Leer.datoDouble();
		
		System.out.println("Ahora diga cuanto dinero desea retirar: ");
		cant_Pedida = Leer.datoDouble();
		
		if (cant_Pedida < cant) {
			
			cant_Restante = cant - cant_Pedida;
			System.out.printf("La cantidad de dinero que le queda en el banco es de %.2f€", cant_Restante);
			
		} else {
			
			System.out.println("La cantidad pedida excede el dinero disponible en la cuenta.");
			
		}
		
		System.out.println("\n\nGracias por usar mi programa :)");
		
	}
	

}
