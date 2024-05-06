package Dtos;

public class BibliotecaDto {
	

    String Nombre = "aaaaa";
    
    String Dirccion = "aaaaa";
    
    public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDirccion() {
		return Dirccion;
	}
	public void setDirccion(String dirccion) {
		Dirccion = dirccion;
	}
	
	public BibliotecaDto(String nombre, String dirccion) {
		super();
		Nombre = nombre;
		Dirccion = dirccion;
	}
	
	public BibliotecaDto() {
		super();
	}	
}
