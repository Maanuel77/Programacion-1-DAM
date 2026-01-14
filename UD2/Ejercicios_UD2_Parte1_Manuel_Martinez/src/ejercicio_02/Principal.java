package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, result;
		
		System.out.println("Hola, bienvenido a mi calculadora de divisiones, para comenzar introduzca el numerador: ");
		num1 = Leer.datoDouble();
		System.out.println("A continuación el denominador: ");
		num2 = Leer.datoDouble();
		
		if (num2 == 0) {
			
			System.out.println("\nLo siento, vuelva a introducir un número distinto a 0 en el denominador.");
		}else {
			result = num1/num2;
			System.out.printf("El resultado de la división es: %.4f", result);
			
		}
		
	}

}
