package ejercicio_04;

import java.util.Arrays;

public class Venta {

	private LineaVenta lista[];

	public Venta(LineaVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaVenta[] getLista() {
		return lista;
	}
	public void setLista(LineaVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	
	public void imprimirTiquet() {
		
		double total=0;
		
		System.out.println("      ------------Man-Mini-Market------------");
		System.out.println("____________________________________________");
		System.out.println("Producto\t       Unidades \t  Precio\t      Total");
		System.out.println("********************************************");
		for(int i=0;i<lista.length;i++) {
			
			lista[i].imprimirLineaVenta();
			total=total+lista[i].getCantidad()*lista[i].getP().getPrecio();
		}
		System.out.println("********************************************");
		System.out.printf("\t\t\t    SubTotal: %.2f€", total);


	}
	
	public double buscar_Mas_Vendido () {
		
	double cien = 0.0;
		
	return cien;
	
	}
}
