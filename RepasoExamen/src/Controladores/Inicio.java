package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.BibliotecaDto;
import Dtos.ClienteDto;
import Dtos.LibroDto;
import Dtos.PrestamoDto;
import Servicios.BibliotecaImplementacion;
import Servicios.BibliotecaInterfaz;
import Servicios.ClienteImplementacion;
import Servicios.ClienteInterfaz;
import Servicios.LibroImplementacion;
import Servicios.LibroInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.PrestamoImplementacion;
import Servicios.PrestamoInterfaz;

public class Inicio {

	public static void main(String[] args) {

		List<BibliotecaDto> blibliotecaDtos = new ArrayList<BibliotecaDto>();
		List<ClienteDto> clienteDtos = new ArrayList<ClienteDto>();
		List<LibroDto> libroDtos = new ArrayList<LibroDto>();
		List<PrestamoDto> prestamoDtos = new ArrayList<PrestamoDto>();

		MenuInterfaz mi = new MenuImplementacion();
		ClienteInterfaz ci = new ClienteImplementacion();
		BibliotecaInterfaz bi = new BibliotecaImplementacion();
		LibroInterfaz li = new LibroImplementacion();
		PrestamoInterfaz pi = new PrestamoImplementacion();

		boolean cerrarMenu = false;

		while (!cerrarMenu) {
			int Recogido = mi.MENU();
			switch (Recogido) {
			case 0:
				System.out.println("La aplicacion se cerrara.");
				cerrarMenu = true;
				break;
			case 1:
				bi.BIBLIO();
				break;
			case 2:
				ci.CLIENTE();
				break;
			case 3:
				pi.PRESTAMO();
				break;
			case 4:
				System.out.println("");
				break;
			default:
				System.out.println("La opcion que ha seleccionado no coincide con ninguna.");
				break;
			}
		}

	}

}
