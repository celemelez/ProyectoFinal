package Entidades;

public class Director extends Persona {
	private int cantidadPeliculas;
	
	
	
	public Director() {
		super();
	}

	public Director(String nombre, String apellido, int edad,int cantidadPeliculas) {
		super(nombre, apellido, edad);
		this.cantidadPeliculas = cantidadPeliculas;
	}
	
	public int getCantidadPeliculas() {
		return cantidadPeliculas;
	}
	
	public void setCantidadPeliculas(int cantidadPeliculas) {
		this.cantidadPeliculas = cantidadPeliculas;
	}
}