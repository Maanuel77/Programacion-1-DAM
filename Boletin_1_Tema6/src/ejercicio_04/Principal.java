package ejercicio_04;

public class Principal {
	public static void main(String[] args) {
		int a = 7;
		int b = 8;

		try {
			validarSuma(a, b);
			System.out.println("La suma es valida");
		} catch (SumaMayorDiezException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validarSuma(int a, int b) throws SumaMayorDiezException {
		if (a + b > 10) {
			throw new SumaMayorDiezException("La suma no puede ser mayor que 10");
		}
	}
}


