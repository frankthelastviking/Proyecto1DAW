package application;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EmpresaController {
	
	private Stage Empresas;
	
	//botones
	
	@FXML
	private Button SUBIR_LOGO;
	
	@FXML
	private Button Nueva_Empresa;
	
	@FXML
	private Button Guardar_Cambios;
	
	@FXML
	private Button Adjuntar_Documentacion;
	
	@FXML
	private Button Salir;
	
	@FXML
	private Button hola;
	
	// textfields

	@FXML
	private TextField Nombre;
	
	@FXML
	private TextField Especialidad;
	
	@FXML
	private TextField Nif;
	
	@FXML
	private TextField Cod_Convenio;
	
	@FXML
	private TextField Numero_plazas;

	
	//textarea
	@FXML
	private TextArea Observaciones;
	
	//tabla
	@FXML
	private TableView<Empresa> Tabla;
	
	@FXML
	private TableColumn<Empresa,String> ColNIF;

	@FXML
	private TableColumn<Empresa,String> ColNomb;
	
	@FXML
	private TableColumn<Empresa,String> ColEsp;

	@FXML
	private TableColumn<Empresa,String> ColCod;
	
	@FXML
	private TableColumn<Empresa,String> ColFir;
	
	@FXML
	private TableColumn<Empresa,String> ColFin;
	
	@FXML
	private TableColumn<Empresa,String> ColNplz;
	
	
	
	
	
	
	
	

	public void initialize() {
		
		
	}
	
	
	
	public void setStagePrincipal(Stage Empresas) {
		
		this.Empresas = Empresas;
	}

	public void closeWindow(){
		this.Empresas.close();
	}


}
