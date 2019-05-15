package application;

public class Empresa {
	
	String NIF;
	String Nombre;
	String Especialidad;
	String Cod_Convenio;
	String Fecha_Firma;
	String Fecha_Fin;
	int NPlazas;
	
	
	public Empresa(String nIF, String nombre, String especialidad, String cod_Convenio, String fecha_Firma,
			String fecha_Fin, int nPlazas) {
		super();
		NIF = nIF;
		Nombre = nombre;
		Especialidad = especialidad;
		Cod_Convenio = cod_Convenio;
		Fecha_Firma = fecha_Firma;
		Fecha_Fin = fecha_Fin;
		NPlazas = nPlazas;
	}


	public String getNIF() {
		return NIF;
	}


	public void setNIF(String nIF) {
		NIF = nIF;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getEspecialidad() {
		return Especialidad;
	}


	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}


	public String getCod_Convenio() {
		return Cod_Convenio;
	}


	public void setCod_Convenio(String cod_Convenio) {
		Cod_Convenio = cod_Convenio;
	}


	public String getFecha_Firma() {
		return Fecha_Firma;
	}


	public void setFecha_Firma(String fecha_Firma) {
		Fecha_Firma = fecha_Firma;
	}


	public String getFecha_Fin() {
		return Fecha_Fin;
	}


	public void setFecha_Fin(String fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}


	public int getNPlazas() {
		return NPlazas;
	}


	public void setNPlazas(int nPlazas) {
		NPlazas = nPlazas;
	}
	

	
	
	
	
	
	
	
	
}


