package Utilidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Entidades.Cine;
import Entidades.Cliente;
import Entidades.Director;
import Entidades.Pelicula;
import Entidades.Persona;

public class Claqueta {

	public static void main(String[] argss) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
        Cine cine = new Cine();

		for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese los datos de la película " + (i + 1));
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Cantidad de Peliculas: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            System.out.print("Duracion: ");
            int duracion = Integer.parseInt(scanner.nextLine());
            System.out.print("Edad Permitida: ");
            int permitida = Integer.parseInt(scanner.nextLine());
            System.out.print("Categoria: ");
            String categoria = scanner.nextLine();
            System.out.println("Director" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());
            
            Pelicula pelicula = new Pelicula(nombre, apellido, edad,12, duracion, titulo, permitida, categoria, new Date());
            cine.agregarPelicula(pelicula);
        }


      /*  Cine cine = new Cine("Nombre", "Apellido", 30, new Persona(), 0, 0, "", new Director(), 0, "", new Date(), peliculas, new Cliente[0]);

        cine.agregarPelicula(new Pelicula("Título 9", null, 120, cine, 0, 0, null, cine, 0, null, null));
        cine.agregarPelicula(new Pelicula("Título 10", null, 90, cine, 0, 0, null, cine, 0, null, null));*/

        System.out.print("Ingrese el título de la película a eliminar: ");
        String tituloEliminar = scanner.nextLine();
        cine.eliminarPelicula(tituloEliminar);

        System.out.println("Cartelera actual:");
        for (Pelicula pelicula1 :cine.getCartelera()) {
            System.out.println("- " + pelicula1.getTitulo() + " (" + pelicula1.getDuracion() + " minutos)");
        }
	}
}