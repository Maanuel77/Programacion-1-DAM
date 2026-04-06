package ejemplo_01;
 	
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dos = 2, cero = 0, num_Leer, den_Leer, solucion, tam = 3;
		int op = 1;
		int[] lista = new int[tam];

		// System.out.println("El resultado es: "+dos / cero);
		
		do {
		try {
			System.out.println("Diga el numerador: ");
			num_Leer = Leer.datoInt();
			System.out.println("Diga el denominador: ");
			den_Leer = Leer.datoInt();

			solucion = num_Leer / den_Leer;

			System.out.println("La división es: " + solucion);

			System.out.println("Ahora el array ");

			System.out.println(lista[8]);

		} catch (NumberFormatException n) {

			System.out.println("Error");
			op = 0;
		} catch (ArithmeticException ae) {

			System.err.print("Error en la división");
			op = 0;
		} catch (IndexOutOfBoundsException io) {
			
			System.out.println("Índice añadido mayor al necesario");
			op = 0;
		} catch (Exception e) {
			
			System.out.println("Nose");
			op = 0;
		}
	} while (op != 0);
	}

}
