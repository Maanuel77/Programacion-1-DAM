package ejemplo_Lambda;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@FunctionalInterface
		interface Calculadora {	
			int sumar (int a, int b);
		}
		
		Calculadora sumar = (a,b) -> (a+b);
		
		Calculadora sumarV2 = (a,b) -> {
			
			return a+b;
			
		};		
		System.out.println(sumar.sumar(12, 4));
		System.out.println(sumarV2.sumar(12, 4));
		
	}

}
