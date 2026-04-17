package ejercicio_05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ServicioExcepciones {
	private Set<Integer> numerosGenerados = new HashSet<>();
	private Map<Integer, String> idsAsignados = new HashMap<>();
	private Random random = new Random();

	public int generarAleatorioSinRepetir() throws NumeroRepetidoException {
		int numero = random.nextInt(3) + 1;
		if (numerosGenerados.contains(numero)) {
			throw new NumeroRepetidoException("Numero repetido: " + numero);
		}
		numerosGenerados.add(numero);
		System.out.println("Numero generado: " + numero);
		return numero;
	}

	public void asignarId(String nombreObjeto, int id) throws IdDuplicadoException {
		if (idsAsignados.containsKey(id)) {
			throw new IdDuplicadoException("El id " + id + " ya esta asignado a " + idsAsignados.get(id));
		}
		idsAsignados.put(id, nombreObjeto);
		System.out.println("Id " + id + " asignado a " + nombreObjeto);
	}

	public void validarPar(int numero) throws NumeroImparException {
		if (numero % 2 != 0) {
			throw new NumeroImparException("El numero " + numero + " es impar");
		}
		System.out.println("El numero es par");
	}

	public void enviarBizum(double saldo, double cantidad) throws SaldoInsuficienteException {
		if (cantidad > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente para enviar " + cantidad + " euros");
		}
		System.out.println("Bizum enviado correctamente");
	}

	public void validarEdad(int edad) throws EdadInvalidaException {
		if (edad < 18) {
			throw new EdadInvalidaException("Debes ser mayor de edad");
		}
		System.out.println("Edad valida");
	}

	public void validarContrasena(String contrasena) throws ContrasenaDebilException {
		boolean longitudValida = contrasena.length() >= 8;
		boolean tieneNumero = contrasena.matches(".*\\d.*");
		if (!longitudValida || !tieneNumero) {
			throw new ContrasenaDebilException("La contrasena debe tener al menos 8 caracteres y un numero");
		}
		System.out.println("Contrasena valida");
	}
}


