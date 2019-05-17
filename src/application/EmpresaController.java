package application;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class EmpresaController {
	
	private  EmpresaController EmpresasController;
	
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
	
	@FXML
	private Button Anadir_Rep;
	
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

	
	@FXML
    private void nuevaVentanaAnadirRepresentante() {
		this.EmpresasController.mostrarVentanaAnadirRepresentante();	
    }
	
	 public void mostrarVentanaAnadirRepresentante() {
	        try {
	            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../application/AnadirRepresentante.fxml"));
	            AnchorPane ventanaDos = (AnchorPane) loader.load();
	            /* Creamos la segunda ventana como otro stage */
	            Stage ventana = new Stage();
	            ventana.setTitle("AÑADIR REPRESENTANTE - APLICACION DE GESTION DE DATOS DE PRACTICAS PROYECTO DAW1 FJ-V");
	            Empresas.getIcons().add(new Image("/imagesUI/logo-colegio-valle-del-miro.png")); 
	            /* Le decimos a la ventana quién es la ventana original */
	            ventana.initOwner(Empresas);
	            Scene scene = new Scene(ventanaDos);
	            ventana.setScene(scene);

	            AnadirRepresentanteController controller2 = loader.getController();
	            controller2.setStagePrincipal(ventana);

	            ventana.show();

	        } catch (Exception e) {
	            //tratar la excepción 
	        }
	    }

}
