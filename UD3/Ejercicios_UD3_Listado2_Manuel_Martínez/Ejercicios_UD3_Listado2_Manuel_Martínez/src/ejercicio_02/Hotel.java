package ejercicio_02;

import java.util.Arrays;

public class Hotel {

	private Habitacion[] lista_Habitaciones;
	private Habitacion ha;

	public Hotel(Habitacion[] lista_Habitaciones) {
		super();
		this.lista_Habitaciones = lista_Habitaciones;
	}

	public Habitacion[] getLista_Habitaciones() {
		return lista_Habitaciones;
	}

	public void setLista_Habitaciones(Habitacion[] lista_Habitaciones) {
		this.lista_Habitaciones = lista_Habitaciones;
	}

	@Override
	public String toString() {
		return "Hotel [lista_Habitaciones=" + Arrays.toString(lista_Habitaciones) + "]";
	}

	public void imprimir_Menu() {

		System.out.println("\n1. Agregar una habitación a la lista.");
		System.out.println("2. Ver si esta ocupada o no");
		System.out.println("3. Servicios extra");
		System.out.println("4. Calcular precio final a pagar");
		System.out.println("5. Imprimir factura");
		System.out.println("0. salir del programa :(");

	}

	public void imprimir_Menu_Servicios_Extra() {

		System.out.println("--- AGREGAR SERVICIOS EXTRA ---");
		System.out.println("1. Bar");
		System.out.println("2. Excursiones");
		System.out.println("3. Zona vip");
		System.out.println("0. Salir");
	}

	public boolean comprobar_Ocupacion(int ocupacion) {

		return ha.check_Ocupacion(ocupacion);

	}

	public double calcular_Precio_Extras(Habitacion[] lista, double gasto, int num_Habitacion, int cant) {
		int posicion = 0;
		double total_Extra = 0;

		for (int i = 0; i < cant; i++) {

			Habitacion h = lista[i];
			if (num_Habitacion == h.getNum_Habitacion()) {

				break;

			} else {

				posicion++;

			}

		}
		Habitacion h1 = lista[posicion];
		total_Extra = h1.getPrecio_Extras() + gasto;
		h1.setPrecio_Extras(total_Extra);
		return total_Extra;
	}

	public boolean comprobar_Disponibilidad(Habitacion[] lista, int cant, int num_Habitacion) {

		int posicion = 0;

		for (int i = 0; i < cant; i++) {

			Habitacion h = lista[i];
			if (num_Habitacion == h.getNum_Habitacion()) {

				break;

			} else {

				posicion++;

			}

		}
		Habitacion h1 = lista[posicion];
		 return h1.isOcupada();		

	}
	
	public double calcular_Precio_Total (Habitacion[] lista, int cant, int num_Habitacion) {
		
		int posicion = 0;

		for (int i = 0; i < cant; i++) {

			Habitacion h = lista[i];
			if (num_Habitacion == h.getNum_Habitacion()) {

				break;

			} else {

				posicion++;

			}

		}
		Habitacion h1 = lista[posicion];
		return h1.getPrecio_Base() + h1.getPrecio_Extras();
		
	}
	public void factura (Habitacion[] lista, int cant, int num_Habitacion) {
		
		int posicion = 0;

		for (int i = 0; i < cant; i++) {

			Habitacion h = lista[i];
			if (num_Habitacion == h.getNum_Habitacion()) {

				break;

			} else {

				posicion++;

			}

		}
		Habitacion ha = lista[posicion];
		
		double precioBase = ha.getPrecio_Base();
        double precioExtras = ha.getPrecio_Extras();
        
        double subtotal = precioBase + precioExtras;
        double impuesto = subtotal * 0.10; 
        double total = subtotal + impuesto;

        System.out.println("==========================================");
        System.out.println("          FACTURA DE ALOJAMIENTO        ");
        System.out.println("==========================================");
        System.out.println("  Cliente:          " + ha.getCliente());
        System.out.println("  Habitación Nº:    " + ha.getNum_Habitacion());
        System.out.println("  Tipo:             " + ha.getTipo_Habitacion());
        System.out.println("------------------------------------------");
        
        System.out.printf("  Precio Base:      %.2f €%n", precioBase);
        System.out.printf("  Cargos Extras:    %.2f €%n", precioExtras);
        System.out.println("------------------------------------------");
        System.out.printf("  Subtotal:         %.2f €%n", subtotal);
        System.out.printf("  Impuesto (10%%):   %.2f €%n", impuesto);
        System.out.println("==========================================");
        System.out.printf("  TOTAL A PAGAR:    %.2f €%n", total);
        System.out.println("==========================================");
        
        if (ha.isLimpieza()) {
             System.out.println("  (Limpieza finalizada)");
        } else {
             System.out.println("  (Limpieza pendiente)");
        }
    }
		
	

}