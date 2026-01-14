package ejercicio_07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precio, prec_Total, descuento;
		int cant, porc = 100, min_Descuento = 100;
		
		System.out.println("Hola, este programa calcula el precio de una cuenta y si tiene descuento o no.");
		
		System.out.println("\nIntroduzca el precio del producto que va a comprar: ");
		precio = Leer.datoDouble();
		System.out.println("¿Cuantos productos se va a llevar?");
		cant = Leer.datoInt();
		
		prec_Total = precio * cant;
		
		if (prec_Total > min_Descuento) {
			
			System.out.printf("Felicidades, el precio de su compra es de %.2f€ por lo que supera los %d€ minímo para aplicar descuento, \nintroduzca el porcentaje de descuento aplicable: ",prec_Total, min_Descuento);
			descuento = Leer.datoDouble();
			prec_Total = prec_Total * (1 - descuento/porc);
			System.out.printf("\nSu compra se ha quedado en %.2f€ con el descuento aplicado de %.2f", prec_Total, descuento);	
			
		} else {
			
			System.out.printf("El precio de su compra no tiene descuento, por lo que el total es de %.2f€", prec_Total);
			
		}
		
		System.out.println("\n\nGracias por usar el programa :)");
		
	}

}
