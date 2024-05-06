package Servicios;

import java.util.Scanner;

import Dtos.BibliotecaDto;

public class BibliotecaImplementacion implements BibliotecaInterfaz {
	
	public void BIBLIO()
	{
	    BibliotecaDto nuevabiblio = new BibliotecaDto();
	    
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Introduzca el nombre de la biblioteca:");
	    nuevabiblio.setNombre(sc.nextLine());

	    System.out.println("Introduzca la direccion: ");
	    nuevabiblio.setDirccion(sc.nextLine());

	    System.out.println("");            
	    System.out.println("---------DATOS---------");            
	    System.out.println("=======================");            
	    System.out.println("Nombre: " + nuevabiblio.getNombre());            
	    System.out.println("Direccion: " + nuevabiblio.getDirccion());            
	    System.out.println("=======================");            
	    System.out.println("");            
	}

}
