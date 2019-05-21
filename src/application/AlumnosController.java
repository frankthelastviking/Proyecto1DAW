package application;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AlumnosController {
	//Esto es el controller de la ventana alumnos
	
	
	private Stage Alumnos;
	
	@FXML
	private Button SUBIR_FOTO;
	
	@FXML
	private Button Adjuntar_Fotocopia_DNI;
	
	@FXML
	private Button Adjuntar_Documentacion;
	
	@FXML
	private Button SALIR;
	
	@FXML
	private Button Nuevo_Alumno;
	
	@FXML
	private Button Guardar_Cambios;
	
	@FXML
	private TextField Nombre;
	
	@FXML
	private TextField Apellido;
	
	@FXML
	private TextField DNI;
	
	@FXML
	private TextArea Observaciones;
	
	@FXML
	private TableView<Alumno> Tabla;
	
	@FXML
	private TableColumn<Alumno,String> ColDNI;

	@FXML
	private TableColumn<Alumno,String> ColNomb;
	
	@FXML
	private TableColumn<Alumno,String> ColApell;

	@FXML
	private TableColumn<Alumno,String> ColObsrv;
	

    
		
	
	public void initialize(){
		
		
		TestConexion iniciotabla = new TestConexion();
		
		Tabla.setItems(iniciotabla.CargarTablaAlumnos());
		//Tabla.setItems(this.data);
		ColDNI.setCellValueFactory(new PropertyValueFactory<Alumno,String>("DNI"));
		ColNomb.setCellValueFactory(new PropertyValueFactory<Alumno,String>("Nombre"));
		ColApell.setCellValueFactory(new PropertyValueFactory<Alumno,String>("Apellidos"));

	}
	
	
	
	public void setStagePrincipal(Stage alumnos) {
		
		this.Alumnos = alumnos;
	}

	public void closeWindow(){
		this.Alumnos.close();
	}

	public void NuevoAlumno() {
		String NombreST =  Nombre.getText();
		String ApellidoST =  Apellido.getText();
		String DNIST =  DNI.getText();
		String ObservacionesST =  Observaciones.getText();
		ValidadorDNI validador = new ValidadorDNI(DNIST);
		if(validador.validar()==true){
		//Alumno nuevo = new Alumno(DNIST, NombreST,ApellidoST, ObservacionesST);


		//creo objeto de la clase TestConexion para poder ejecutar los metodos de conexion a la base de datos y el metodo de insercion del alumno nuevo 
		TestConexion AñadirAlumno = new TestConexion();
		AñadirAlumno.InsertarAlumnoNuevo(DNIST, NombreST, ApellidoST, ObservacionesST);	
		Tabla.setItems(AñadirAlumno.CargarTablaAlumnos());}
		else {
		dninovalido();
		}
		}
	
	String herotoelsistema="";
	
	
	public void herotoelsistema() {
		herotoelsistema=DNI.getText();
	}
	
    public void GuardarCambios() {
		
		TestConexion update = new TestConexion();
		String dniviejo="1234";
		//System.out.println(dniviejo);
		String dni=DNI.getText();
		String nombre=Nombre.getText();
		String apellidos=Apellido.getText();
		String observaciones=Observaciones.getText();
		
		update.ActualizarAlumnos(dni, nombre, apellidos, observaciones, dniviejo);
		Tabla.setItems(update.CargarTablaAlumnos());
	}
    
    
    
    public static void dninovalido(){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("DNI INCORRECTO");
        alert.setHeaderText("El DNI no es valido, letra y numeros no concuerdan");
        alert.setContentText("Reviselo");
        alert.showAndWait();	
    }
	
	public void EditarAlumno() {
		
		Alumno editado = Tabla.getSelectionModel().getSelectedItem();
		
		
		
		DNI.setText(editado.getDNI());
		Nombre.setText(editado.getNombre());
		Apellido.setText(editado.getApellidos());
		Observaciones.setText(editado.getObservaciones());
		
		
		
	
	}

}
