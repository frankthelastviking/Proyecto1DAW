package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MainController {
	
	
    private String user="Admin";
    private String key="DeividPonnosUn10";
    public boolean logged =false;
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
	private PasswordField Contrasena;

	@FXML
	private Circle Circulo;
	

	
	@FXML
	public void initialize() {
		//Circulo.setStyle("fx-fill: #f50000");
		
		
	}
	public static void contenidoerroneo(){
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Contenido erroneo");
    	alert.setHeaderText("La informacion introducida no es valida para este campo");
    	alert.setContentText("Revisela");
    	alert.showAndWait();		
	}
	public static void dninovalido(){
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("DNI INCORRECTO");
    	alert.setHeaderText("El DNI no es valido, letra y numeros no concuerdan");
    	alert.setContentText("Reviselo");
    	alert.showAndWait();		
	}
	
	public static void accesonoautorizado(){
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Acceso no autorizado");
    	alert.setHeaderText("No tiene permiso para acceder a esta seccion");
    	alert.setContentText("Si desea acceder por favor loggese");
    	alert.showAndWait();		
	}
	
	
	public void mostrarVentanaPrincipal(Main ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
	
	public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

	@FXML
    private void nuevaVentanaAlumnos() {
		if(logged==true) {
       	this.ProgramaPrincipal.mostrarVentanaAlumnos();}
		else {
	    	accesonoautorizado();
	    	
	    }
    }
	
	
	@FXML
    private void nuevaVentanaEmpresas() {
		if(logged==true) {
       	this.ProgramaPrincipal.mostrarVentanaEmpresas();}
		else {
	    	accesonoautorizado();
	    	
	    }
    }
	
	@FXML
    private void nuevaVentanaCursosYCiclos() {
		if(logged==true) {
	
       	this.ProgramaPrincipal.mostrarVentanaCursosYCiclos();}
		else {
	    	accesonoautorizado();
	    	
	    }
    }
	
	@FXML
    private void nuevaVentanaTutores() {
		if(logged==true) {
       	this.ProgramaPrincipal.mostrarVentanaTutores();}
		else {
	    	accesonoautorizado();
	    	
	    }
    }
	
	@FXML
    private void nuevaVentanaConsultas() {
		if(logged==true) {
	
       	this.ProgramaPrincipal.mostrarVentanaConsultas();}
		else {
	    	accesonoautorizado();
	    	
	    }
    }
	
	@FXML
    private void nuevaVentanaAsignarPracticas() {
		if(logged==true) {
	
       	this.ProgramaPrincipal.mostrarVentanaAsignarPracticas();}
		else {
	    	accesonoautorizado();
	    	
	    }
    }
	

	@FXML
	public void login() {
		/*System.out.println(Usuario.getText());
		System.out.println(user);
		System.out.println(Contrasena.getText());
		System.out.println(key);*/
    	if ((Usuario.getText()==user)||(Contrasena.getText().equals(key))) {
    	Circulo.setFill(Color.GREEN);
    	logged = true;
    	}
    	else {System.out.println("Wrong Password");
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Login erroneo");
    	alert.setHeaderText("El usuario o la contraseña introducida son incorrectas");
    	alert.setContentText("Intentelo de nuevo");
    	alert.showAndWait();}
    }


}