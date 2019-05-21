package application;

public class DatosAlumnos {

	private String curso; //Curso del alumno, pe 18/19
	private String claveciclo; // Nombre del ciclo que estudia el alumna pe IFS02
	private String ciclo; //Nombre del ciclo que estudia el alumno pe Desarrollo de Aplicaciones Web
	private String fechainicio; // fecha comienzo de las FCTs
	private String fechafin; // fecha fin de las FCTs
	private String diassemana; //D�as de la semana que van a FCTs
	private String horainicioma�ana;
	private String horainiciotarde;
	private String horafinma�ana;
	private String horafintarde;
	private int horasdia;
	private int totalhoras;
	private String localidad;
	private String direccion;
	private String nombrealumno;
	private String apellidosalumno;
	private String DNIalumno;
	private String nombretutor;
	private String apellidostutor;
	private String DNItutor;
	private String nombretutoremp;
	private String apellidostutoremp;


	public DatosAlumnos(String curso, String claveciclo, String ciclo, String fechainicio, String fechafin,
			String diassemana, String horainicioma�ana, String horainiciotarde, String horafinma�ana,
			String horafintarde, int horasdia, int totalhoras, String localidad, String direccion, String nombrealumno,
			String apellidosalumno, String dNIalumno, String nombretutor, String apellidostutor, String dNItutor,
			String nombretutoremp, String apellidostutoremp) {
		super();
		this.curso = curso;
		this.claveciclo = claveciclo;
		this.ciclo = ciclo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.diassemana = diassemana;
		this.horainicioma�ana = horainicioma�ana;
		this.horainiciotarde = horainiciotarde;
		this.horafinma�ana = horafinma�ana;
		this.horafintarde = horafintarde;
		this.horasdia = horasdia;
		this.totalhoras = totalhoras;
		this.localidad = localidad;
		this.direccion = direccion;
		this.nombrealumno = nombrealumno;
		this.apellidosalumno = apellidosalumno;
		DNIalumno = dNIalumno;
		this.nombretutor = nombretutor;
		this.apellidostutor = apellidostutor;
		DNItutor = dNItutor;
		this.nombretutoremp = nombretutoremp;
		this.apellidostutoremp = apellidostutoremp;
	}


	public String getCurso() {
		return curso;
	}


	public String getHorainicioma�ana() {
		return horainicioma�ana;
	}


	public void setHorainicioma�ana(String horainicioma�ana) {
		this.horainicioma�ana = horainicioma�ana;
	}


	public String getHorainiciotarde() {
		return horainiciotarde;
	}


	public void setHorainiciotarde(String horainiciotarde) {
		this.horainiciotarde = horainiciotarde;
	}


	public String getHorafinma�ana() {
		return horafinma�ana;
	}


	public void setHorafinma�ana(String horafinma�ana) {
		this.horafinma�ana = horafinma�ana;
	}


	public String getHorafintarde() {
		return horafintarde;
	}


	public void setHorafintarde(String horafintarde) {
		this.horafintarde = horafintarde;
	}


	public int getHorasdia() {
		return horasdia;
	}


	public void setHorasdia(int horasdia) {
		this.horasdia = horasdia;
	}


	public int getTotalhoras() {
		return totalhoras;
	}


	public void setTotalhoras(int totalhoras) {
		this.totalhoras = totalhoras;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombrealumno() {
		return nombrealumno;
	}


	public void setNombrealumno(String nombrealumno) {
		this.nombrealumno = nombrealumno;
	}


	public String getApellidosalumno() {
		return apellidosalumno;
	}


	public void setApellidosalumno(String apellidosalumno) {
		this.apellidosalumno = apellidosalumno;
	}


	public String getDNIalumno() {
		return DNIalumno;
	}


	public void setDNIalumno(String dNIalumno) {
		DNIalumno = dNIalumno;
	}


	public String getNombretutor() {
		return nombretutor;
	}


	public void setNombretutor(String nombretutor) {
		this.nombretutor = nombretutor;
	}


	public String getApellidostutor() {
		return apellidostutor;
	}


	public void setApellidostutor(String apellidostutor) {
		this.apellidostutor = apellidostutor;
	}


	public String getDNItutor() {
		return DNItutor;
	}


	public void setDNItutor(String dNItutor) {
		DNItutor = dNItutor;
	}


	public String getNombretutoremp() {
		return nombretutoremp;
	}


	public void setNombretutoremp(String nombretutoremp) {
		this.nombretutoremp = nombretutoremp;
	}


	public String getApellidostutoremp() {
		return apellidostutoremp;
	}


	public void setApellidostutoremp(String apellidostutoremp) {
		this.apellidostutoremp = apellidostutoremp;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getClaveciclo() {
		return claveciclo;
	}


	public void setClaveciclo(String claveciclo) {
		this.claveciclo = claveciclo;
	}


	public String getCiclo() {
		return ciclo;
	}


	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}


	public String getFechainicio() {
		return fechainicio;
	}


	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}


	public String getFechafin() {
		return fechafin;
	}


	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}


	public String getDiassemana() {
		return diassemana;
	}


	public void setDiassemana(String diassemana) {
		this.diassemana = diassemana;
	}







}
