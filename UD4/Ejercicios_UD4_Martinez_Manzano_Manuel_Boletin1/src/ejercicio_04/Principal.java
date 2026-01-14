package ejercicio_04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producto p1=new Alimentacion(2.5, "Pringles", "1", 10);
		Producto p2=new Electronica(0.75, "Esponja", "2", 21);
		Producto p3=new Electronica(1.25, "Globos", "3", 21);
		
		LineaVenta lv1=new LineaVenta(p1, 1);
		LineaVenta lv2=new LineaVenta(p2, 2);
		LineaVenta lv3=new LineaVenta(p3, 1);

		LineaVenta lista[]=new LineaVenta [3];

		lista[0]=lv1;
		lista[1]=lv2;
		lista[2]=lv3;

		
		Venta v=new Venta(lista);
		
		v.imprimirTiquet();

	}

}
