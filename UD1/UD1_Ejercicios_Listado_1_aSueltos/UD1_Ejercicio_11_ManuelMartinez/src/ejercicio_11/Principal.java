package ejercicio_11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double caudal, metro_cub = 1000, deposito, horas, segundos, total_caudal;
		
		System.out.println("Hola buenas, está ante un programa que calcula los litros introducidos en un depósito, calculando el resultado en metros cúbicos utilizados.");
		System.out.println("\nIntroduzca la cantidad de caudal en litros por segundo: ");
		caudal = Leer.datoDouble();
		System.out.println("Ahora introduzca la cantidad de horas que ha estado funcionando: ");
		horas = Leer.datoDouble();
		segundos = horas * 3600;
		total_caudal = caudal * segundos;
		deposito = total_caudal / metro_cub;
		System.out.printf ("Teniendo en cuenta que su pozo tiene una capacidad de sacar agua de %.2f L/s y que ha estado funcionando %.2f horas, el depósito ha acumulado %.2f metros cúbicos",caudal,horas,deposito);
	}

}
