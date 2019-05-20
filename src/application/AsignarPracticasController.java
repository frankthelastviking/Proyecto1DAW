package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AsignarPracticasController {
	
	Stage AsignarPracticas;
	
	
	@FXML
	private Button SALIR;
	
	
	
	public void initialize() {
		
		
		
		
		
	}
	
public void setStageAsignar(Stage asignar) {
		
		this.AsignarPracticas = asignar;
	}

	public void closeWindow(){
		this.AsignarPracticas.close();
	}

	
	

}
