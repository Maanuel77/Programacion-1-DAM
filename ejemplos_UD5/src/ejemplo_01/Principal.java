package ejemplo_01;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Producto> listaProductos = new ArrayList <Producto> ();
		
		
		//Creamos un producto
		Producto p1 = new Producto ("Lechiga", 1.50, true);
		listaProductos.add(p1);
		listaProductos.size();
		System.out.println(listaProductos);
	}

}
