package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2;
		
		System.out.println("Hola, diga el primer número: ");
		num1 = Leer.datoDouble();
		System.out.println("Ahora diga el segundo número: ");
		num2 = Leer.datoDouble();
		
		if (num1 >= num2){
			if (num1 == num2) {
			
			System.out.println("Los números son iguales.");
			
			}else {
				
				System.out.printf("%.2f es mayor a %.2f.",num1, num2);	
			}
		}else {
			
			System.out.printf("%.2f es menor a %.2f.",num1, num2);
		}

		
		
	}

}
