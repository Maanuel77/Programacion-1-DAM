package ejercicio_07;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		boolean valida = false;
		do {
			try {
				System.out.print("Introduce una matricula de 7 caracteres: ");
				String matricula = Leer.dato().trim();
				validarMatricula(matricula);
				System.out.println("Matricula valida: " + matricula);
				valida = true;
			} catch (MatriculaInvalidaException e) {
				System.out.println(e.getMessage());
			}
		} while (!valida);
	}

	public static void validarMatricula(String matricula) throws MatriculaInvalidaException {
		if (matricula.length() != 7) {
			throw new MatriculaInvalidaException("La matricula debe tener exactamente 7 caracteres");
		}
		if (!Character.isLetter(matricula.charAt(0))) {
			throw new MatriculaInvalidaException("La matricula debe empezar por una letra");
		}
	}
}


