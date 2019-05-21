package application;

public class Curso {
	
	
	String Cod_Ciclo;
	String Año_Acad;
	String numero;
	
	
	
	public Curso(String cod_Ciclo, String año_Acad, String numero) {
		super();
		Cod_Ciclo = cod_Ciclo;
		Año_Acad = año_Acad;
		this.numero = numero;
	}



	public String getCod_Ciclo() {
		return Cod_Ciclo;
	}



	public void setCod_Ciclo(String cod_Ciclo) {
		Cod_Ciclo = cod_Ciclo;
	}



	public String getAño_Acad() {
		return Año_Acad;
	}



	public void setAño_Acad(String año_Acad) {
		Año_Acad = año_Acad;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
	
	
	

}
