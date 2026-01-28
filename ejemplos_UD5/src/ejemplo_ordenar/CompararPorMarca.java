package ejemplo_ordenar;

import java.util.Comparator;

public class CompararPorMarca implements Comparator <Corredor>{

	//Comparamos 2 objetos tipo Corredor
	
	public int compare(Corredor c1, Corredor c2) {
		
		String marcac1 = c1.getTiempo();
		String marcac2 = c2.getTiempo();
		
		return (marcac1.toLowerCase().compareTo(marcac2.toLowerCase()));
		
	}
	
}
