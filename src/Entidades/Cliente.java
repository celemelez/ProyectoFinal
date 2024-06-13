package Entidades;

public class Cliente extends Persona {
	private int cantidadPeliculasVistas;
	private int idCliente;
	

	
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String apellido, int edad, int cantidadPeliculasVistas, int idCliente) {
		super(nombre, apellido, edad);
		this.cantidadPeliculasVistas = cantidadPeliculasVistas;
		this.idCliente = idCliente;
	}
	public int getCantidadPeliculasVistas() {
		return cantidadPeliculasVistas;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setCantidadPeliculasVistas(int cantidadPeliculasVistas) {
		this.cantidadPeliculasVistas = cantidadPeliculasVistas;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
}