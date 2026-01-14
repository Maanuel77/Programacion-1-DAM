package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int op, op_Filtrar, n_Mov = 0, cant_Vendido = 0, id;
		double precio_Unitario, pagado;
		String marca, modelo;
		boolean nuevo;

		Movil lista_Mov[] = new Movil[100];
		Vendedor vend = new Vendedor(0, lista_Mov);

		System.out.println("Bienvenido al sistema del vendedor.");

		do {

			System.out.println("\nIndique una opción:");
			System.out.println("Pulse 1 - Comprobar cantidad de móviles vendidos.");
			System.out.println("Pulse 2 - Añadir un móvil al sistema.");
			System.out.println("Pulse 3 - Vender un móvil.");
			System.out.println("Pulse 4 - Calcular ingresos totales de vender todos los productos.");
			System.out.println("Pulse 5 - Eliminar móviles vendidos del sistema.");
			System.out.println("Pulse 0 - Salir del programa");
			op = Leer.datoInt();

			System.out.println();

			switch (op) {

			case 0:
				break;

			case 1:

				System.out.printf("Se han vendido un total de %d móvil(es).\n", cant_Vendido);

				break;

			case 2:

				System.out.println("Indique la marca del móvil:");
				marca = Leer.dato();

				System.out.println("Indique el modelo del móvil:");
				modelo = Leer.dato();

				System.out.println("Indique el precio del móvil:");
				precio_Unitario = Leer.datoDouble();

				System.out.println("Introduzca 1 si el móvil es de segunda mano y otro número para ignorarlo:");
				if (Leer.datoInt() == 1) {

					nuevo = false;
					precio_Unitario = vend.calcularPrecioSegundaMano(precio_Unitario);

				} else {

					nuevo = true;

				}

				lista_Mov[n_Mov] = new Movil(marca, modelo, precio_Unitario, false, nuevo);

				n_Mov++;

				System.out.println("\nEl móvil se añadió al sistema correctamente.");

				break;

			case 3:

				if (lista_Mov[0] == null) {

					System.err.println("No existen móviles en el sistema.");

				} else {

					System.out.println("¿Cómo quiere encontrar su nuevo móvil?");
					System.out.println("Pulse 1 - Mostrar todos");
					System.out.println("Pulse 2 - Filtrar por marca");
					System.out.println("Pulse 3 - Filtrar por modelo");
					System.out.println("Pulse 4 - Filtrar por precio");
					System.out.println("Pulse 5 - Buscar por ID");
					op_Filtrar = Leer.datoInt();

					while (op_Filtrar < 1 | op_Filtrar > 5) {

						System.err.println("Debe seleccionar una opción válida:");

						System.out.println("Pulse 1 - Mostrar todos");
						System.out.println("Pulse 2 - Filtrar por marca");
						System.out.println("Pulse 3 - Filtrar por modelo");
						System.out.println("Pulse 4 - Filtrar por precio");
						System.out.println("Pulse 5 - Buscar por ID");
						op_Filtrar = Leer.datoInt();

						System.out.println();

					}

					switch (op_Filtrar) {

					case 1:

						vend.mostrarTodosMoviles();

						break;

					case 2:

						System.out.println("Introduzca el nombre de la marca:");
						marca = Leer.dato();

						vend.filtrarMarca(marca);

						break;

					case 3:

						System.out.println("Introduzca el nombre del modelo:");
						modelo = Leer.dato();

						vend.filtrarModelo(modelo);

						break;

					case 4:

						System.out.println("Introduzca el precio máximo que está dispuesto a gastar:");
						precio_Unitario = Leer.datoDouble();

						vend.filtrarPrecio(precio_Unitario);

						break;

					case 5:

						System.out.println("Indique el ID del producto que busca:");
						id = Leer.datoInt();

						vend.buscarID(id - 1);

						break;

					}

					System.out.println("\nIndique el ID del producto a comprar o pulse 0 si ha cambiado de idea:");
					id = Leer.datoInt();

					if (id != 0) {

						if (lista_Mov[id - 1].isVendido()) {

							System.err.println("\nERROR - EL MÓVIL YA SE HA VENDIDO");

						} else {

							System.out.printf(
									"\nEl precio a pagar del %s %s es de %.2f€. ¿Con qué cantidad va a pagar?\n",
									lista_Mov[id - 1].getMarca(), lista_Mov[id - 1].getModelo(),
									lista_Mov[id - 1].getPrecioUnitario()); // Variable cambiada: listaMov
							pagado = Leer.datoDouble();

							if (pagado >= lista_Mov[id - 1].getPrecioUnitario()) {

								vend.vender((id - 1));

								System.out.printf("Su cambio es de %.2f€. Disfrute su nuevo producto.\n",
										vend.devolverCambio((id - 1), pagado));
								cant_Vendido++;

							} else {

								System.err.println("Cantidad insuficiente. Se cancelará la operación.");

							}

						}

					}

				}

				break;

			case 4:

				if (lista_Mov[0] == null) {

					System.err.println("No existen móviles en el sistema.");

				} else {

					System.out.printf(
							"Actualmente se han ingresado %.2f€ y quedan por ingresar en ventas %.2f€. Al final se habrán ingresado %.2f€.\n",
							vend.getTotalVendido(), vend.calcularVenderTodo(),
							(vend.getTotalVendido() + vend.calcularVenderTodo()));

				}

				break;

			case 5:

				vend.vaciarMovilDisponible();

				vend.rellenarMovilDisponible();

				vend.actualizarListaMov();

				System.out.println("Los móviles ya vendidos han desaparecido del sistema.");

				break;

			}

		} while (op != 0);

		System.out.println("\n\n-----Gracias por usar este programa-----");

	}

}
