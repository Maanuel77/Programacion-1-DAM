package ejemplo_01;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Producto> listaProductos = new ArrayList <Producto> ();
		
		
		//Creamos un producto
		Producto p1 = new Producto ("Lechuga", 1.50, true);
		listaProductos.add(p1);
		System.out.println(listaProductos);
		Producto p2 = new Producto ("Pepino", 1.50, true);
		listaProductos.add(p2);
		listaProductos.remove(0);
		Producto p3 = new Producto ("Pepino", 1.50, true);
		listaProductos.add(p3);
		System.out.println(listaProductos);
		
	}

}
