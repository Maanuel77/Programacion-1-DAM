package ejemplo_polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se pueden crear objetos de una clase hija a una clase madre abstracta pero no
		// de una clase abstracta.
		Cuadrado cu1 = new Cuadrado("Primer cuadrado", "Rojo", 1.0);
		Circulo ci1 = new Circulo("Primer circulo", "Azul", 1.0);

		System.out.println(cu1);
		System.out.println(ci1);
		System.out.println("*********Área y perímetro**********");
		System.out.println("Área del primer cuadrado: " + cu1.calcular_Area());
		System.out.printf("Perímetro del primer círculo: %.2f", ci1.calcular_Area());

		// Prueba con polimorfismo

		System.out.println(
				"\n\n\n***************************************************************************************");

		Figura f1 = new Cuadrado("Segundo cuadrado", "verde", 2.0);
		Figura f2 = new Circulo("Segundo círculo", "Amarillo", 2.0);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("*********Áreas**********");
		System.out.println("Usan el método de cada clase concreta porque está sobrescrito");
		// f1.mostrar lados no se puede mostrar porque no es un método reescrito por lo
		// que la clase madre no lo tiene
		System.out.println("Área del segundo cuadrado: " + f1.calcular_Area());
		System.out.printf("Perímetro del segundo círculo: %.2f", f2.calcular_Area());
		System.out.println("\nPero ahora no pueden usar los métodos que solo están en cuadrado y círculo porque son\r\n"
				+ "figuras\n\n");

		// System.out.println(f1.mostrarLados ()); Error de compilación
		// System.out.println(f2.contarRadianes ());Error de compilación

		System.out.println("*******************************************************");
		System.out.println("*******Vamos ahora con el array de objetos**********\n\n");
		// Prueba con array de objetos
		Figura lista[] = new Figura[4];

		lista[0] = new Cuadrado("Un mísero cuadrado", "negro", 2.0);
		lista[1] = new Circulo("Un mísero círculo", "blanco", 2.0);
		lista[2] = new Circulo("Un círculo grisáceo", "gris", 2.0);
		lista[3] = new Cuadrado("Un cuadrado desnudo", "transparente", 2.0);

		Operaciones_Figuras of = new Operaciones_Figuras();
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("El área del " + (i + 1) + " es: %.2f \n", of.calcular_El_Area_De_Una_Figura(lista[i]));
		}
		System.out.printf("La suma de todas las áreas es: %.2f", of.sumar_Areas(lista));
		
	}
	


}
