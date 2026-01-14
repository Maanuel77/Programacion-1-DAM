package ejercicio_20;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo, retirar, ingresar, entradas, entradas_F;
		int opcion, num;
		
		System.out.println("Hola, bienvenido a mi cajero automático, para comenzar introduzca el saldo de su cuenta.");
		saldo = Leer.datoDouble();
		
		
		do {
			
			System.out.println("\n\n1. Ver saldo");
			System.out.println("2. Retirar dinero");
			System.out.println("3. Comprar entradas");
			System.out.println("4. Ingresar dinero");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
			case 1:
				
				System.out.printf("Su saldo es de %.2f€", saldo);
				break;
				
			case 2: 
				
				System.out.println("Introduzca el dinero que desee retirar: ");
				retirar = Leer.datoDouble();
				if (retirar < saldo) {
				saldo = saldo - retirar;
				System.out.printf("Después de haber retirado %.2f€ le quedan %.2f€ en la cuenta del banco.", retirar, saldo);
				} else {
					
					System.out.printf("No ha sido posible retirar el dinero...\nLa cantidad de dinero que desea retirar es superior al saldo de la cuenta.");
					
				}
				
				break;
				
			case 3:
				
				System.out.println("Introduzca el precio de una entrada: ");
				entradas = Leer.datoDouble();
				System.out.println("Introduzca el número de entradas que va a comprar:");
				num = Leer.datoInt();
				entradas_F = entradas * num;
				if (entradas_F < saldo) {
				saldo = saldo - entradas_F;
				System.out.printf("Después de haber comprado %d entradas por un precio de %.2f€ por cada una le queda un saldo de %.2f€", num, entradas, saldo);
				} else {
					
					System.out.println("No ha sido posible comprar las entradas...\nEl precio de las entradas es mayor al saldo de la cuenta.");
					
				}
				
				break;
				
			case 4:
				
				System.out.println("Introduzca el dinero que desea ingresar: ");
				ingresar = Leer.datoDouble();
				saldo = saldo + ingresar;
				System.out.printf("Después de haber ingresado una cantidad de %.2f€ le quedan %.2f€ en el banco.", ingresar, saldo);
				break;
				
			case 0: 
				
				System.out.println("Saliendo del cajero...");
				break;
				
			}
			
			
		}while (opcion != 0);
		
		System.out.println("Gracias por usar mi programa :)");
		
	}

}
