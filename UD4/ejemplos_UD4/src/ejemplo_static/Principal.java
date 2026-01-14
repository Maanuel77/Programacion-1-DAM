package ejemplo_static;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		double ganancia = 0;
		Producto p1, p2, p3;
		contador ++;
		
		p1 = new Producto ("Patatas", 10);
		System.out.println(p1);
		p2 = new Producto ("Donuts", 2);
		System.out.println(p2);
		p3 = new Producto ("Lechuga", 5);
		System.out.println(p3);
		
		
		//Vendo los productos 
		System.out.println("Cuánto le va a ganar a los productos");
		ganancia = Leer.datoDouble();
		
		
	}
	
}
