package application;

public class Curso {
	
	
	String Cod_Ciclo;
	String A�o_Acad;
	String numero;
	
	
	
	public Curso(String cod_Ciclo, String a�o_Acad, String numero) {
		super();
		Cod_Ciclo = cod_Ciclo;
		A�o_Acad = a�o_Acad;
		this.numero = numero;
	}



	public String getCod_Ciclo() {
		return Cod_Ciclo;
	}



	public void setCod_Ciclo(String cod_Ciclo) {
		Cod_Ciclo = cod_Ciclo;
	}



	public String getA�o_Acad() {
		return A�o_Acad;
	}



	public void setA�o_Acad(String a�o_Acad) {
		A�o_Acad = a�o_Acad;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
	
	
	

}
