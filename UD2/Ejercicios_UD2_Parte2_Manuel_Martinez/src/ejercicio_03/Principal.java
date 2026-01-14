package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num;
		int tam=8, ceros=0;
		double media=0;
		
		System.out.println("Este programa muestra la media de unos números y dice la cantidad de 0\n");
		
		num=new int [tam];
		for(int i=0;i<num.length;i++) {
			
			System.out.println("Introduce un número: ");
			num[i]=Leer.datoInt();
			if(num[i]==0) {
				
				ceros++;
			}
		}
		
		for(int i=0;i<num.length;i++) {
			
			media=media+num[i];
		}
		media=media/num.length;
		
		System.out.printf("La media de los número es: %.2f",media);
		System.out.println("\n\nTotal de ceros: "+ceros);
	}

}

