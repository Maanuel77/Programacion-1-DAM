package ejercicio_10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso, altura, IMC;
		
		System.out.println("Hola, este programa calcula tu índice de masa corporal y te dice tu diagnostico. ");
		System.out.println("Introduzca su peso: ");
		peso = Leer.datoDouble();
		System.out.println("Introduzca su altura: ");
		altura = Leer.datoDouble();
		
		IMC = peso / Math.pow(altura, 2);
		
		if (IMC < 16) {
			
			System.out.println("Su diagnóstico es: Criterio de ingreso en hospital");
			
		}
		if (IMC > 16 && IMC < 17 ) {
			
			System.out.println("Su diagnóstico es: infrapeso");
			
		}
		if (IMC > 17 && IMC < 18 ) {
			
			System.out.println("Su diagnóstico es: bajo peso");
			
		}
		if (IMC > 18 && IMC < 25 ) {
			
			System.out.println("Su diagnóstico es: peso normal (saludable)");
			
		}
		if (IMC > 25 && IMC < 30 ) {
			
			System.out.println("Su diagnóstico es: sobrepeso (obesidad de grado I)");
			
		}
		if (IMC > 30 && IMC < 35 ) {
			
			System.out.println("Su diagnóstico es: sobrepeso crónico (obesidad de grado II)");
			
		}
		if (IMC > 35 && IMC < 40 ) {
			
			System.out.println("Su diagnóstico es: obesidad premórbida (obesidad de grado III)");
			
		}
		if (IMC > 40) {
			
			System.out.println("Su diagnóstico es: obesidad mórbida (obesidad de grado IV)");
			
		}
		
	}

}
