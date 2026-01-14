package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam, edad, id, horas_Estudio, cont = 0;
		Hijo h1, h2;
		String nomb;
		GestionFamiliar gf1;
		Hijo [] lista;

		//v1 sin objetos de prueba
		System.out.println("Diga nombre del hijo 1: ");
		nomb = Leer.dato();
		System.out.println("Diga tamaño:  ");
		tam = Leer.datoInt();
		
		
		h1 = new Hijo (nomb, 1, 23, 6);
		h2 = new Hijo ("Miguel" , 2 , 12, 3);
		
		lista = new Hijo [tam];
		//Formas de rellenar la lista
		
		//1. Mala
		lista [0] = h1;

		//2. Solamente de prueba
		Hijo [] lista_Prueba= {h1, h2};
		System.out.println(lista_Prueba [0]);
		System.out.println(lista_Prueba [1]);
		
		//3. Con agregar
		
		//Crear un objeto del tipo GestionFamiliar
		
		GestionFamiliar gf2 = new GestionFamiliar (lista_Prueba, 200);
		
		
		//Case 1.
		
		System.out.println("Diga nombre: ");
		nomb = Leer.dato();
		System.out.println("Diga edad: ");
		edad = Leer.datoInt();
		System.out.println("Diga id: ");
		id = Leer.datoInt();
		System.out.println("Diga horas de estudio: ");
		horas_Estudio = Leer.datoInt();
		
		gf2.agregar(new Hijo(nomb, id, edad, horas_Estudio), cont);
		cont ++;
		
		
	}

}
