package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion ha = new Habitacion ();
		Habitacion [] lista = new Habitacion [100];
		Hotel ho = new Hotel (lista);
		int opcion, cant = 0, num_Habitacion=0, tipo_Habit, ocupada = 1, limpia, opcion_Extras, identificar_Habitacion;
		double precio_Base, precio_Extras = 0, gasto;
		String nombre;
		
		do {
			
			ho.imprimir_Menu();
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
				case 1:
					
					System.out.println("Para agregar una habitacion a la lista diga primero diga su número de habitacion.");
					num_Habitacion = Leer.datoInt();
					System.out.println("Ahora digo que tipo de habitacion es, 1 si es sencilla, 2 si es doble, o 3 si es triple");
					tipo_Habit = Leer.datoInt();
					System.out.println("Diga su precio base: ");
					precio_Base = Leer.datoDouble();
					System.out.println("Diga el nombre del cliente: ");
					nombre = Leer.dato();
					System.out.println("Diga 1 si esta ocupada o 2 si no lo esta");
					ocupada = Leer.datoInt();
					System.out.println("Diga 1 si esta limpia o 2 si no lo esta");
					limpia = Leer.datoInt();
					
					lista [cant] = new Habitacion (num_Habitacion, ha.check_Tipo_Habitacion(tipo_Habit), precio_Base, nombre, ha.check_Limpieza(limpia), ha.check_Ocupacion(ocupada), precio_Extras);
					cant++;
					
					System.out.println("Habitación agregada con éxito, número de habitacion: " + num_Habitacion);
					break;
					
					
				case 2:
					System.out.println("Diga su número de habitación");
					identificar_Habitacion = Leer.datoInt();
					if (ho.comprobar_Disponibilidad(lista, cant, identificar_Habitacion)) {
					 System.out.println("La habitacion está ocupada");
					}else {	
						System.out.println("La habitación está libre");
					}
					
					break;
					
				case 3:
					do {
						System.out.println("Diga su número de habitacion: ");
						identificar_Habitacion = Leer.datoInt();
						ho.imprimir_Menu_Servicios_Extra();
						opcion_Extras = Leer.datoInt();
						
						switch (opcion_Extras) {
						
							case 1:
								
								System.out.println("Diga cuanto se ha gastado en el bar: ");
								gasto = Leer.datoDouble();
								System.out.printf("Lleva %.2f€ gastado en extras", ho.calcular_Precio_Extras(lista, gasto, identificar_Habitacion, cant));
								break;
								
							case 2:
								System.out.println("Diga cuanto se ha gastado en las excursiones: ");
								gasto = Leer.datoDouble();
								System.out.printf("Lleva %.2f€ gastado en extras", ho.calcular_Precio_Extras(lista, gasto, identificar_Habitacion, cant));
								break;
								
							case 3:
								System.out.println("Diga cuanto se ha gastado en el servicio VIP: ");
								gasto = Leer.datoDouble();
								System.out.printf("Lleva %.2f€ gastado en extras", ho.calcular_Precio_Extras(lista, gasto, identificar_Habitacion, cant));
								break;
								
							case 0:
								System.out.println("Saliendo de los gastos extra....");
								
							default:
								System.out.println("Número introducido incorrecto");
						}
						
					} while (opcion_Extras != 0);
					
					break;
					
				case 4:
					System.out.println("Diga el número de la habitación: ");
					identificar_Habitacion = Leer.datoInt();
					System.out.printf("El precio total a pagar es de: %.2f", ho.calcular_Precio_Total(lista, cant, identificar_Habitacion));
					
					break;
				case 5:
					
					System.out.println("Diga el número de la habitación: ");
					identificar_Habitacion = Leer.datoInt();
					ho.factura(lista, cant, identificar_Habitacion);
					break;
				case 6:	
				
					System.out.println("Gracias por venir a nuestro hotel :)");
			
				default:
					
					System.out.println("Opcion incorrecta, vuelva a introducirla");
			}
			
		} while (opcion != 0);
		
	}

}