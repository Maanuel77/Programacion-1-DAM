package ejemplo_map;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Integer, String> lista = new HashMap <Integer, String> ();
		
		//Agregamos con put
		
		lista.put(1, "Manuel");
		lista.put(2, "German");
		lista.put(3, "Gonzalo");
		lista.put(4, "Marta");
		System.out.println(lista);

		//No claves duplicadas
		lista.put(1, "Programador");
		
		//Mismo valor
		lista.put(5, "Manuel");
		System.out.println(lista);
		
		//Verificar tamaño
		System.out.println("Tamaño: "+lista.size());
		
		//Sacando elementos
		System.out.println(lista);
		System.out.println("Has sacado a: "+ lista.get(3));
		lista.remove(3);
		System.out.println(lista);
		
		//Verificar tamaño
		System.out.println("Tamaño: "+lista.size());
		
		//Sacar lista de claves y de values por separado
		
		System.out.println("Lista de claves: "+lista.keySet());
		System.out.println("Lista valores: "+lista.values());
		
	}

}