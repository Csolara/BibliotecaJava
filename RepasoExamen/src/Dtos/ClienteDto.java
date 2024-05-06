package Dtos;

public class ClienteDto {	
	
	 String Nombre = "aaaaa";

	 String Apellidos = "aaaaa";

	 String FechaNacimiento = "dd/MM/yyyy";

	 String DNI = "123456789X";

	 String Gmail = "aaaaa@gmail.com";

	 String FechaInicioSuspension = "dd/MM/yyyy";

	 String FechaFinSuspension = "dd/MM/yyyy";

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getGmail() {
		return Gmail;
	}

	public void setGmail(String gmail) {
		Gmail = gmail;
	}

	public String getFechaInicioSuspension() {
		return FechaInicioSuspension;
	}

	public void setFechaInicioSuspension(String fechaInicioSuspension) {
		FechaInicioSuspension = fechaInicioSuspension;
	}

	public String getFechaFinSuspension() {
		return FechaFinSuspension;
	}

	public void setFechaFinSuspension(String fechaFinSuspension) {
		FechaFinSuspension = fechaFinSuspension;
	}

	public ClienteDto(String nombre, String apellidos, String fechaNacimiento, String dNI, String gmail,
			String fechaInicioSuspension, String fechaFinSuspension) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		FechaNacimiento = fechaNacimiento;
		DNI = dNI;
		Gmail = gmail;
		FechaInicioSuspension = fechaInicioSuspension;
		FechaFinSuspension = fechaFinSuspension;
	}

	public ClienteDto() {
		super();
	}
}
