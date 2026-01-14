package ejercicio_07;

import java.util.Random;

public class Lanzar {
	
private int desde =1, hasta = 2, result;
private String cara = "cara", cruz = "cruz";
Random r = new Random(System.nanoTime());
	

	public Lanzar () {	//2pt
	}

	public int cara_Cruz () {
		
		return result= r.nextInt(hasta - desde + 1) + desde;
		
	}
	public String guardar() {//3 / 4pt
		
		if (result == 1) {
			
			return cara;
			
		}else{
			
			return cruz;
			
		}
	}
	public void menu () {
		
		System.out.println("1. Lanzar moneda "
				+ "\n2. Ver resultados obtenidos"
				+ "\n3. Salir del programa");
		
	}
	public void imprimir () { //2pt
		
		if (result == 1) {
			
			System.out.println("Cara");
			
		} else if (result ==2) {
			
			System.out.println("Cruz");
			
		}
		
		
	}
	
	
	
	
}
