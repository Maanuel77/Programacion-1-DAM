package ejercicio_04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        GestionQuedadas gestion = new GestionQuedadas();

        // 1. Creamos algunas quedadas
        gestion.agregar(new QuedadaFeria(1, "Cena del Pescaito", "Portada", 
                LocalDate.of(2026, 4, 18), LocalTime.of(21, 0), 
                true, 45.0, 500.0, Arrays.asList("Juan", "Maria", "Pepe")));

        gestion.agregar(new QuedadaFeria(2, "Almuerzo de Rebujito", "Caseta 12", 
                LocalDate.of(2026, 4, 19), LocalTime.of(14, 0), 
                false, 20.0, 100.0, Arrays.asList("Maria", "Luis")));

        System.out.println("--- Lista inicial ---");
        gestion.mostrarTodas();

        // 2. Modificar la quedada 2
        QuedadaFeria update = new QuedadaFeria(2, "Almuerzo y Cacharritos", "Calle Infierno", 
                LocalDate.of(2026, 4, 19), LocalTime.of(16, 0), 
                true, 30.0, 150.0, Arrays.asList("Maria", "Luis", "Ana"));
        gestion.modificar(2, update);

        System.out.println("\n--- Tras modificar ID 2 ---");
        gestion.mostrarTodas();

        // 3. Probar métodos de Streams
        System.out.println("\n--- Invitados totales (sin repetir) ---");
        System.out.println(gestion.obtenerListaInvitadosUnica());

        System.out.println("\n--- Dinero total que nos vamos a gastar ---");
        System.out.println(gestion.calcularGastoTotalPrevisto() + "€");

        // 4. Borrar una quedada
        gestion.borrar(1);
        System.out.println("\n--- Tras borrar ID 1 ---");
        gestion.mostrarTodas();
    }
}