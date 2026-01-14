package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte olim_l=50, olim_a =21;
		double olim_p=2.5, vol_1;
		double cost = 1.8;
		double olim_cost;
		double circ_p=1.8;
		byte circ_r=12, exp =2;
		double vol_2;
		double circ_cost;
		
		System.out.println("Muy buenas, esta ante un programa que calcula el volumen de dos piscinas y posteriormente calcula el precio de llenar las mismas :)");
		System.out.println("\nEl largo de la piscina olímpica son " +olim_l +"m el ancho " +olim_a +"m y la profundidad son " +olim_p+ "m");
		vol_1 = olim_l * olim_a * olim_p;
		System.out.println ("Por lo que el volumen de la piscina olímpica es: " + vol_1 + " m^3" );
		olim_cost = vol_1 * cost;
		System.out.println ("El coste de llenar una piscina olímpca es de: "+ olim_cost + "€");
		System.out.printf ("\nEl radio de la piscina circular es de: " + circ_r + "m y la profundidad es de: " + circ_p+"m");
		vol_2 = Math.PI * Math.pow(circ_r, exp) * circ_p;
		System.out.printf ("Por lo que el volumen de la piscina circular es: %.2f m^3", vol_2);
		circ_cost = cost * vol_2;
		System.out.printf("\nEl coste de llenar una piscina circular es: %.2f €", circ_cost);
		
	}

}
