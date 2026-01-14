package ejemplos_Métodos;

public class operaciones {
	
	public int sumar_Numeros (int num1, int num2) {
		int result;
		
		result = num1 + num2;
		
		return result;
	}
	
	public int multiplicar_Numeros (int num1, int num2) {
		int result;
		
		result = num1 * num2;	
		
		return result;
	}
	public int restar_Numeros (int num1, int num2) {
		int result;
		
		result = num1 - num2;	
		
		return result;
	}
	public double dividir_Numeros (double num1, double num2) {
		double result = 0;
		operaciones op = new operaciones ();
		
		while (num2 == 0) {
			
			System.out.println("No se puede dividir por 0");
			
		}
		
		result = num1/num2;
		
		return result;
	}
	
}

