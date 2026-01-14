package proyecto;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Este programa permite al usuario registrar y hacer seguimiento de hasta 10 hábitos, así como
		 * una racha máxima para animar al usuario que siga con los hábitos, también tiene un contador de 
		 * progreso, cuyo objetivo es que veas cuánto te falta de cada uno para llegar a la meta, por último
		 * un contador de días para que al llegar de nuevo al inicio de semana se reinicie el progreso semanal.
		 * Utiliza estructuras de control de flujo y Arrays Unidimensionales
		 * para gestionar el ciclo semanal, el progreso y los récords históricos.
		 * CONCEPTOS APLICADOS SEGÚN APUNTES:
		 * 1. Arrays Unidimensionales: Se usan 3 arrays paralelos (nombres, progreso, racha) para
		 * almacenar los datos de forma sincronizada.
		 * 2. Control de Flujo: El menú principal usa 'while' y 'switch', mientras que el procesamiento
		 * de datos y estadísticas se basa en bucles 'for' y sentencias 'if/else'.
		 * 3. Cálculos: Se calcula la Tasa de Cumplimiento semanal y se actualiza la Racha Máxima
		 * histórica mediante condicionales.
		 * 5. Números Aleatorios: Se utiliza la clase 'Random' para la sugerencia de enfoque diaria.
		 * 6. Ciclo Semanal: Implementa la función 'pasarDia()' para resetear automáticamente
		 * el progreso semanal (Progreso Semanal = 0) al llegar el Domingo. 
		 * 
		 * Para el trabajo conjunto hemos decidido repartirnos las partes del switch.
		 * 
		 * Gonzalo: case 4, case 5, case 6, revisión del código
		 * Manuel: case 1, case 2, case 3 buscar nuevas implementaciones
		 */
		
		int opciones, capac_Max = 10, rellenar = -1, cont_Habitos = 0, dias_Semana = 7, indice_Habito = 0,
				dia_Actual = 1, indice_Real = 0, racha = 0, racha_Actual_Hoy, dias_Completados, desde = 0, hasta = 12,
				aleatorio;
		double tasa_Cumplimiento, promedio_General = 0.0, suma_Total_Porcentajes = 0.0;
		;
		String[] habitos;
		int[] racha_Maxima1;
		String[] nombres_Dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		String[] habitos_Saludables = { "Beber suficiente agua", "Dormir 7-9 horas al día",
				"Hacer ejercicio regularmente", "Comer una dieta equilibrada", "Practicar la gratitud",
				"Meditar o practicar mindfulness", "Limitar el tiempo de pantalla", "Establecer límites saludables",
				"Aprender algo nuevo (estimulación mental)", "Mantener el contacto social", "Estirar o hacer yoga",
				"Tomar descansos regulares" };

		int[] progreso_Semanal;
		habitos = new String[capac_Max];
		progreso_Semanal = new int[capac_Max];
		racha_Maxima1 = new int[capac_Max];
		Random r = new Random(System.nanoTime());

		System.out
				.println("Bienvenido a un programa de hábitos de vida, mire el siguiente menú para usar el programa.");
		
		do {

			System.out.println("\n╔═══════════════════════════════════════╗");
			System.out.println("║       MONITOR DE PRODUCTIVIDAD        ║");
			System.out.println("╠═══════════════════════════════════════╣");
			System.out.println("║ [1] Añadir un Hábito Nuevo (10 Max.)  ║");
			System.out.println("║ [2] Registrar Progreso de HOY         ║");
			System.out.println("║ [3] Ver Estadísticas y Racha Máxima   ║");
			System.out.println("║ [4] Sugerencia de Enfoque (ALEATORIA) ║");
			System.out.println("║ [5] ** PASAR AL DÍA SIGUIENTE **      ║");
			System.out.println("║ [6] Salir del Programa                ║");
			System.out.println("╚═══════════════════════════════════════╝");
			System.out.print(" >> Seleccione una opción: ");
			opciones = Leer.datoInt();

			switch (opciones) {

			case 1:

				rellenar = rellenar + 1;
				cont_Habitos = cont_Habitos + 1;

				System.out.println("Escriba el hábito que desee añadir: ");

				habitos[rellenar] = Leer.dato();

				System.out.println("Se ha añadido con éxito el hábito: " + habitos[rellenar]);
				System.out.println("Ahora tienes " + cont_Habitos + " hábitos registrados.");
				break;

			case 2:

				if (cont_Habitos == 0) {
					System.out.println("\n No hay hábitos registrados. Añade uno primero (Opción 1).");
					break;
				}

				System.out.println("\n--- Registrar Progreso de HOY ---");
				System.out.println("Seleccione el número del hábito que ha completado:");

				for (int i = 0; i < cont_Habitos; i++) {
					System.out.println((i + 1) + ". " + habitos[i] + " (Progreso Semanal: " + progreso_Semanal[i] + "/"
							+ dias_Semana + ")");
				}

				System.out.print("Hábito completado (escriba el número): ");
				indice_Habito = Leer.datoInt();

				if (indice_Habito < 1 || indice_Habito > cont_Habitos) {
					System.out.println("\nERROR. Número de hábito no válido. Volviendo al menú.");
					break;

				}

				indice_Real = indice_Habito - 1;

				if (progreso_Semanal[indice_Real] < dias_Semana) {
					progreso_Semanal[indice_Real]++;
					System.out.println("Progreso semanal de '" + habitos[indice_Real] + "' actualizado.");
				} else {
					System.out.println(
							"Progreso semanal ya completo (" + dias_Semana + " días). Solo se actualizará la racha.");
				}

				System.out.print("\n¿Cuál es la **Racha Consecutiva** total de este hábito (Ej. 3 días seguidos)? ");
				racha = Leer.datoInt();
				racha_Actual_Hoy = racha;

				if (racha_Actual_Hoy > racha_Maxima1[indice_Real]) {

					racha_Maxima1[indice_Real] = racha_Actual_Hoy;

					System.out.println("¡FELICIDADES! ¡Nueva Racha Máxima Histórica!");
					System.out.println("La siguiente racha máxima se desbloqueará a los "
							+ (racha_Maxima1[indice_Real] + 1) + " días");
				} else {
					System.out.println("Racha Máxima histórica (" + racha_Maxima1[indice_Real] + ") no superada hoy.");
				}
				break;

			case 3:

				if (cont_Habitos == 0) {
					System.out.println("\nNo hay hábitos registrados. No se puede generar el informe.");
					return;
				}

				System.out.println("\n=========================================");
				System.out.println("     INFORME DE PRODUCTIVIDAD SEMANAL");
				System.out.println("=========================================");

				for (int i = 0; i < cont_Habitos; i++) {
					dias_Completados = progreso_Semanal[i];

					tasa_Cumplimiento = (dias_Completados / (double) dias_Semana) * 100;

					suma_Total_Porcentajes += tasa_Cumplimiento;

					System.out.println("\n" + (i + 1) + ". HÁBITO: " + habitos[i]);
					System.out.printf("   - Progreso Semanal: %d/%d días (%.1f%% de cumplimiento)\n", dias_Completados,
							dias_Semana, tasa_Cumplimiento);
					System.out.println("   - Racha MÁXIMA Histórica: " + racha_Maxima1[i] + " días.");

					if (racha_Maxima1[i] >= 10) {
						System.out.println("   ¡Récord de 10+ días! Eres una máquina de la consistencia.");
					} else if (racha_Maxima1[i] >= 3) {
						System.out.println("   ¡Tienes una buena racha! Sigue así para subir el récord.");
					} else {
						System.out.println("   Enfócate en la consistencia diaria para construir la racha.");
					}
				}

				if (cont_Habitos > 0) {
					promedio_General = suma_Total_Porcentajes / cont_Habitos;
				}

				System.out.println("\n-----------------------------------------");
				System.out.printf("PROMEDIO GENERAL DE PRODUCTIVIDAD: %.1f%%", promedio_General);
				System.out.println("\n-----------------------------------------");
				break;

			case 4:

				aleatorio = r.nextInt(hasta - desde + 1) + desde;

				System.out.println("El consejo del día es: " + habitos_Saludables[aleatorio]);
				break;

			case 5:
				System.out.println("\n--- Transición de Día ---");

				if (dia_Actual < dias_Semana) {

					dia_Actual++;
					System.out.println("Se ha avanzado al " + nombres_Dias[dia_Actual - 1] + ".");
					System.out.println("¡Es un nuevo día para tus hábitos!");

				} else {

					System.out.println("¡FIN DE SEMANA! Se está reiniciando el ciclo de hábitos.");
					System.out.println("-------------------------------------------------------");

					for (int i = 0; i < cont_Habitos; i++) {
						progreso_Semanal[i] = 0;
					}

					dia_Actual = 1;
					System.out.println("Ciclo reiniciado. Volvemos al " + nombres_Dias[dia_Actual - 1] + ".");
					System.out.println("Las Estadísticas Semanales se han reseteado (Progreso Semanal = 0).");
				}
				break;

			case 6:
				System.out.println(
						"\nQue tenga un buen día. ¡Recuerde siempre tener un estilo de vida saludable y unos buenos hábitos!");
				System.out.println("\n¡Gracias por usar nuestro programa!.");
				break;

			default:

				System.out.println("El número introducido no es correcto, vuelva a introducirlo.");

			}
		} while (opciones != 6);
	}

}
