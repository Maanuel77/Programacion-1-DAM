package ejercicio_03;

public class CEcuacion2Grado {
	private double a;
	private double b;
	private double c;

	public CEcuacion2Grado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void resolver() throws EcuacionDegeneradaException, RaicesComplejasException {
		if (a == 0 && b == 0) {
			throw new EcuacionDegeneradaException("Ecuacion degenerada: a y b son 0");
		}

		if (a == 0 && b != 0) {
			double raiz = -c / b;
			System.out.println("Ecuacion de primer grado. Raiz unica: " + raiz);
			return;
		}

		double discriminante = (b * b) - (4 * a * c);
		if (discriminante < 0) {
			throw new RaicesComplejasException("Las raices son complejas");
		}

		double raiz1 = (-b + Math.sqrt(Math.abs(discriminante))) / (2 * a);
		double raiz2 = (-b - Math.sqrt(Math.abs(discriminante))) / (2 * a);

		System.out.println("Raiz 1: " + raiz1);
		System.out.println("Raiz 2: " + raiz2);
	}
}


