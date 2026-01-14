package ejercicio_01;

import java.util.Arrays;

public class Tienda {

	private Producto[] lista_Prod;

	public Tienda(Producto[] lista_Prod) {
		super();
		this.lista_Prod = lista_Prod;
	}

	public Tienda() {

	}

	public Producto[] getLista_Prod() {
		return lista_Prod;
	}

	public void setLista_Prod(Producto[] lista_Prod) {
		this.lista_Prod = lista_Prod;
	}

	@Override
	public String toString() {
		return "Tienda [lista_Prod=" + Arrays.toString(lista_Prod) + "]";
	}

	public void mostrar_Lista_Productos (Producto [] producto, int cont) {
		
		for (int i = 0; i < cont; i++) {
		
		System.out.println("Producto "+ (i + 1)+": "+ lista_Prod [i]);
		
		}
	}
	
	public boolean buscar_Producto_Id_Fragil (Producto[] lista, int cant, int idBuscado) {

		for (int i = 0; i < cant; i++) {

			Producto p = lista[i];
	     
			if (p.getId() == idBuscado) {
				return true; 
			} 
	        
		}

		return false; 
	}
	public double calcular_Total (int cant, Producto [] lista) {
		double total = 0;
		
		for (int i = 0; i < cant; i++) {
			
			Producto p = lista [i];
			total = p.getPrecio_Fabrica() + total;
		}
		
		return total;
		
	}
	public void calcular_PVP (double porcentaje, int cant, Producto [] lista) {
		double PVP;
		int cien = 100;
		for (int i = 0; i < cant; i++) {
			
			Producto p = lista [i];
			PVP = p.getPrecio_Fabrica() + (p.getPrecio_Fabrica() * porcentaje/cien);
			p.setPrecio_Coste(PVP);
		}
		
	}
	public void imprimir_PVP (Producto [] lista, int cant) {
		
		for (int i = 0; i < cant; i++) {
			
			Producto p = lista [i];
			System.out.println("PVP de "+p.getNombre()+" = "+ p.getPrecio_Coste());
		}
	}
	public double calcular_Ganancias_Totales (Producto [] lista, int cant) {
		double total = 0;
		
		for (int i = 0; i < cant; i++) {
			
			Producto p = lista [i];
			total = total + p.getPrecio_Coste();
			
		}
		
		return total;
	}

}
