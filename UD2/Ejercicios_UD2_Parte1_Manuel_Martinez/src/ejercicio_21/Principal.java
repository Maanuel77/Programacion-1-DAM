package ejercicio_21;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2, result;
		int opcion;
		
		System.out.println("Hola, bienvenido a mi programa de una mini calculadora.");
		
		do {
			
			System.out.println("\n----Mini calculadora----");
			System.out.println("1. SUMA");
			System.out.println("2. RESTA");
			System.out.println("3. MULTIPLICACIÓN");
			System.out.println("4. DIVISIÓN");
			System.out.println("5. PAR O IMPAR");
			System.out.println("0. SALIR");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
			case 1:
				
				System.out.println("Introduzca el primer número que desea sumar.");
				num1 = Leer.datoDouble();
				System.out.println("Introduzca el segundo número que desea sumar.");
				num2 = Leer.datoDouble();
				result = num1 + num2;
				System.out.printf("Suma = %.2f", result);
				break;
				
			case 2:
				
				System.out.println("Introduzca el primer número que desea restar.");
				num1 = Leer.datoDouble();
				System.out.println("Introduzca el segundo número que desea restar.");
				num2 = Leer.datoDouble();
				result = num1 - num2;
				System.out.printf("Resta = %.2f", result);
				break;
				
			case 3:
				
				System.out.println("Introduzca el primer número que desea multiplicar.");
				num1 = Leer.datoDouble();
				System.out.println("Introduzca el segundo número que desea multiplicar.");
				num2 = Leer.datoDouble();
				result = num1 * num2;
				System.out.printf("Multiplicación = %.2f", result);
				break;
				
			case 4:
				
				System.out.println("Introduzca el numerador.");
				num1 = Leer.datoDouble();
				System.out.println("Introduzca el denominador.");
				num2 = Leer.datoDouble();
				if (num2 != 0) {
				result = num1 / num2;
				System.out.printf("División = %.2f", result);
				}else {
					
					System.out.println("No se puede dividir un número por 0, introduzca otro denominador.");
					
				}
				break;
				
			case 5:
				
				System.out.println("Introduzca el número que desea saber si es par o impar.");
				num1 = Leer.datoDouble();
				result = num1 % 2;
				if (result == 0) {
					
					System.out.println("El número es par");
					
				}else {
					
					System.out.println("El número es impar");
				}
				break;
			case 0:
				
				System.out.println("Gracias por usar mi calculadora :)");
				break;
				
			default:
				System.out.println("Número incorrecto, introduzca un comado válido");
			}
			
			
			
			
		}while (opcion != 0);
		
		
	}

}
