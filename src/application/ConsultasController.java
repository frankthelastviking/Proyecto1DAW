package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class ConsultasController {
	
	private Stage Consultas;
	
	@FXML
	private Button SALIR;
	
	@FXML
	ChoiceBox<String> consultas;
	
	public void initialize() {
		
		
		
		
		
	}
	
public void setStageConsultas(Stage consultas) {
		
		this.Consultas = consultas;
	}

	public void closeWindow(){
		this.Consultas.close();
	}

	public void consalumnos(){
		
	}
	public void consalumnoscursociclo(){
		
	}
	public void consciclos(){
		
	}
	public void conempresa(){
		
	}
	public void consalumnoscursociclotutoresempresa(){
		
	}
	public void consalumnossinempresa(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
