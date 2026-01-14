package ejermplo_Array_Objetos;

import java.util.Arrays;

public class Tienda {

	private String nombre;

	private Producto listaProd[];

	public String getNombre() {

		return nombre;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public Producto[] getListaProd() {

		return listaProd;

	}

	public void setListaProd(Producto[] listaProd) {

		this.listaProd = listaProd;

	}

	public Tienda(String nombre, Producto[] listaProd) {

		super();

		this.nombre = nombre;

		this.listaProd = listaProd;

	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", listaProd=" + Arrays.toString(listaProd) + "]";
	}

	public void agregar(Producto p, int posicion) {

		listaProd[posicion] = p;

	}
	public Producto find_By_Id (int id) {
		
		int i = 0;
		boolean encontrado = true;
		
		while (i < listaProd.length && !encontrado) {
			
			if (listaProd[i].getId()==id)
				encontrado = true;
			
			else 
				i++;
		}
		if (encontrado) 
		return listaProd[i];
		else
		return null;
		
	}
	public void find_By_Id_V2 (int id) {
		
		
		
	}

}
