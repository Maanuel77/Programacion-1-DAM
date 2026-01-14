package ejercicio_9;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double capac, CN=105000, olim = 65000, teatro = 600, request; 
		double result_CN, est_Olim, navas_teatro, navas_request;
		String pueblo;
				
		System.out.println ("Hola buenas, el programa de a continuación calculamos distintas capacidades en la unidad de medida de su pueblo, a continuación introduzca el nombre de su pueblo: ");
		pueblo = Leer.dato();
		System.out.println ("Ahora introduzca la cantidad de habitantes de su pueblo: ");
		capac = Leer.datoDouble();
				
		result_CN = CN / capac;
		est_Olim = olim / capac;
		navas_teatro = teatro / capac;
				
		System.out.printf ("\nPor ejemplo el Camp Nou con una capacidad de %.0f personas se convertiría en %.2f %s, por otro lado el estadio olímpico con una \ncapacidad de %.0f se "
						+ "convierte en %.2f %s y por último, el teatro con una capacidad de %.0f personas se convertirá en %.2f %s. " , CN , result_CN ,pueblo, olim , est_Olim ,pueblo, teatro , navas_teatro, pueblo);
				
		System.out.println("\n\nA continuación introduzca alguna cantidad de personas de las que te gustaría saber la medida en Navas: ");
		request = Leer.datoDouble();
		navas_request = request / capac;
		System.out.printf("Las %.0f personas que has dicho se convertirían en %.2f %s." , request , navas_request, pueblo);
		
		System.out.println ("\nGracias por usar el programa :)");
						
						
	}
	

}
