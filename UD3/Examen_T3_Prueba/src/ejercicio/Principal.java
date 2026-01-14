package ejercicio;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {

        int opcion, id = 1, edad, horas, cont = 0, idBuscar, introducir_Menores, introducir_Mayores;
        String nombre;
        
        double cantPorHora = 1.5;
        double porcBote = 10.0;
        
        Hijo[] listaHijos = new Hijo[50];
        GestionFamiliar gestion = new GestionFamiliar(listaHijos, 200.0);

        listaHijos[0] = new Hijo("David", id++, 12, 10);
        listaHijos[0].calcularPaga(cantPorHora, porcBote);
        cont++;
        
        listaHijos[1] = new Hijo("Beatriz", id++, 16, 20);
        listaHijos[1].calcularPaga(cantPorHora, porcBote);
        cont++;

        listaHijos[2] = new Hijo("Carlos", id++, 10, 5);
        listaHijos[2].calcularPaga(cantPorHora, porcBote);
        cont++;

        System.out.println("Bienvenido al programa de Gestión Familiar");

        do {
            gestion.imprimirMenu();
            opcion = Leer.datoInt();

            switch (opcion) {

                case 1:
                    System.out.println("Diga el nombre del hijo:");
                    nombre = Leer.dato();
                    System.out.println("Diga la edad:");
                    edad = Leer.datoInt();
                    System.out.println("Diga las horas estudiadas:");
                    horas = Leer.datoInt();
                    
                    Hijo nuevoHijo = new Hijo(nombre, id, edad, horas);
                    nuevoHijo.calcularPaga(cantPorHora, porcBote);
                    
                    boolean agregado = gestion.agregar(nuevoHijo, cont);
                    
                    if (agregado) {
                        System.out.println("ID asignado a " + nombre + ": " + id);
                        id++;
                        cont++;
                        System.out.println(nombre + " agregado con éxito.");
                    } else {
                        System.out.println("No se pudo agregar al hijo, lista llena.");
                    }
                    break;

                case 2:
                    System.out.println("Diga el ID del hijo a buscar:");
                    idBuscar = Leer.datoInt();
                    Hijo hEncontrado = gestion.buscarById(idBuscar, cont);
                    
                    if (hEncontrado != null) {
                        System.out.println("Hijo encontrado:");
                        System.out.println(hEncontrado);
                    } else {
                        System.out.println("Hijo con ID " + idBuscar + " no encontrado.");
                    }
                    break;

                case 3:
                	System.out.println("Introduzca la edad de corte para buscar");
                	introducir_Menores = Leer.datoInt();
                    Hijo[] menores = gestion.buscarByEdad(cont, introducir_Menores);
                    
                    if (menores.length > 0) {
                        System.out.println("\nHijos menores de "+ introducir_Menores +" años:");
                        System.out.println("---------------------------------");
                        for (Hijo h : menores) {
                            System.out.println(h);
                        }
                    } else {
                        System.out.println("No se encontraron hijos menores de "+ introducir_Menores +" años.");
                    }
                    break;  

                case 4:
                	System.out.println("Introducir mayores");
                	introducir_Mayores = Leer.datoInt();
                    double gastoMayores = gestion.calcularGasto(cont, introducir_Mayores);
                    System.out.printf("El gasto total en hijos mayores de "+ introducir_Mayores +" años es: %.2f€\n", gastoMayores);
                    break;

                case 5:
                    System.out.println("Diga el ID del hijo a modificar:");
                    idBuscar = Leer.datoInt();
                    System.out.println("Diga el nuevo número de horas:");
                    horas = Leer.datoInt();
                    
                    boolean modificado = gestion.modificar(idBuscar, horas, cont, cantPorHora, porcBote);
                    
                    if (modificado) {
                        System.out.println("Horas modificadas con éxito.");
                        System.out.println("Datos actualizados:");
                        System.out.println(gestion.buscarById(idBuscar, cont));
                    } else {
                        System.out.println("Hijo con ID " + idBuscar + " no encontrado.");
                    }
                    break;

                case 6:
                    double restante = gestion.calcularResto(cont);
                    double gastoTotal = gestion.getPresupuesto() - restante;
                    
                    System.out.printf("Presupuesto inicial: %.2f€\n", gestion.getPresupuesto());
                    System.out.printf("Gasto total en pagas: %.2f€\n", gastoTotal);
                    System.out.printf("Presupuesto restante: %.2f€\n", restante);
                    break;

                case 7:
                    Hijo[] todos = gestion.mostrarDatos(cont);
                    System.out.println("\n--- LISTA DE TODOS LOS HIJOS ---");
                    if (todos.length == 0) {
                        System.out.println("No hay hijos registrados.");
                    } else {
                        for (Hijo h : todos) {
                            System.out.println(h);
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Diga el ID del hijo para calcular el porcentaje:");
                    idBuscar = Leer.datoInt();
                    double porcentaje = gestion.calcularPorcentaje(idBuscar, cont);
                    
                    if (porcentaje != -1) {
                        Hijo h = gestion.buscarById(idBuscar, cont);
                        System.out.printf("La paga de %s (%.2f€) representa el %.2f%% del presupuesto total.\n",
                                h.getNombre(), h.getPagaSemanal(), porcentaje);
                    } else {
                        System.out.println("Hijo con ID " + idBuscar + " no encontrado.");
                    }
                    break;

                case 9:
                    System.out.println("Diga el ID del hijo para comprobar su paga:");
                    idBuscar = Leer.datoInt();
                    String mensajePaga = gestion.comprobarPaga(idBuscar, cont);
                    
                    if (mensajePaga != null) {
                        Hijo h = gestion.buscarById(idBuscar, cont);
                        System.out.println(h.getNombre() + ": " + mensajePaga);
                    } else {
                        System.out.println("Hijo con ID " + idBuscar + " no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}