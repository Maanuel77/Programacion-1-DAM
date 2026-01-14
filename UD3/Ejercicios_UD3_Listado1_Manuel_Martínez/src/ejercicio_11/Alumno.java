package ejercicio_11;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String curso;
	private double [] notas;
	private double numero_Suspensos;
	private double nota_Media;
	
	
	public Alumno(String nombre, String curso, double[] notas, double numero_Suspensos, double nota_Media) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notas = notas;
		this.numero_Suspensos = numero_Suspensos;
		this.nota_Media = nota_Media;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double getNumero_Suspensos() {
		return numero_Suspensos;
	}
	public void setNumero_Suspensos(double numero_Suspensos) {
		this.numero_Suspensos = numero_Suspensos;
	}
	public double getNota_Media() {
		return nota_Media;
	}
	public void setNota_Media(double nota_Media) {
		this.nota_Media = nota_Media;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", notas=" + Arrays.toString(notas)
				+ ", numero_Suspensos=" + numero_Suspensos + ", nota_Media=" + nota_Media + "]";
	}
	public double calcular_Nota_Media () {
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			
			suma = notas [i] + suma;
			
		}
		nota_Media = suma / notas.length;
		return nota_Media;
	}
	public void imprimir_Notas () {
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println((i + 1)+". "+ notas [i]);
			
		}
		
	}
	public int calcular_Num_Suspensos () {
		int suspenso = 0;
		for (int i = 0; i < notas.length; i++) {
			
			if (notas [i] < 5) {
				
				suspenso ++;
				
			}
			
		}
		
		return suspenso;
	}
	
}
