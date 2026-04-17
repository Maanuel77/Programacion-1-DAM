package ejercicio_05;

public class Principal {
	public static void main(String[] args) {
		ServicioExcepciones servicio = new ServicioExcepciones();

		try {
			servicio.generarAleatorioSinRepetir();
			servicio.generarAleatorioSinRepetir();
			servicio.generarAleatorioSinRepetir();
		} catch (NumeroRepetidoException e) {
			System.out.println(e.getMessage());
		}

		try {
			servicio.asignarId("objetoA", 100);
			servicio.asignarId("objetoB", 100);
		} catch (IdDuplicadoException e) {
			System.out.println(e.getMessage());
		}

		try {
			servicio.validarPar(9);
		} catch (NumeroImparException e) {
			System.out.println(e.getMessage());
		}

		try {
			servicio.enviarBizum(200, 150);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		try {
			servicio.validarEdad(15);
		} catch (EdadInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			servicio.validarContrasena("abc123");
		} catch (ContrasenaDebilException e) {
			System.out.println(e.getMessage());
		}
	}
}


