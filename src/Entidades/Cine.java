package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cine extends Pelicula implements ICine{
	
	ArrayList<Pelicula>  cartelera = new ArrayList<Pelicula>();
	Cliente clientes[];
	
		
	public Cine() {
		super();
	}
	
	public Cine(String nombre, String apellido, int edad, int cantidadPeliculas, int duracion, String titulo,
			int edadPermitida, String categoria, Date fechaDeEstreno, ArrayList<Pelicula> cartelera,
			Cliente[] clientes) {
		super(nombre, apellido, edad, cantidadPeliculas, duracion, titulo, edadPermitida, categoria, fechaDeEstreno);
		this.cartelera = cartelera;
		this.clientes = clientes;
	}

	
	public ArrayList<Pelicula> getCartelera() {
		return cartelera;
	}

	public void setCartelera(ArrayList<Pelicula> cartelera) {
		this.cartelera = cartelera;
	}
	public Cliente[] getClientes() {
		return clientes;
	}
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	public int buscarPeliculasPorNombre(String nombre) {
		int posicion=-1;
		int i=0;
		for (Pelicula pelicula : cartelera) {
			if (pelicula.getTitulo().equalsIgnoreCase(nombre)) {
				posicion = i;
				}
			i++;
			}
		return posicion;
	}
	public void eliminarPelicula(String nombre) {
        int posicion = buscarPeliculasPorNombre(nombre);
        if (posicion != -1) {
        	cartelera.remove(posicion);
        }        
	}    
	public void agregarPelicula(Pelicula pelicula) {
		cartelera.add(pelicula);
	}
     private void verificarPromocion(Cliente cliente) {
    	 if (cliente.getCantidadPeliculasVistas() >= 3) {
    		 enviarAlerta(cliente);
    	}
	}
	private void enviarAlerta(Cliente cliente) {
		// TODO Auto-generated method stub	
	}
	@Override
	public String getCliente() {
		// TODO Auto-generated method stub
		return null;
	}	
}