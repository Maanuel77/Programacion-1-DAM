package ejercicio_10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio, precio_Prueba = 12.99, desc_Final_Prueba, desc, porciento, prec_Final, prec_Final_Prueba, desc_Prueba = 0.03, desc_Final, num_Prod;
		
		System.out.println("Hola buenas, este programa se trata de aplicar un 3% de descuento a un producto, a continuación un ejemplo: ");
		System.out.printf("\nNos encontramos ante un cliente que compra 4 unidades de un producto que cuesta %.2f al que se le aplica un descuento del 3 Por ciento", precio_Prueba);
		desc_Final_Prueba = (4 * precio_Prueba) * desc_Prueba;
		prec_Final_Prueba = (precio_Prueba * 4) - desc_Final_Prueba;
		System.out.printf("\nEl precio final del ejemplo sería %.2f €.", prec_Final_Prueba);
		System.out.println("\n\nAhora le toca a usted introducir el precio del producto que va a comprar: ");
		precio = Leer.datoDouble();
		System.out.println("A continuación introduzca el porcentaje de descuento que se le aplica al producto: ");
		desc = Leer.datoDouble();
		System.out.println("Por último la cantidad de producto que desea comprar: ");
		num_Prod = Leer.datoDouble();
		porciento = desc / 100;
		desc_Final = (num_Prod * precio) * porciento;
		prec_Final = (precio * num_Prod) - desc_Final;
		
		System.out.printf("Teniendo en cuenta que el precio de su producto es %.2f €, va a comprar %.0f unidades y se le aplica un %.0f porciento de descuento, el precio final es de %.2f €." , precio , num_Prod , desc, prec_Final);
		
		
	}

}
