package circulo;

public class Circulo {

	private double radio;//Atributo, está en azul claro
	
	//Constructor con parámetros
	
	public Circulo (double radio) { //radio es una variable, está en azul oscuro
		
		this.radio = radio;
		
	}
	public void imprimir_Datos () {
		
		System.out.println("Valor del radio: " + radio);
		
	}
	//Versión 1
	public double area () {
		double area, dos = 2.0;
		
		area = Math.PI * Math.pow(radio, dos);
		
		return area;
	}
	//Versión 2, mejor (sólamente para líneas sencillas de operaciones)
	
	public double area2 () {
		double dos = 2.0;
		
		return Math.PI * Math.pow(radio, dos);
		
	}
	
}
