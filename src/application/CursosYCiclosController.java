package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CursosYCiclosController {
	
private Stage CursosYCiclos;
	
	@FXML
	private Button Salir;
	

	
	
	public void initialize() {
		
		
	}
	
	
	
	public void setStagePrincipal(Stage CursosYCiclos) {
		
		this.CursosYCiclos = CursosYCiclos;
	}

	public void closeWindow(){
		this.CursosYCiclos.close();
	}

}
