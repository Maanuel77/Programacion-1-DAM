package ejemplo_polimorfismo;

public class Operaciones_Figuras {

	public double calcular_El_Area_De_Una_Figura (Figura f) {
		
		return f.calcular_Area();
		
	}
	
	public double calcular_El_Perimetro_De_Una_Figura (Figura f) {
		
		return f.calcular_Perimetro();
		
	}
	
	public double sumar_Areas (Figura [] listado) {
		
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			
			//Tenemos que llamar al método generado en esta clase y no a otra 
			resultado = resultado + calcular_El_Area_De_Una_Figura(listado [i]);
			
		} 
		
		return resultado;
		
	}
	
} 
