package ejercicio_06;

public class Principal {
	public static void main(String[] args) {
		try {
			validarSueldo(-1200);
		} catch (SueldoInvalidoException e) {
			System.out.println(e.getMessage());
		}

		try {
			validarPrecio(-12.5);
		} catch (PrecioInvalidoException e) {
			System.out.println(e.getMessage());
		}

		try {
			pagarTicket(50, -10);
		} catch (PagoInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validarSueldo(double sueldo) throws SueldoInvalidoException {
		if (sueldo < 0) {
			throw new SueldoInvalidoException("El sueldo no puede ser negativo");
		}
		System.out.println("Sueldo valido");
	}

	public static void validarPrecio(double precio) throws PrecioInvalidoException {
		if (precio < 0) {
			throw new PrecioInvalidoException("El precio no puede ser negativo");
		}
		System.out.println("Precio valido");
	}

	public static void pagarTicket(double totalTicket, double dineroEntregado) throws PagoInvalidoException {
		if (dineroEntregado < 0) {
			throw new PagoInvalidoException("No se puede pagar con dinero negativo");
		}
		if (dineroEntregado < totalTicket) {
			throw new PagoInvalidoException("Dinero insuficiente para pagar el ticket");
		}
		System.out.println("Pago correcto. Cambio: " + (dineroEntregado - totalTicket));
	}
}


