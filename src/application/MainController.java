package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {
	
	//Esto es el controller de la ventana principal
	
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
	
	public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

	@FXML
    private void nuevaVentanaAlumnos() {
       	this.ProgramaPrincipal.mostrarVentanaAlumnos();
    }
	
	@FXML
    private void nuevaVentanaEmpresas() {
       	this.ProgramaPrincipal.mostrarVentanaEmpresas();
    }
	
	@FXML
    private void nuevaVentanaCursosYCiclos() {
       	this.ProgramaPrincipal.mostrarVentanaCursosYCiclos();
    }
	
	@FXML
    private void nuevaVentanaTutores() {
       	this.ProgramaPrincipal.mostrarVentanaTutores();
    }
	
	@FXML
    private void nuevaVentanaConsultas() {
       	this.ProgramaPrincipal.mostrarVentanaConsultas();
    }
	
	@FXML
    private void nuevaVentanaAsignarPracticas() {
       	this.ProgramaPrincipal.mostrarVentanaAsignarPracticas();
    }


}