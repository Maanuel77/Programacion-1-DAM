package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1, num2, result_s_r = 0, result;
		int [] num;
		int opcion, tam;
		
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
				
				System.out.println("Cuántos números desea sumar:");
				tam = Leer.datoInt();
				num = new int [tam];
				for (int i = 0; i < num.length; i ++) {
					
					System.out.println("Introduce el número " + i +" que desea sumar");
					num1 = Leer.datoDouble();
					result_s_r = result_s_r + num1;
				}
				System.out.println("La suma de los números es: "+ result_s_r);
				break;
				
			case 2:
				
				System.out.println("Cuántos números desea restar:");
				tam = Leer.datoInt();
				num = new int [tam];
				for (int i = 0; i < num.length; i ++) {
					
					System.out.println("Introduce el número " + i +" que desea restar");
					num1 = Leer.datoDouble();
					if (i == 0) {
					result_s_r = result_s_r + num1;
					}else {
						
						result_s_r = result_s_r - num1;
						
					}
					}
				System.out.println("La resta de los números es: "+ result_s_r);
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

