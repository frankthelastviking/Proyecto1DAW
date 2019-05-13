package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {
	
	private  Main ProgramaPrincipal;
	
	@FXML
	private Button ALUMNOS;
	
	@FXML
	private Button CICLOS_Y_CURSOS;
	
	@FXML
	private Button EMPRESAS;
	
	@FXML
	private Button TUTORES;
	
	@FXML
	private Button ASIGNAR_PRACTICAS;
	
	@FXML
	private Button CONSULTAS;
	
	@FXML
	private Button ANEXOS;
	
	@FXML
	private Button LOGIN;
	
	@FXML
	private TextField Usuario;
	
	
	@FXML
	private PasswordField Contraseña;
	
	
	@FXML
	public void initialize() {
		
		
		
	}
	
	
	public void mostrarVentanaPrincipal(Main ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
	
	 private void nuevaVentana() {
	       	this.ProgramaPrincipal.VentanaAlumnos();
	    }

	
}
