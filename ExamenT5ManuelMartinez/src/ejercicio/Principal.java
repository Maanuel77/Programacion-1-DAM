package ejercicio;

import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        Prision prision = new Prision(1, "Prisión de Huelva", 100);
		        Preso p1 = new Preso ("German", "65383432H", false, 32);
		        prision.agregarPreso(p1);
		        Preso p2 = new Preso ("Gonzalo", "98987498U", true, 40);
		        prision.agregarPreso(p2);
		        Preso p3 = new Preso ("Marta", "23234566U", true, 21);
		        prision.agregarPreso(p3);
		        Preso p4 = new Preso ("Angel", "74583923F", false, 100);
		        prision.agregarPreso(p4);
		        
		        int opcion, diasCondena, maxDias, diasExtra;
		        double media;
		        String nombre, dni, resp;
		        boolean delitoSangre;
		        
		        System.out.println("Bienvenido al sistema gestor de: " + prision.getNombre());
		        
		        do {
		            System.out.println("\nMENU DE LA PRISION");
		            System.out.println("1. Agregar nuevo preso");
		            System.out.println("2. Mostrar listado de presos");
		            System.out.println("3. Indultar presso");
		            System.out.println("4. Buscar preso por DNI");
		            System.out.println("5. Buscar presos con condena menor a un límite");
		            System.out.println("6. Calcular media de condena (solo delitos de sangre)");
		            System.out.println("7. Ordenar presos por condena (Mayor a Menor)");
		            System.out.println("8. Ordenar presos por nombre (A-Z)");
		            System.out.println("0. Cerrar programa");
		            
		            opcion = Leer.datoInt();
		            
		            System.out.println();
		            
		            switch(opcion) {
		                case 1:
		                    System.out.println("Introduzca el DNI:");
		                    dni = Leer.dato();
		                    
		                    System.out.println("Introduzca el nombre:");
		                    nombre = Leer.dato();
		                    
		                    System.out.println("¿Tiene delito de sangre? s/n");
		                    resp = Leer.dato();
		                    delitoSangre = resp.equalsIgnoreCase("s");
		                    
		                    System.out.println("Introduzca los días base de condena:");
		                    diasCondena = Leer.datoInt();
		                    
		                    Preso p = new Preso(nombre, dni, delitoSangre, diasCondena);
		                    
		                    if (prision.agregarPreso(p)) {
		                        System.out.println("\nPreso agregado con éxito");
		                    } else {
		                        System.out.println("\nError: Se ha alcanzado la capacidad máxima de la prisión.");
		                    }
		                    break;
		                    
		                case 2:
		                    System.out.println("Listado de presos actuales:");
		                    prision.mostrarTodosLosPresos();
		                    break;
		                    
		                case 3:
		                    System.out.println("Introduzca el DNI del preso a indultar:");
		                    dni = Leer.dato();
		                    
		                    if (prision.indultarPreso(dni)) {
		                        System.out.println("\nEl preso ha sido indultado con éxito.");
		                    } else {
		                        System.out.println("\nNo existe ningún preso asociado a ese DNI.");
		                    }
		                    break;
		                    
		                case 4:
		                    System.out.println("Introduzca el DNI a buscar:");
		                    dni = Leer.dato();
		                    Preso buscado = prision.findByDni(dni);
		                    
		                    if (buscado != null) {
		                        System.out.println("\nInformación del preso:");
		                        System.out.println(buscado);
		                    } else {
		                        System.out.println("\nNo existe ningún preso asociado a ese DNI.");
		                    }
		                    break;
		                    
		                case 5:
		                    System.out.println("Introduzca el límite máximo de días finales:");
		                    maxDias = Leer.datoInt();
		                    
		                    System.out.println("Introduzca los días extra de penalización por delito de sangre a aplicar:");
		                    diasExtra = Leer.datoInt();
		                    
		                    List<Preso> filtrados = prision.findMenosXDias(maxDias, diasExtra);
		                    
		                    if (!filtrados.isEmpty()) {
		                        System.out.println("\nPresos que cumplen la condición:");
		                        for (Preso presoFiltro : filtrados) {
		                            System.out.println(presoFiltro);
		                        }
		                    } else {
		                        System.out.println("\nNingún preso cumple esta condición.");
		                    }
		                    break;
		                    
		                case 6:
		                    System.out.println("Introduzca los días extra de penalización por delito de sangre a aplicar:");
		                    diasExtra = Leer.datoInt();
		                    
		                    media = prision.calcularMedia(diasExtra);
		                    System.out.printf("\nLa media de días de condena (para delitos de sangre) es: %.0f días.\n", media);
		                    break;
		                    
		                case 7:
		                    prision.ordenarPresosPorCondenaNatural();
		                    System.out.println("La lista se ha ordenado por días de condena de mayor a menor.");
		                    System.out.println("Pulse la opción 2 para ver los resultados.");
		                    break;
		                    
		                case 8:
		                    prision.ordenarPresosPorNombreNoNatural();
		                    System.out.println("La lista se ha ordenado alfabéticamente por nombre.");
		                    System.out.println("Pulse la opción 2 para ver los resultados.");
		                    break;
		                    
		                case 0:
		                    System.out.println("Gracias por usar el programa :)");
		                    break;
		                    
		                default:
		                    System.out.println("Opcion no válida, intente con una opcion que esté disponible en el menú");
		            }
		            
		        } while (opcion != 0);
		       
		    }
		}
