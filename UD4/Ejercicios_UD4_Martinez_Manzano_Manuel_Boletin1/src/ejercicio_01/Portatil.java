package ejercicio_01;

public class Portatil extends Ordenador{

	private boolean seguro_Pantalla;

	public Portatil(double capacidad_Disco_Duro, double frecuencia_CPU, String marca, double precio_Base,
			boolean seguro_Pantalla) {
		super(capacidad_Disco_Duro, frecuencia_CPU, marca, precio_Base);
		this.seguro_Pantalla = seguro_Pantalla;
	}
	
	
	
}
