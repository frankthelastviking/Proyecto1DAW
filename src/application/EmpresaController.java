package application;

import javafx.stage.Stage;

public class EmpresaController {
	
	private Stage Empresas;
	
public void setStagePrincipal(Stage Empresas) {
		
		this.Empresas = Empresas;
	}

	public void closeWindow(){
		this.Empresas.close();
	}


}
