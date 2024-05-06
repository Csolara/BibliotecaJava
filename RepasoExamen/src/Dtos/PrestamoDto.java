package Dtos;

public class PrestamoDto {
	
	 String IdentificadorPrestamo = "aaaaa";

	 String IdentificadorCliente = "aaaaa";

	 String IdentificadorLibro = "aaaaa";

	 String FechaPrestamo = "dd/MM/yyyy";

	 String FechaEntrega = "dd/MM/yyyy";

	 String EstadoPrestamo = "aaaaa";

	public String getIdentificadorPrestamo() {
		return IdentificadorPrestamo;
	}

	public void setIdentificadorPrestamo(String identificadorPrestamo) {
		IdentificadorPrestamo = identificadorPrestamo;
	}

	public String getIdentificadorCliente() {
		return IdentificadorCliente;
	}

	public void setIdentificadorCliente(String identificadorCliente) {
		IdentificadorCliente = identificadorCliente;
	}

	public String getIdentificadorLibro() {
		return IdentificadorLibro;
	}

	public void setIdentificadorLibro(String identificadorLibro) {
		IdentificadorLibro = identificadorLibro;
	}

	public String getFechaPrestamo() {
		return FechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		FechaPrestamo = fechaPrestamo;
	}

	public String getFechaEntrega() {
		return FechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}

	public String getEstadoPrestamo() {
		return EstadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		EstadoPrestamo = estadoPrestamo;
	}

	public PrestamoDto(String identificadorPrestamo, String identificadorCliente, String identificadorLibro,
			String fechaPrestamo, String fechaEntrega, String estadoPrestamo) {
		super();
		IdentificadorPrestamo = identificadorPrestamo;
		IdentificadorCliente = identificadorCliente;
		IdentificadorLibro = identificadorLibro;
		FechaPrestamo = fechaPrestamo;
		FechaEntrega = fechaEntrega;
		EstadoPrestamo = estadoPrestamo;
	}

	public PrestamoDto() {
		super();
	}
}
