package ejercicio_09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, num4, num5, opcion;
		Loteria l1 = new Loteria();
		do {

			l1.menu();
			opcion = Leer.datoInt();
			switch (opcion) {

			case 1:
				System.out.println(
						"Introduzca los números de su boleto de lotería uno a uno, del 0-9, los números que introduzca irán en este orden 54321.");
				num1 = Leer.datoInt();
				num2 = Leer.datoInt();
				num3 = Leer.datoInt();
				num4 = Leer.datoInt();
				num5 = Leer.datoInt();

				while (num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0) {

					System.out.println("Boleto introducido no válido, vuelva a introducirlo");

					num1 = Leer.datoInt();
					num2 = Leer.datoInt();
					num3 = Leer.datoInt();
					num4 = Leer.datoInt();
					num5 = Leer.datoInt();
				}
				System.out.println("Boleto registrado");
				break;
				
			case 2:
				
				
				
				
				
			}
		} while (opcion == 4);

	}

}
