package ejemplo_operaciones;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] edades;
		int tam, elemento, suma = 0;
		double media;
		System.out.println("Cuantas edades va a guardar?");
		tam = Leer.datoInt();
		
		edades = new int [tam];
		for (int i = 0; i < edades.length; i++) {
			
			System.out.println("Diga una edad: ");
			edades [i] = Leer.datoInt();
			
		}
		
		System.out.println("Ahora mismo el array tiene esto.");
		for (int i = 0; i < edades.length; i++) {
			
			System.out.println(" Valor: "+ edades [i]);
			
		}
		
		for (int i = 0; i < edades.length; i++) {
			
			if (edades [i] == 18) 
				
				edades [i] = 0;
			}
			
			System.out.println("\nEl array se ha quedado así.");
			for (int i = 0; i < edades.length; i++) {
				
				System.out.println(" Valor: "+ edades [i]);
				
			}
			
			//Mostrar el elemento que quiera el usuario.
			
			System.out.println("\nDiga el elemento que quiera ver: ");
			elemento = Leer.datoInt();
			elemento = elemento - 1;
			System.out.println("El elemento que quiere ver tiene un valor de: "+ edades [elemento]);
			
			//Sumar todos los elementos.
			
			for (int i = 0; i < edades.length; i++) {
				
				suma = suma + edades[i];
				
			}
			
			System.out.println("\nLa suma vale: "+ suma);
			
			media = (double)suma / edades.length; //NO SE USA TAM, SE TIENE QUE USAR EDADES.LENGTH
			
			System.out.printf("La media de las edades es %.2f", media);
		}
		
	}

