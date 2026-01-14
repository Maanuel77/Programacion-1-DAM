package utilidades;

import java.io.*;

public class Leer{
	
 public static String dato()
  {
  String sdato=" ";
  try{
  	 InputStreamReader isr=new InputStreamReader(System.in);
  	 BufferedReader flujoE = new BufferedReader(isr);
  	 sdato=flujoE.readLine();
  	 }
  catch (IOException e)
  	{
  	System.out.println("Error "+e.getMessage());
  	}
  return sdato;
  
  }

 public static int datoInt()
  {
  return Integer.parseInt(dato());
  }
  

 public static float datoFloat()
  {
  return Float.parseFloat(dato());	
  }
//Leer un char por teclado

public static char datoChar( ){
	char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			 c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
	return c;
	}
  
 public static long datoLong()
  {
  return Long.parseLong(dato());
  }
 
 public static short datoShort()
  {
  return Short.parseShort(dato());	
  }
 
 public static double datoDouble()
  {
  return Double.parseDouble(dato());	
  }
  
}

/*
 * Ticket[] lista_Ticket;
		lista_Ticket = new Ticket[100];
		Sala s;
		Ticket t = new Ticket();
		s = new Sala(lista_Ticket, 1, 100, t);
		String cartelera = "Spiderman";
		int num_Identificativo, fila, num_Butaca, opcion, ocupacion, cant = 0;
		double precio;
 * 
 * 	lista_Ticket[cant] = new Ticket(num_Identificativo, t.check_Ocupacion(ocupacion), fila, num_Butaca);
					cant++;
					
	public boolean comprobar_Asiento_Sala (int cant, int ID_Entrada_Usuario) {
		
		for (int i = 0; i < cant; i++) {
			
			Ticket t = lista_Ticket[i];
			
			if (t.getNum_Identificativo() == ID_Entrada_Usuario) {
				
				return t.isOcupacion();
			}
		}
		
		return false;
	}
 * */