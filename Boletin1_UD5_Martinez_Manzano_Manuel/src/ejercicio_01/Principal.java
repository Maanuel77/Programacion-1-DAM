package ejercicio_01;

import java.util.List;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {
        // Programa para gestionar notas de texto (IO en este main), la lógica está en GestorNotas

        GestorNotas gestor = new GestorNotas();
        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- GESTIÓN DE NOTAS ---");
            System.out.println("1. Mostrar todas las notas");
            System.out.println("2. Mostrar nota individual");
            System.out.println("3. Número de notas guardadas");
            System.out.println("4. Agregar una nueva nota");
            System.out.println("5. Borrar una nota por número");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = 0;
            try {
                opcion = Integer.parseInt(Leer.dato());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
            case 1:
                List<String> lineas = gestor.listarTitulosConFechas();
                if (lineas.isEmpty()) {
                    System.out.println("No hay notas guardadas.");
                } else {
                    System.out.println("\nListado de notas:");
                    for (String l : lineas) System.out.println(l);
                }
                break;
            case 2:
                if (gestor.contar() == 0) {
                    System.out.println("No hay notas guardadas.");
                    break;
                }
                // Mostrar títulos y pedir índice
                for (String l : gestor.listarTitulosConFechas()) System.out.println(l);
                System.out.print("Elige el número de la nota a mostrar: ");
                int num = safeReadInt();
                Nota n = gestor.obtenerNota(num);
                if (n == null) {
                    System.out.println("Número fuera de rango o no válido.");
                } else {
                    System.out.println("\n--- Nota " + num + " ---");
                    System.out.println("Título: " + n.getTitulo());
                    System.out.println("Fecha: " + n.getFechaCreacion());
                    System.out.println("Texto: \n" + n.getTexto());
                }
                break;
            case 3:
                System.out.println("Número de notas: " + gestor.contar());
                break;
            case 4:
                System.out.print("Título: ");
                String titulo = Leer.dato();
                System.out.println("Texto (pulsa ENTER para terminar): ");
                String texto = Leer.dato();
                gestor.agregarNota(titulo, texto);
                System.out.println("Nota añadida correctamente.");
                break;
            case 5:
                if (gestor.contar() == 0) {
                    System.out.println("No hay notas que borrar.");
                    break;
                }
                for (String l : gestor.listarTitulosConFechas()) System.out.println(l);
                System.out.print("Elige el número de la nota a borrar: ");
                int numB = safeReadInt();
                boolean borrado = gestor.borrarNota(numB);
                if (borrado) {
                    System.out.println("Nota borrada.");
                } else {
                    System.out.println("Número fuera de rango o no válido.");
                }
                break;
            case 6:
                salir = true;
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
            }
        }

    }
    private static int safeReadInt() {
        try {
            return Integer.parseInt(Leer.dato());
        } catch (Exception e) {
            return -1;
        }
    }

}