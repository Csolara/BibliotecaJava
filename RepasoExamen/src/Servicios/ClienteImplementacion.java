package Servicios;

import java.util.Scanner;

import Dtos.ClienteDto;

public class ClienteImplementacion implements ClienteInterfaz {
	
	 public void CLIENTE()
	 {
	     ClienteDto nuevocliente = new ClienteDto();
	     
	     Scanner sc = new Scanner(System.in);

	     System.out.println("Introduzca el nombre: ");
	     nuevocliente.setNombre(sc.nextLine());;

	     System.out.println("Introduzca los apellidos: ");
	     nuevocliente.setApellidos(sc.nextLine());;

	     System.out.println("Introduzca la fecha de nacimiento: ");
	     nuevocliente.setFechaNacimiento(sc.nextLine());

	     System.out.println("Introduzca el DNI: ");
	     nuevocliente.setDNI(sc.nextLine());;

	     System.out.println("Introduzca el gmail: ");
	     nuevocliente.setGmail(sc.nextLine());;

	     System.out.println("Introduzca la fecha de inicio (suspension): ");
	     nuevocliente.setFechaInicioSuspension(sc.nextLine());

	     System.out.println("Introduzca la fecha de fin (suspension): ");
	     nuevocliente.setFechaFinSuspension(sc.nextLine());;

	     System.out.println("");
	     System.out.println("---------DATOS---------");
	     System.out.println("=======================");
	     System.out.println("Nombre y apellidos: " + nuevocliente.getNombre() + " " + nuevocliente.getApellidos());
	     System.out.println("Fecha de nacimiento: " + nuevocliente.getFechaNacimiento());
	     System.out.println("DNI: " + nuevocliente.getDNI());
	     System.out.println("Gmail: " + nuevocliente.getGmail());
	     System.out.println("Fecha de inicio (suspension): " + nuevocliente.getFechaInicioSuspension());
	     System.out.println("Fecha de fin (suspension): " + nuevocliente.getFechaFinSuspension());
	     System.out.println("=======================");
	     System.out.println("");
	 }

}
