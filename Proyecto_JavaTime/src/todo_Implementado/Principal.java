package todo_Implementado;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Scanner;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion, id, anio, mes, dia, hora, min;
        String nombreBuscar, zona, nomMod, nomBorrar, nuevaZona;

        // Metemos un par de datos de prueba para no empezar de cero
        agenda.añadirEvento(new Evento(1, "Reunion Madrid", 2026, 5, 20, 10, 0, "Europe/Madrid"));
        agenda.añadirEvento(new Evento(2, "Conferencia Tokio", 2026, 8, 15, 9, 30, "Asia/Tokyo"));

        do {
            System.out.println("\n--- AGENDA DE EVENTOS (TIPO EXAMEN) ---");
            System.out.println("1. Mostrar todos los eventos (Iterator)");
            System.out.println("2. Buscar evento por nombre");
            System.out.println("3. Añadir nuevo evento");
            System.out.println("4. Modificar zona horaria de un evento");
            System.out.println("5. Ordenar lista (Z-A)");
            System.out.println("6. Borrar evento");
            System.out.println("7. Salir");
            System.out.print("Elige opción: ");

            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    // 1. Imprimir usando Iterator (Requisito exacto del PDF)
                    System.out.println("\n--- LISTA DE EVENTOS ---");
                    Iterator<Evento> it = agenda.obtenerIterator();
                    if (!it.hasNext()) {
                        System.out.println("La agenda está vacía.");
                    } else {
                        while (it.hasNext()) {
                            System.out.println(it.next().toString());
                        }
                    }
                    break;

                case 2:
                    // 2. Buscar devolviendo null e imprimiendo en main (Requisito exacto)
                    System.out.print("Nombre del evento a buscar: ");
                    nombreBuscar = Leer.dato();
                    Evento encontrado = agenda.buscarPorNombre(nombreBuscar);
                    
                    if (encontrado != null) {
                        System.out.println("Encontrado: Su fecha global es " + encontrado.getFechaHoraGlobal());
                    } else {
                        System.out.println("Error: Evento no encontrado (null).");
                    }
                    break;

                case 3:
                    // 3. Añadir nueva palabra/evento
                    System.out.print("ID: ");
                    id = Leer.datoInt();
                    sc.nextLine();
                    System.out.print("Nombre del evento: ");
                    String nombre = sc.nextLine();
                    
                    System.out.print("Año: "); 
                    anio = Leer.datoInt();
                    System.out.print("Mes: ");
                    mes = Leer.datoInt();
                    System.out.print("Día: ");
                    dia = Leer.datoInt();
                    System.out.print("Hora: ");
                   	hora = Leer.datoInt();
                    System.out.print("Minuto: ");
                    min = Leer.datoInt();

                    System.out.print("Zona Horaria (Ej. Europe/Madrid): ");
                    zona = Leer.dato();

                    try {
                        Evento nuevo = new Evento(id, nombre, anio, mes, dia, hora, min, zona);
                        if (agenda.añadirEvento(nuevo)) {
                            System.out.println("Evento añadido correctamente.");
                        } else {
                            System.out.println("Error: Ya existe un evento con ese nombre.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error en los datos introducidos (Posible Zona Horaria incorrecta).");
                    }
                    break;

                case 4:
                    // 4. Modificar únicamente un atributo leído por teclado
                    System.out.print("Nombre del evento a modificar: ");
                    nomMod = Leer.dato();
                    Evento aModificar = agenda.buscarPorNombre(nomMod);
                    
                    if (aModificar != null) {
                        System.out.print("Introduce la nueva Zona Horaria (Ej. America/New_York): ");
                        nuevaZona = Leer.dato();
                        
                        
                        if (java.time.ZoneId.getAvailableZoneIds().contains(nuevaZona)) {
                            
                            ZonedDateTime horaActual = aModificar.getFechaHoraGlobal();
                            ZonedDateTime horaActualizada = horaActual.withZoneSameInstant(java.time.ZoneId.of(nuevaZona));
                            
                            aModificar.setFechaHoraGlobal(horaActualizada);
                            System.out.println("Zona horaria actualizada con éxito.");
                            
                        } else {
                            // Si lo ha escrito mal (ej. "Madrid" en vez de "Europe/Madrid")
                            System.out.println("Error: Zona horaria no reconocida. Recuerda usar el formato 'Continente/Ciudad'.");
                        }
                        
                    } else {
                        System.out.println("Evento no encontrado.");
                    }
                    break;

                case 5:
                    // 5. Ordenar Z-A con clase propia
                    agenda.ordenarDescendente();
                    System.out.println("Agenda ordenada alfabéticamente de la Z a la A.");
                    break;

                case 6:
                    // 6. Borrar
                    System.out.print("Nombre del evento a borrar: ");
                    nomBorrar = Leer.dato();
                    if (agenda.borrarEvento(nomBorrar)) {
                        System.out.println("Evento eliminado.");
                    } else {
                        System.out.println("No se encontró el evento.");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 7);

        sc.close();
    }
}