package ejercicio_01;

public class Sobremesa extends Ordenador{

	public double precio_Montaje;

	public Sobremesa(double capacidad_Disco_Duro, double frecuencia_CPU, String marca, double precio_Base,
			double precio_Montaje) {
		super(capacidad_Disco_Duro, frecuencia_CPU, marca, precio_Base);
		this.precio_Montaje = precio_Montaje;
	}
	
	
}
