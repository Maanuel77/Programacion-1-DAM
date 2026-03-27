package zoned_Date_Time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal {

	public static void main(String[] args) {

		System.out.println("--- 1. HORA EXACTA EN MI MÁQUINA ---");
		// ZonedDateTime.now()
		ZonedDateTime ahoraAqui = ZonedDateTime.now();
		System.out.println("Momento actual en mi zona: " + ahoraAqui);

		System.out.println("\n--- 2. HORA EXACTA EN OTRA ZONA ---");
		// ZoneId.of("Continente/Ciudad") + ZonedDateTime.now(ZoneId)
		ZoneId zonaTokio = ZoneId.of("Asia/Tokyo");
		ZonedDateTime ahoraEnTokio = ZonedDateTime.now(zonaTokio);
		System.out.println("Ahora mismo en Tokio son las: " + ahoraEnTokio);

		System.out.println("\n--- 3. CONVERSIÓN DE ZONA (Mismo instante) ---");
		// withZoneSameInstant(ZoneId zone)
		// Partimos de la hora que es AHORA AQUÍ, y calculamos qué hora es en Nueva York
		ZoneId zonaNuevaYork = ZoneId.of("America/New_York");
		ZonedDateTime ahoraEnNuevaYork = ahoraAqui.withZoneSameInstant(zonaNuevaYork);

		System.out.println("Si llamo por videollamada AHORA MISMO a Nueva York, allí son las: " + ahoraEnNuevaYork);
	}
}
