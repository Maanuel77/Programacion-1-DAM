package ejercicio_10;

import java.util.Random;

public class Maquina {

	private double saldo;
	private Billete b;
	private String contrasenia = "Acceso";
	Random r = new Random(System.nanoTime());

	public Maquina(double saldo, Billete b) {
		super();
		this.saldo = saldo;
		this.b = b;
	}

	public Maquina() {
	}

	public Maquina(String contraseña) {
		super();
		this.contrasenia = contraseña;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Billete getB() {
		return b;
	}

	public void setB(Billete b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Maquina [saldo=" + saldo + ", b=" + b + "]";
	}

	public boolean contraseña_Check(String contrasenia_Usuario) {

		if (contrasenia.equals(contrasenia_Usuario)) {

			return true;

		} else {

			return false;
		}
	}

	public double recaudacion() {

		return b.getRecaudacion();

	}
	public void resetear_Recaudacion () {
		
		b.setRecaudacion(0);
	}
	public int generar_Aleatorio_Billete() {

		int desde = 10000;
		int hasta = 99999;

		return r.nextInt(hasta - desde + 1) + desde;
	}

	public double cambio(double cambio) {

		return cambio - b.getTotal();
	}
}
