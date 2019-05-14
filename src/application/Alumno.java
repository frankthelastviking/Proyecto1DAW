package application;

public class Alumno {
	
	String DNI;
	String Nombre;
	String Apellidos;
	String Observaciones;
	
	
	
	public Alumno(String DNI, String nombre, String apellidos, String observaciones) {
		super();
		this.DNI = DNI;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Observaciones = observaciones;
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



	public String getObservaciones() {
		return Observaciones;
	}



	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	

	
	
	
}
