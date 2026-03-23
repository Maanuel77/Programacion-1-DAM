package local_Date;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--- 1. CREACIÓN DE FECHAS ---");
		// Obtener la fecha actual del sistema
		LocalDate hoy = LocalDate.now();
		System.out.println("Fecha actual: " + hoy);

		// Crear una fecha específica (Ej. Fecha de caducidad)
		LocalDate fechaCaducidad = LocalDate.of(2026, 12, 31);
		System.out.println("Fecha de caducidad: " + fechaCaducidad);

		System.out.println("\n--- 2. MANIPULACIÓN E INMUTABILIDAD ---");
		// Sumar y restar tiempo.
		// IMPORTANTE: Como son inmutables, el resultado debe guardarse en una nueva
		// variable.
		LocalDate proximaSemana = hoy.plusDays(7);
		LocalDate elMesPasado = hoy.minusMonths(1);

		System.out.println("Dentro de 7 días será: " + proximaSemana);
		System.out.println("Hace un mes fue: " + elMesPasado);

		// Demostración de inmutabilidad: la variable 'hoy' no ha cambiado
		System.out.println("Comprobación: La variable 'hoy' sigue siendo: " + hoy);

		System.out.println("\n--- 3. COMPARACIÓN DE FECHAS ---");
		// Comprobar si una fecha es anterior o posterior a otra
		if (hoy.isAfter(fechaCaducidad)) {
			System.out.println("El producto está caducado.");
		} else {
			System.out.println("El producto está en buen estado.");
		}

		System.out.println("¿La fecha de caducidad es anterior a hoy? "
		+ fechaCaducidad.isBefore(hoy));

		System.out.println("\n--- 4. AÑOS BISIESTOS ---");
		// Comprobar si un año es bisiesto
		System.out.println("¿Es bisiesto el año " + hoy.getYear() + "? " + hoy.isLeapYear());

		// Comprobando un año que sabemos que es bisiesto (2024)
		LocalDate fechaBisiesta = LocalDate.of(2024, 1, 1);
		System.out.println("¿Es bisiesto el año 2024? " + fechaBisiesta.isLeapYear());

	}

}
