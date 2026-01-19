package ejercicio_01;

import utilidades.Leer;

public class Principal {


	    public static void main(String[] args) {
	       
	        Habitacion[] misHabitaciones = new Habitacion[3];
	        misHabitaciones[0] = new Habitacion(100, true, "Pepe", 5, 2);
	        misHabitaciones[1] = new Suite(200, true, "Laura", 3, 2, 80, 50);
	        misHabitaciones[2] = new Apartamento(120, false, "Nadie", 0, 0, true);

	        GestionHabitaciones gestion = new GestionHabitaciones(misHabitaciones);
	        
	        double descuentoSuite = 10.0;
	        int ind;
	        int opc;

	        do {
	            System.out.println("\n--- HOTEL MENU ---");
	            System.out.println("1. Ver Factura Global (Listado)");
	            System.out.println("2. Calcular precio de una habitación");
	            System.out.println("3. Calcular recaudación TOTAL");
	            System.out.println("4. Ver habitaciones vacías");
	            System.out.println("5. Salir");
	            System.out.print("Elige: ");
	            opc = Leer.datoInt();

	            switch (opc) {
	                case 1: 
	                   
	                    System.out.println("\n-- LISTADO --");
	                    Habitacion[] lista = gestion.getListaHabitaciones();
	                    for(int i=0; i<lista.length; i++){
	                        System.out.println(i + ". " + lista[i].toString());
	                    }
	                    break;

	                case 2:
	                    System.out.print("Dime índice (0-2): ");
	                    ind = Leer.datoInt();
	                    
	                    double precio = gestion.calcularPrecioConcreto(ind, descuentoSuite);
	                    
	                    if (precio == -1) {
	                        System.out.println("Error: Habitación vacía o índice incorrecto.");
	                    } else {
	                        Habitacion h = gestion.getHabitacion(ind); 
	                        System.out.println("Habitación: " + h.toString());
	                        System.out.println("PRECIO A PAGAR: " + precio + "€");
	                    }
	                    break;

	                case 3:
	                    double total = gestion.calcularRecaudacionTotal(descuentoSuite);
	                    System.out.println("Recaudación Total: " + total + "€");
	                    break;

	                case 4:
	                    System.out.println("\n-- VACÍAS --");
	                    Habitacion[] todas = gestion.getListaHabitaciones();
	                    for(Habitacion h : todas) {
	                        if(!h.isOcupada()) {
	                            System.out.println(h.toString());
	                        }
	                    }
	                    break;
	            }

	        } while(opc != 5);

	    }
	}
