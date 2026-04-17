package formatear;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--- 1. CREACIÓN DE MOLDES Y FORMATEO (De Fecha a Texto) ---");
		LocalDate hoy = LocalDate.now();
		System.out.println("Fecha estándar de Java (sin formatear): " + hoy);

		// Creamos el molde numérico tradicional español
		DateTimeFormatter formatoEspanol = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Aplicamos el molde a nuestra fecha actual
		String fechaBonita = hoy.format(formatoEspanol);
		System.out.println("Fecha formateada (dd/MM/yyyy): " + fechaBonita);


		System.out.println("\n--- 2. FORMATOS TEXTUALES CON IDIOMA (Locale) ---");
		// Creamos un molde más avanzado que incluye los días de la semana y meses en texto.
		// Usamos Locale.of("es", "ES") para garantizar que las palabras salgan en español.
		DateTimeFormatter formatoElegante = DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy", Locale.of("es", "ES"));
		
		System.out.println("Fecha elegante: " + hoy.format(formatoElegante));


		System.out.println("\n--- 3. PARSEO SEGURO (De Texto a Fecha) ---");
		// Vamos a pedir una fecha por teclado de forma segura para que el programa no colapse
		LocalDate fechaParseada = null;
		boolean fechaCorrecta = false;

		System.out.println("Vamos a registrar la fecha de un examen.");

		// El bucle se repetirá hasta que el usuario introduzca el formato correcto
		while (!fechaCorrecta) {
			System.out.print("Introduce la fecha del examen (dd/MM/yyyy): ");
			String textoUsuario = Leer.dato();

			try {
				// Intentamos encajar el texto del usuario en nuestro molde español
				fechaParseada = LocalDate.parse(textoUsuario, formatoEspanol);
				fechaCorrecta = true; // Si esta línea se ejecuta, no hubo errores
				
				System.out.println("¡Lectura exitosa!");
				System.out.println("El examen ha sido registrado para el mes: " + fechaParseada.getMonth());
				
			} catch (DateTimeParseException e) {
				// Si salta la excepción, capturamos el error y avisamos al usuario
				System.out.println("ERROR: El texto '" + textoUsuario + "' no tiene el formato correcto.");
				System.out.println("Por favor, asegúrate de usar las barras '/' y números válidos.\n");
			}
		}

	}

}