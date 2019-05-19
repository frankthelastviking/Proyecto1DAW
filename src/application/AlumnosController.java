package application;

import java.sql.Connection;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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
	
	private final ObservableList<Alumno> data = FXCollections.observableArrayList();

	private Connection conexion;

	
	
	public void initialize(){
		Tabla.setItems(this.data);
		ColDNI.setCellValueFactory(new PropertyValueFactory<Alumno,String>("DNI"));
		ColNomb.setCellValueFactory(new PropertyValueFactory<Alumno,String>("Nombre"));
		ColApell.setCellValueFactory(new PropertyValueFactory<Alumno,String>("Apellidos"));
		ColObsrv.setCellValueFactory(new PropertyValueFactory<Alumno,String>("Observaciones"));
	}
	
	
	
	public void setStagePrincipal(Stage alumnos) {
		
		this.Alumnos = alumnos;
	}

	public void closeWindow(){
		this.Alumnos.close();
	}

	public void NuevoAlumno() throws SQLException{
		String NombreST =  Nombre.getText();
		String ApellidoST =  Apellido.getText();
		String DNIST =  DNI.getText();
		String ObservacionesST =  Observaciones.getText();
		
		Alumno nuevo = new Alumno(DNIST, NombreST,ApellidoST, ObservacionesST);
		data.add(nuevo);
		
		//creo objeto de la clase TestConexion para poder ejecutar los metodos de conexion a la base de datos y el metodo de insercion del alumno nuevo 
		TestConexion AñadirAlumno = new TestConexion();
		AñadirAlumno.Conectar();
		AñadirAlumno.InsertarAlumnoNuevo(DNIST, NombreST, ApellidoST, ObservacionesST);	
		conexion.close();
	}
	

}
