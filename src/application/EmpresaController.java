package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EmpresaController {
	
	private Stage Empresas;
	
	

	
	
	
	
	
	
	
	
	

	public void initialize() {
		
		
	}
	
	
	
	public void setStagePrincipal(Stage Empresas) {
		
		this.Empresas = Empresas;
	}

	public void closeWindow(){
		this.Empresas.close();
	}


}
