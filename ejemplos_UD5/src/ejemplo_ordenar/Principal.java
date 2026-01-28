package ejemplo_ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Corredor> corredores = new ArrayList<Corredor>();

		corredores.add(new Corredor(4, "1:20", "Jesse Owens"));
		corredores.add(new Corredor(5, "1:12", "Emil Zatopec"));
		corredores.add(new Corredor(1, "1:40", "Rafa Villar"));
		corredores.add(new Corredor(8, "1:09", "Ángel Naranjo"));
		corredores.add(new Corredor(2, "1:01", "Manuel Martínez"));

		System.out.println("\n\t\t ---CORREDORES---");

		for (Corredor c : corredores) {

			System.out.println(c);

		}

		Collections.sort(corredores);

		System.out.println("\n\t ---CORREDORES ORDENADOS POR DORSAL---");

		for (Corredor c : corredores) {

			System.out.println(c);

		}

		Collections.sort(corredores, new CompararPorMarca());
		System.out.println("\n\t ---CORREDORES ORDENADOS POR MARCA---");
		for (Corredor c : corredores) {

			System.out.println(c);

		}

	}

}
