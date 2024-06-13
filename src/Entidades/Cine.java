package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Cine extends Pelicula implements ICine{
	
	ArrayList<Pelicula>  cartelera = new ArrayList<Pelicula>();
	ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	
		
	public Cine() {
		super();
	}
	
	
	
	public Cine(String nombre, String apellido, int edad, int cantidadPeliculas, int duracion, String titulo,
			int edadPermitida, String categoria, Date fechaDeEstreno, ArrayList<Pelicula> cartelera,
			ArrayList<Cliente> cliente) {
		super(nombre, apellido, edad, cantidadPeliculas, duracion, titulo, edadPermitida, categoria, fechaDeEstreno);
		this.cartelera = cartelera;
		this.cliente = cliente;
	}
	



	public ArrayList<Pelicula> getCartelera() {
		return cartelera;
	}



	public ArrayList<Cliente> getCliente() {
		return cliente;
	}



	public void setCartelera(ArrayList<Pelicula> cartelera) {
		this.cartelera = cartelera;
	}



	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
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
     public void verificarPromocion(Cliente cliente) {
    	 if (cliente.getCantidadPeliculasVistas() >= 3) {
    		 JOptionPane.showMessageDialog(null, cliente.getNombre() + "Alerta De Descuento");
    	}
	}
	
}