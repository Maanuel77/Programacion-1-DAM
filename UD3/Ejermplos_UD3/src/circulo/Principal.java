package circulo;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;
		//Declaramos el círculo.
		Circulo c1;
		
		//Instanciamos el círculo
		System.out.println("Qué radio tiene el círculo");
		radio = Leer.datoDouble();
		c1 = new Circulo (radio);
		
		c1.imprimir_Datos();
		
		System.out.printf("El área del círculo es: %.2f m2", c1.area());
	}

}
