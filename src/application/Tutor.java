package application;

public class Tutor {
	
	String DNI;
	String Nombre;
	String Apellidos;
	String Correo;
	String Telefono;
	String Observaciones;
	
	
	public Tutor(String dNI, String nombre, String apellidos, String correo, String telefono, String observaciones) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Correo = correo;
		Telefono = telefono;
		Observaciones = observaciones;
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
	
	
	
	
	

}
