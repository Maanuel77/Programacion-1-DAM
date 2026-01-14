package ejemplos_Métodos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result, num1, num2;
		operaciones op = new operaciones ();
		
		System.out.println("Introduzca el primer número a sumar: ");
		num1 = Leer.datoDouble();
		System.out.println("Introduzca el segundo número a sumar: ");
		num2 = Leer.datoDouble();
		
		result = op.dividir_Numeros(num1, num2);
		
		//Para imprimir. Opción a
		//Guardo el resultado en una variable y lo muestro
		System.out.println(result);
		
		//Para imprimir. Opcion b
		//Mostrar directamente el syso
		System.out.println("Resultado: "+op.dividir_Numeros(num1, num2));
		
	}

}
