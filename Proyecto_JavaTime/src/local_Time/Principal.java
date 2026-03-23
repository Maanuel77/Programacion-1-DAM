package local_Time;

import java.time.LocalTime;

public class Principal {

	    public static void main(String[] args) {
			// TODO Auto-generated method stub

	        System.out.println("--- 1. CREACIÓN DE HORAS ---");
	        // Obtener la hora actual del sistema
	        LocalTime ahora = LocalTime.now();
	        System.out.println("Hora actual: " + ahora);

	        // Crear horas específicas (Ej. Horario de una tienda)
	        LocalTime horaApertura = LocalTime.of(9, 0);   // 09:00
	        LocalTime horaCierre = LocalTime.of(20, 30);   // 20:30
	        System.out.println("La tienda abre a las: " + horaApertura + " y cierra a las: " + horaCierre);


	        System.out.println("\n--- 2. MANIPULACIÓN E INMUTABILIDAD ---");
	        // Sumar y restar tiempo. 
	        // Recuerda: Se crea un nuevo objeto, el original no se modifica.
	        LocalTime descansoCafe = ahora.plusHours(2);
	        LocalTime alarmaAviso = horaCierre.minusMinutes(15);
	        
	        System.out.println("Dentro de 2 horas será el descanso: " + descansoCafe);
	        System.out.println("La alarma de cierre sonará a las: " + alarmaAviso);
	        System.out.println("Comprobación: La variable 'ahora' sigue siendo: " + ahora);


	        System.out.println("\n--- 3. COMPARACIÓN DE HORAS ---");
	        // Ideal para saber si una acción está dentro de un horario permitido
	        
	        // Vamos a simular que un cliente intenta entrar ahora mismo
	        System.out.println("¿Puede entrar un cliente en este momento?");
	        
	        if (ahora.isAfter(horaApertura) && ahora.isBefore(horaCierre)) {
	            System.out.println("Sí, la tienda está abierta.");
	        } else {
	            System.out.println("No, la tienda está cerrada.");
	        }
	        
	        System.out.println("\n¿Es la hora de apertura anterior a la de cierre? " + horaApertura.isBefore(horaCierre));
	    }
	}
