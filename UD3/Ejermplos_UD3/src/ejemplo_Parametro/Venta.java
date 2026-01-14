package ejemplo_Parametro;

import java.util.Arrays;

public class Venta {

	private double total_Venta;
	private String nombre_Vendedor;
	//NO SE INICIALIZA EL ARRAY AQUÍ.
	private double  lista_Impuestos [];
	
	public Venta(double total_Venta, String nombre_Vendedor, double[] lista_Impuestos) {
		super();
		this.total_Venta = total_Venta;
		this.nombre_Vendedor = nombre_Vendedor;
		this.lista_Impuestos = lista_Impuestos;
	}

	public double getTotal_Venta() {
		return total_Venta;
	}

	public void setTotal_Venta(double total_Venta) {
		this.total_Venta = total_Venta;
	}

	public String getNombre_Vendedor() {
		return nombre_Vendedor;
	}

	public void setNombre_Vendedor(String nombre_Vendedor) {
		this.nombre_Vendedor = nombre_Vendedor;
	}

	public double[] getLista_Impuestos() {
		return lista_Impuestos;
	}

	public void setLista_Impuestos(double[] lista_Impuestos) {
		this.lista_Impuestos = lista_Impuestos;
	}

	@Override
	public String toString() {
		return "Venta [total_Venta=" + total_Venta + ", nombre_Vendedor=" + nombre_Vendedor + ", lista_Impuestos="
				+ Arrays.toString(lista_Impuestos) + "]";
	}
	
	public double calcular_Media_Impuestos () {
		double suma = 0;
		for (int i = 0 ; i < lista_Impuestos.length; i++) {
		
			suma = suma + lista_Impuestos [i];
			
		}
		return suma/lista_Impuestos.length;
		
	}
	
}
