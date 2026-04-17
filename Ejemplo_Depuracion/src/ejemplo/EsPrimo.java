package ejemplo;

public class EsPrimo {

	public static void main(String[] args) {
		
		System.out.println("Test de primalidad");
		System.out.println("Nº3: %s".formatted(esPrimo(3)));
		System.out.println("Nº8: %s".formatted(esPrimo(8)));
		System.out.println("Nº11: %s".formatted(esPrimo(11)));
		System.out.println("Nº15: %s".formatted(esPrimo(15)));
		System.out.println("Nº23: %s".formatted(esPrimo(23)));

	}
		static boolean esPrimo (int n) {
			
			boolean result = true;
			
			for (int i = 2; i < Math.sqrt(n); i++) {
				
				if ((n % i) == 0)
					result = false;
				
			}
			return result;
				
	}

}
