package ejemplo_formatear;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 4;
		double resultado;
		
		System.out.println ("Ejemplo formatear: ");
		
		resultado = Math.PI * num1;
		
		System.out.println ("\nEl dinero que nos queda sin formatear es de: " +resultado+ " €" );
		//%d para los enteros, %s cadenas, %c char. 
		System.out.printf ("El dinero que nos queda formateado es de: %.2f" ,resultado, " €" );
		
	}

}
