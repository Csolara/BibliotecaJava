package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	public int MENU()
	{
		Scanner sc = new Scanner(System.in);
		
	    int opcionseleccionada;

	    System.out.println("###################################");
	    System.out.println("0. Cerrar aplicacion.");
	    System.out.println("1. Dar de alta una nueva biblioteca.");
	    System.out.println("2. Dar de alta un nuevo cliente.");
	    System.out.println("3. Dar de alta un nuevo préstamo.");
	    System.out.println("4. Dar de alta un nuevo libro.");
	    System.out.println("###################################");

	    opcionseleccionada = sc.nextInt();
	    return opcionseleccionada;
	}

}
