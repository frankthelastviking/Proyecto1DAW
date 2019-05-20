package application;

public class Tutor {
	
	String DNI;
	String Nombre;
	String Apellidos;
	String Correo;
	String Telefono;
	String Observaciones;
	String Cod_Convenio;
	
	
	public Tutor(String dNI, String nombre, String apellidos, String correo, String telefono, String observaciones, String convenio) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Correo = correo;
		Telefono = telefono;
		Observaciones = observaciones;
		Cod_Convenio = convenio;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


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


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getCod_Convenio() {
		return Cod_Convenio;
	}


	public void setCod_Convenio(String cod_Convenio) {
		Cod_Convenio = cod_Convenio;
	}
	
	
	
	
	

}
