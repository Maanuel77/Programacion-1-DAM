package local_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Principal {

	public static void main(String[] args) {

		System.out.println("--- 1. CREACIÓN DE FECHA Y HORA ---");
		// Obtener la fecha y hora actual
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Instante actual: " + ahora);

		// Crear una fecha y hora específica (Ej. Fecha del examen final)
		LocalDateTime examenFinal = LocalDateTime.of(2026, Month.MAY, 20, 8, 30);
		System.out.println("El examen final es el: " + examenFinal);

		// También puedes crearlo uniendo un LocalDate y un LocalTime
		LocalDate diaTutoria = LocalDate.of(2026, 4, 15);
		LocalTime horaTutoria = LocalTime.of(17, 0);
		LocalDateTime tutoria = LocalDateTime.of(diaTutoria, horaTutoria);
		System.out.println("La tutoría será el: " + tutoria);

		System.out.println("\n--- 2. EXTRACCIÓN (Separar fecha y hora) ---");
		// Extraer solo la fecha o solo la hora de un LocalDateTime
		LocalDate soloFechaExamen = examenFinal.toLocalDate();
		LocalTime soloHoraExamen = examenFinal.toLocalTime();

		System.out.println("Fecha del examen: " + soloFechaExamen);
		System.out.println("Hora del examen: " + soloHoraExamen);

		System.out.println("\n--- 3. MANIPULACIÓN (Inmutabilidad) ---");
		// Podemos manipular tanto la parte de la fecha como la de la hora
		LocalDateTime repasoGeneral = examenFinal.minusDays(2).minusHours(1);
		System.out.println("El repaso general será: " + repasoGeneral);
		System.out.println("Comprobación: La fecha del examen no ha cambiado: " + examenFinal);

		System.out.println("\n--- 4. COMPARACIÓN ---");
		// Validar qué evento ocurre primero
		if (tutoria.isBefore(examenFinal)) {
			System.out.println("Primero es la tutoría y luego el examen.");
		} else {
			System.out.println("El examen es antes que la tutoría.");
		}
	}
}