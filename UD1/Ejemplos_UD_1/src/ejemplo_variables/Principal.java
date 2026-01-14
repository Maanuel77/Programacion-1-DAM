package ejemplo_variables;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=65;
		int num2=82;
		int resultado;
		double num1dec= 4.54;
		char inicial= 'M';
		double precio;
		
		System.out.println ("Hola, este programa trata de sumar dos números y el precio de una multiplicación :) ");
		System.out.println ("\nEl primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
		
		resultado=num1+num2;
		
		System.out.println("La suma de los números es: " + resultado);
		
		precio = num1 * num1dec;
		System.out.println("\nEl precio de una lata de atún es: " + num1dec);		
		System.out.println("El precio es es: " +precio+"€");
		System.out.println("La inicial de mi nombre es: "+ inicial);
		
	}

}
