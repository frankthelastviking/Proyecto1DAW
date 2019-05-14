package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
	
	
	
	public void setStagePrincipal(Stage alumnos) {
		
		this.alumnos = alumnos;
	}

	public void closeWindow(){
		this.alumnos.close();
	}

	
	
	

}
