package Entidades;

import java.util.Date;

public class Pelicula extends Director {
	private int duracion;
	private String titulo;
	private int edadPermitida;
	private String categoria;
	private Date fechaDeEstreno;

	public Pelicula() {
		super();
	}

	public Pelicula(String nombre, String apellido, int edad, int cantidadPeliculas, int duracion, String titulo,
			int edadPermitida, String categoria, Date fechaDeEstreno) {
		super(nombre, apellido, edad, cantidadPeliculas);
		this.duracion = duracion;
		this.titulo = titulo;
		this.edadPermitida = edadPermitida;
		this.categoria = categoria;
		this.fechaDeEstreno = fechaDeEstreno;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getEdadPermitida() {
		return edadPermitida;
	}

	public String getCategoria() {
		return categoria;
	}

	public Date getFechaDeEstreno() {
		return fechaDeEstreno;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEdadPermitida(int edadPermitida) {
		this.edadPermitida = edadPermitida;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setFechaDeEstreno(Date fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}



}