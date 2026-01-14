package ejercicio_01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p = new Producto();
		Producto lista[] = new Producto[10];
		Tienda t = new Tienda(lista);
		int opcion, cant = 0;
		String nombre;
		double precio_Fabrica, porcentaje;
		int fragil, id;

		System.out.println("Bienvenido al programa de mi Tienda");

		do {
			System.out.println("\n1. Agregar un producto");
			System.out.println("2. Listar datos");
			System.out.println("3. Comprobar por ID si es frágil o no");
			System.out.println("4. Calcular total de precio de compras");
			System.out.println("5. Calcular PVP");
			System.out.println("6. Calcular ganancias si se vende todo");
			System.out.println("0. Salir del programa");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:

				if (cant < lista.length) {
					System.out.println("\n--- AGREGAR PRODUCTO ---");
					System.out.println("1. Diga el nombre del producto");
					nombre = Leer.dato();
					System.out.println("2. Diga el coste de fabricación del producto");
					precio_Fabrica = Leer.datoDouble();
					System.out.println("3. Pulse 1 en caso de que sea frágil y 2 en caso de que no lo sea");
					fragil = Leer.datoInt();
					id = p.generar_ID();

					lista[cant] = new Producto(nombre, precio_Fabrica, p.comprobar_Fragil_Boleano(fragil), 0.0, id);
					cant++;

					System.out.println("Producto agregado con éxito. ID: " + id);
				} else {
					System.out.println("La lista de productos está llena.");
				}
				break;

			case 2:

				t.mostrar_Lista_Productos(lista, cant);
				break;

			case 3:

				System.out.println("Introduzca el ID del producto que desea comprobar: ");
				id = Leer.datoInt();
				if (t.buscar_Producto_Id_Fragil(lista, cant, id)) {

					System.out.println("El producto es fragil.");

				} else {

					System.out.println("El producto no es frágil");

				}
				break;

			case 4:

				System.out.println("El precio de fabrica total de todos los productos es de: " + t.calcular_Total(cant, lista));
				break;
			case 5:
				System.out.println("Para calcular el precio de venta al público indique el porcentaje añadido a los productos: " );
				porcentaje = Leer.datoDouble();
				t.calcular_PVP(porcentaje, cant, lista);
				t.imprimir_PVP(lista, cant);
				break;
			case 6:
				System.out.println("Ganancias si se vende todo: "+ t.calcular_Ganancias_Totales(lista, cant));
				break;
			case 0:

				System.out.println("Gracias por usar el programa :)");
				break;
			default:

				System.out.println("Número introducido incorrecto");

			}

		} while (opcion != 0);
	}

}
