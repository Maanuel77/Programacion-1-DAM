package ejemplo_Parametro;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double precio_Base;
		int ref, cantidad;
		double por;
		boolean refrigerado = false;
		String nombre;
		String nombre_Vendedor = "Angel";
		double lista_Imp [] = {30 ,42 ,10};
		double total_Venta = 0.0;
		
		Producto p1;
		Linea_Venta l1;
		Linea_Venta2 l2;
		Venta v;
		Venta2 v2;
		

		
		System.out.println("Diga el nombre: ");
		nombre = Leer.dato();
		System.out.println("Su precio base: ");
		precio_Base = Leer.datoDouble();
		System.out.println("Diga si es refrigerado o no lo es, si lo es pulse 1 y si no lo es pulse 2: ");
		ref = Leer.datoInt();
		if (ref == 1) {
			refrigerado = true;
		}
		p1 = new Producto (nombre, refrigerado , precio_Base );
		
		System.out.println("Diga el porcentaje para calcular el precio de venta al público en caso de que el producto sea refrigerado");
		por = Leer.datoDouble();
		
		System.out.printf("El PVP es: %.2f", p1.calcularPVP(por));
		
		System.out.println("\nDiga la cantidad de productos que va a llevar. ");
		cantidad = Leer.datoInt();
		
		l1 = new Linea_Venta (p1, cantidad);
		System.out.printf("\nEl subtotal es: %.2f", l1.subtotal(cantidad));
		l1.setSubTotal(l1.subtotal(cantidad));
		System.out.println(l1);
		
		v = new Venta (total_Venta, nombre_Vendedor, lista_Imp);
		
		System.out.printf("La media  de los impuestos: %.2f", v.calcular_Media_Impuestos());
		
		v2 = new Venta2 (total_Venta, nombre_Vendedor);
		
		System.out.printf("La media de los impuestos es: %.2f", v2.calcular_Media_Impuestos(lista_Imp));
	}

}
