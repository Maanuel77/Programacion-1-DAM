package ejercicio_03;

import java.util.Arrays;

public class Vendedor {

	double total_Vendido;

	Movil lista_Mov[] = new Movil[100];
	Movil lista_Movil_Disponible[] = new Movil[100];

	public Vendedor(double total_Vendido, Movil[] lista_Mov) {

		this.total_Vendido = total_Vendido;
		this.lista_Mov = lista_Mov;

	}

	public double getTotalVendido() {
		return total_Vendido;
	}

	public void setTotalVendido(double total_Vendido) {
		this.total_Vendido = total_Vendido;
	}

	public double calcularPrecioSegundaMano(double precio_Unitario) {

		double des = 75, den = 100;

		return precio_Unitario * (des / den);

	}

	public double calcularVenderTodo() {

		double sum = 0;

		for (int i = 0; i < lista_Mov.length && lista_Mov[i] != null; i++) {

			if (lista_Mov[i].isVendido() == false) {

				sum = sum + lista_Mov[i].getPrecioUnitario();

			}

		}

		return sum;

	}

	public void vaciarMovilDisponible() {

		for (int i = 0; i < lista_Movil_Disponible.length; i++) {

			lista_Movil_Disponible[i] = null;

		}

	}

	public void rellenarMovilDisponible() {

		int j = 0;

		for (int i = 0; i < lista_Mov.length && lista_Mov[i] != null; i++) {

			if (lista_Mov[i].isVendido() == false) {

				lista_Movil_Disponible[j] = lista_Mov[i];
				j++;

			}

		}

	}

	public void actualizarListaMov() {

		for (int i = 0; i < lista_Mov.length; i++) {

			if (lista_Movil_Disponible[i] != null) {

				lista_Mov[i] = lista_Movil_Disponible[i];

			} else {

				lista_Mov[i] = null;

			}

		}

	}

	public void mostrarTodosMoviles() {

		for (int i = 0; i < lista_Mov.length && lista_Mov[i] != null; i++) {

			System.out.printf("\nID %d : %s %s   %.2f€  ", (i + 1), lista_Mov[i].getMarca(), lista_Mov[i].getModelo(),
					lista_Mov[i].getPrecioUnitario()); // Variable cambiada: listaMov

			if (lista_Mov[i].isNuevo()) {

				System.out.println("NUEVO");

			} else {

				System.out.println("SEGUNDA MANO");

			}

		}

	}

	public void filtrarMarca(String marca) {

		int cont = 0;

		for (int i = 0; i < lista_Mov.length && lista_Mov[i] != null; i++) {

			if (lista_Mov[i].getMarca().equals(marca)) {

				cont++;

				System.out.printf("\nID %d : %s %s   %.2f€  ", (i + 1), lista_Mov[i].getMarca(),
						lista_Mov[i].getModelo(), lista_Mov[i].getPrecioUnitario()); // Variable cambiada: listaMov

				if (lista_Mov[i].isNuevo()) {

					System.out.println("NUEVO");

				} else {

					System.out.println("SEGUNDA MANO");

				}

			}
		}

		if (cont == 0) {

			mensajeNoEncontrado();

		}

	}

	public void filtrarModelo(String modelo) {

		int cont = 0;

		for (int i = 0; i < lista_Mov.length && lista_Mov[i] != null; i++) {

			if (lista_Mov[i].getModelo().equals(modelo)) {

				cont++;

				System.out.printf("\nID %d : %s %s   %.2f€  ", (i + 1), lista_Mov[i].getMarca(),
						lista_Mov[i].getModelo(), lista_Mov[i].getPrecioUnitario());

				if (lista_Mov[i].isNuevo()) {

					System.out.println("NUEVO");

				} else {

					System.out.println("SEGUNDA MANO");

				}

			}
		}

		if (cont == 0) {

			mensajeNoEncontrado();

		}

	}

	public void filtrarPrecio(double precio_Unitario) {

		int cont = 0;

		for (int i = 0; i < lista_Mov.length && lista_Mov[i] != null; i++) {

			if (lista_Mov[i].getPrecioUnitario() <= precio_Unitario) {

				cont++;

				System.out.printf("\nID %d : %s %s   %.2f€  ", (i + 1), lista_Mov[i].getMarca(),
						lista_Mov[i].getModelo(), lista_Mov[i].getPrecioUnitario());

				if (lista_Mov[i].isNuevo()) {

					System.out.println("NUEVO");

				} else {

					System.out.println("SEGUNDA MANO");

				}

			}
		}

		if (cont == 0) {

			mensajeNoEncontrado();

		}

	}

	public void buscarID(int id) {

		if (lista_Mov[id] == null) {

			mensajeNoEncontrado();

		} else {

			System.out.printf("\nID %d : %s %s   %.2f€  ", (id + 1), lista_Mov[id].getMarca(),
					lista_Mov[id].getModelo(), lista_Mov[id].getPrecioUnitario());

			if (lista_Mov[id].isNuevo()) {

				System.out.println("NUEVO");

			} else {

				System.out.println("SEGUNDA MANO");

			}

		}

	}

	public void mensajeNoEncontrado() {

		System.out.println("No se han encontrado resultados para su búsqueda. Pruebe a hacer una búsqueda nueva.");

	}

	public double devolverCambio(int id, double pagado) {

		return pagado - lista_Mov[id].getPrecioUnitario();

	}

	public void vender(int id) {

		lista_Mov[id].setVendido(true);
		total_Vendido = total_Vendido + lista_Mov[id].getPrecioUnitario();

	}

	@Override
	public String toString() {
		return "Vendedor [total_Vendido=" + total_Vendido + ", lista_Mov=" + Arrays.toString(lista_Mov) + "]";
	}

}