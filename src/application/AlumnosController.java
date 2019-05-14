package application;

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
	
	
	private Stage alumnos;
	
	@FXML
	private Button SUBIR_FOTO;
	
	@FXML
	private Button Adjuntar_Fotocopia_DNI;
	
	@FXML
	private Button Adjuntar_Documentacion;
	
	@FXML
	private Button SALIR;
	
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
	
	public void initialize(){
		Tabla.setItems(this.data);
		ColDNI.setCellValueFactory(new PropertyValueFactory<Alumno,String>("nombre"));
		ColNomb.setCellValueFactory(new PropertyValueFactory<Alumno,String>("apellido"));
	}
	
	
	
	public void setStagePrincipal(Stage alumnos) {
		
		this.alumnos = alumnos;
	}

	public void closeWindow(){
		this.alumnos.close();
	}

	
	
	

}
