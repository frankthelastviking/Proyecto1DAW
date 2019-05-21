package application;

public class Ciclo {
	
	
	String cod_ciclo;
	String tipo;
	String familiaprof;
	String nhoras;
	String vigente;
	String Nplz;
	String nombre;
	
	




	public Ciclo(String cod_ciclo, String tipo, String familiaprof, String nhoras, String vigente, String nplz, String nombre) {
		super();
		this.cod_ciclo = cod_ciclo;
		this.tipo = tipo;
		this.familiaprof = familiaprof;
		this.nhoras = nhoras;
		this.vigente = vigente;
		this.Nplz = nplz;
		this.nombre= nombre;
	}


	public String getCod_ciclo() {
		return cod_ciclo;
	}


	public void setCod_ciclo(String cod_ciclo) {
		this.cod_ciclo = cod_ciclo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getFamiliaprof() {
		return familiaprof;
	}


	public void setFamiliaprof(String familiaprof) {
		this.familiaprof = familiaprof;
	}


	public String getNhoras() {
		return nhoras;
	}


	public void setNhoras(String nhoras) {
		this.nhoras = nhoras;
	}


	public String getVigente() {
		return vigente;
	}


	public void setVigente(String vigente) {
		this.vigente = vigente;
	}


	public String getNplz() {
		return Nplz;
	}


	public void setNplz(String nplz) {
		Nplz = nplz;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	

}
