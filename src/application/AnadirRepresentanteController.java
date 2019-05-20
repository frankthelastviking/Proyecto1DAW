package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AnadirRepresentanteController {
	
	private Stage AnadirRepresentante;
	
	@FXML
	private Button Salir;
	
	@FXML
	private Button Guardar_Cambios;
	
	@FXML
	private TextField Nombre;
	
	@FXML
	private TextField Apellido;
	
	@FXML
	private TextField DNI;
	
	@FXML
	private TextField Telefono;
	
	@FXML
	private TextField Correo;
	
	@FXML
	private TextArea Observaciones;

	public void setStagePrincipal(Stage AnadirRepresentante) {
		
		this.AnadirRepresentante = AnadirRepresentante;
	}

	public void closeWindow(){
		this.AnadirRepresentante.close();
	}
	
	
	


}



