package ejemplo_Parametro;

import java.util.Arrays;

public class Venta2 {

	private double total_Venta;
	private String nombre_Vendedor;
	//NO SE INICIALIZA EL ARRAY AQUÍ.
	
	public Venta2(double total_Venta, String nombre_Vendedor) {
		super();
		this.total_Venta = total_Venta;
		this.nombre_Vendedor = nombre_Vendedor;
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

	public double calcular_Media_Impuestos (double [] lista_Impuestos) {
		double suma = 0;
		for (int i = 0 ; i < lista_Impuestos.length; i++) {
		
			suma = suma + lista_Impuestos [i];
			
		}
		return suma/lista_Impuestos.length;
		
	}
	
}



