package ejercicio_02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, lugar, gasto_1 = "Hoteles", gasto_2 = "Comidas y cenas", gasto_3 = "Gasolina", gasto_4 = "Entradas";
		double din_1, din_1_Total, IVA_1, din_2, IVA_2 ,din_3, IVA_3, din_3_Total, din_4, IVA_4,total_IVA, total_Din, total_Din_IVA, sub_1, sub_2, sub_3, sub_4, din_Rest, media, entregado, devolucion;
		int dias, IVA = 21, porciento = 100, descuento, veces_Gasol, din_Banco = 1500;
		
		System.out.println("Hola, está ante un programa que calcula sus gastos en el viaje que ha tenido: ");
		
		System.out.println("Para comenzar diga su nombre y primer apellido: ");
		nombre = Leer.dato();
		System.out.println("Diga a donde viajó. ");
		lugar = Leer.dato();
		
		System.out.println("Hola "+ nombre +", para comenzar con el ticket de los gastos comience introduciendo las noches que estuvo de viaje: ");
		dias = Leer.datoInt();
		System.out.println("Y ahora introduzca el precio de una noche en el hotel en el que se alojó: ");
		din_1 = Leer.datoDouble();
		System.out.println("¿Tuvo algún descuento en su estancia? Si es así introduzca el porcentaje. ");
		descuento = Leer.datoInt();
		din_1_Total = din_1 * dias;
		din_1_Total = din_1_Total * (1 - (double)descuento/porciento);
		
		
		System.out.println("Indique cuanto se gastó en comida durante su estancia fuera: ");
		din_2 = Leer.datoDouble();
		
		System.out.println("A continuación indique los gastos por cada repostaje en gasolina: ");
		din_3 = Leer.datoDouble();
		System.out.println("¿Cuantas veces respostó?");
		veces_Gasol = Leer.datoInt();
		din_3_Total = din_3 * veces_Gasol;
		
		
		System.out.println("Por último introduzca el gasto total en visitas culturales y museos: ");
		din_4 = Leer.datoDouble();
		
		//Cálculos.
		//Yo he calculado también el IVA de cada uno de los gastos.
		
		IVA_1 = din_1_Total * ((double)IVA/porciento);
		IVA_2 = din_2 * ((double)IVA/porciento);
		IVA_3 = din_3_Total * ((double)IVA/porciento);
		IVA_4 = din_4 * ((double)IVA/porciento);
		
		sub_1 = din_1_Total + IVA_1;
		sub_2 = din_2 + IVA_2;
		sub_3 = din_3_Total + IVA_3;
		sub_4 = din_4 + IVA_4;
		
		total_IVA = IVA_1 + IVA_2 + IVA_3 + IVA_4;
		total_Din_IVA = sub_1 + sub_2 + sub_3 + sub_4;
		total_Din = din_1_Total + din_2 + din_3_Total + din_4;
		
		din_Rest = din_Banco - total_Din_IVA;
		media = total_Din_IVA / dias;
		
		// Devolución: 
		System.out.printf("Usted se ha gastado %.2f € en el viaje, diga con cuanto dinero desea pagar: ",total_Din_IVA);
		entregado = Leer.datoDouble();
		devolucion = entregado - total_Din_IVA;
		
		//Ticket de compra.
		
		System.out.printf ("\nNombre del cliente: %s, \n\nSu desglose de gastos en en viaje a %s: \n"
				+ "\nNombre del gasto \t Gasto \t\tCantidad \t\t IVA \t\t Subtotal" 
				+ "\n-----------------------------------------------------------------------------------------"
				+ "\n%s\t\t\t %.2f € \t %d \t\t\t %.2f €\t %.2f €"
				+ "\n%s\t\t %.2f € \t    \t\t\t %.2f €\t %.2f €"
				+ "\n%s\t\t %.2f €\t %d \t\t\t %.2f €\t %.2f €"
				+ "\n%s\t\t %.2f € \t    \t\t\t %.2f €\t\t %.2f €"
				+ "\n-----------------------------------------------------------------------------------------"
				+ "\n\t\t\t\t\t\t\t   Gasto total sin IVA: %.2f €"
				+ "\n\t\t\t\t\t\t\t\t     IVA total: %.2f €"
				+ "\n\t\t\t\t\t\t\t   ------------------------------"
				+ "\n\t\t\t\t\t\t\t   Gasto total con IVA: %.2f €"
				+ "\n\t\t\t\t\t\t\t   ------------------------------"
				+ "\n\t\t\t\t\t\t\t      Dinero entregado: %.2f €"
				+ "\n\t\t\t\t\t\t\t\t     Devolución: %.2f €"
				+ "", nombre, lugar, gasto_1, din_1, dias, IVA_1, sub_1, gasto_2, din_2, IVA_2, sub_2, gasto_3, din_3, veces_Gasol, IVA_3, sub_3, gasto_4, din_4, IVA_4, sub_4, total_Din, total_IVA, total_Din_IVA, entregado, devolucion);
 		
		System.out.printf("\n\nTeniendo en cuenta que usted tenía una cantidad de %d € en el banco, habiendo gastado \n"
				+ "%.2f € en el viaje le queda una cantidad de %.2f € en la cuenta del banco.", din_Banco, total_Din_IVA, din_Rest);
		System.out.printf("\n\nHa gastado una media de %.2f € por día.", media);
		
		System.out.println("\n\n\nGracias por usar mi programa :)");
		
		
	}

}
