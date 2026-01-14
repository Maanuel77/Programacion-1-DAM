package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double millas_Usuario, millas_Metros = 1852, result;
		
		System.out.println("Hola, está ante un conversor de millas marinas a metros ");
		System.out.println("\nIntroduzca las millas marinas que desea pasar a metros: ");
		millas_Usuario = Leer.datoDouble();
		result = millas_Usuario * millas_Metros;
		System.out.printf("\n%.2f millas marinas --------------------> %.2f metros", millas_Usuario, result);
		
		
	}

}
