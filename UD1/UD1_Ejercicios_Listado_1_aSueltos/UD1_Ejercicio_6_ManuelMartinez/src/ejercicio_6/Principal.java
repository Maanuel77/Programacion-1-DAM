package ejercicio_6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int precio = 1499;
		int descuento = 20;
		int porciento = 100;
		double prec_desc;
		double cant_desc;
	
		
		System.out.println("Buenas, este programa va a calcular una oferta al nuevo IPhone que han sacado al mercado.");
		cant_desc = (precio * descuento) / porciento;
		prec_desc = precio - cant_desc;
		System.out.printf("El precio del IPhone es de 1499 € sin descuento y aplicandole un 20 de descuento el IPhone valdrá: %.2f", prec_desc);

	}

}
