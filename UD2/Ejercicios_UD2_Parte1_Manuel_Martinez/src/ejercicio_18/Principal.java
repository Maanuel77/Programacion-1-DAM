package ejercicio_18;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas, horas_Corte = 40, prec_Norm = 16, prec_Extra = 20, horas_Extra;
		
		double ganado;
		
		System.out.println("Hola, está ante un programa que calcula el salario de un obrero");
		System.out.println("Introduzca las horas trabajadas: ");		
		horas = Leer.datoInt();
		
		if (horas > 40) {
			
			horas_Extra = horas - horas_Corte;
			ganado = (horas * prec_Norm) + (horas_Extra * prec_Extra);
			System.out.printf("El obrero ha trabajado %d horas y ha ganado %.2f", horas, ganado);
			
		} else {
			
			ganado = horas * prec_Norm;
			System.out.printf("El obrero ha trabajado %d horas y ha ganado %.2f", horas, ganado);
			
		}
		
		
	}

}
