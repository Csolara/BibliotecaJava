package Dtos;

public class LibroDto {
	
	 String Titulo = "aaaaa";

	 String Subtitulo = "aaaaa";

	 String Autor = "aaaaa";

	 int ISBN = 0;

	 int NumEdicion = 0;

	 String Editorial = "aaaaa";

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getSubtitulo() {
		return Subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		Subtitulo = subtitulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getNumEdicion() {
		return NumEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		NumEdicion = numEdicion;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public LibroDto(String titulo, String subtitulo, String autor, int iSBN, int numEdicion, String editorial) {
		super();
		Titulo = titulo;
		Subtitulo = subtitulo;
		Autor = autor;
		ISBN = iSBN;
		NumEdicion = numEdicion;
		Editorial = editorial;
	}

	public LibroDto() {
		super();
	}	 
}
