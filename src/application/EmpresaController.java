package application;



import java.sql.SQLException;
import java.text.ParseException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
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
	
	@FXML
	private Button Anadir_Rep;
	
	//CheckBox
	@FXML
	private CheckBox Basico;
	
	@FXML
	private CheckBox Medio;
	
	@FXML
	private CheckBox Superior;
	
	@FXML
	ChoiceBox<String> Rep;
	
	ObservableList<String> RepList = FXCollections.observableArrayList("");
	
	
	
	//datepicker
	@FXML
	private DatePicker Fecha_Firma;
	
	@FXML
	private DatePicker Fecha_Fin;
	
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
	private TableView<Empresa> TablaEmpresa;
	
	@FXML
	private TableColumn<Empresa,String> ColNIF;

	@FXML
	private TableColumn<Empresa,String> ColNombEmpr;
	
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
	
	
	
	
	
	
	
	TestConexion conexionbbdd;

	public void initialize(){
		 conexionbbdd = new TestConexion();
			
			RepList = conexionbbdd.ListadoRep();
			
			Rep.setItems(RepList);
			
		
		
	    TablaEmpresa.setItems(conexionbbdd.CargarTablaEmpresa());
		ColNIF.setCellValueFactory(new PropertyValueFactory<Empresa,String>("NIF"));
		ColNombEmpr.setCellValueFactory(new PropertyValueFactory<Empresa,String>("Nombre"));
		ColEsp.setCellValueFactory(new PropertyValueFactory<Empresa,String>("Especialidad"));
		ColCod.setCellValueFactory(new PropertyValueFactory<Empresa,String>("Cod_Convenio"));
		ColFir.setCellValueFactory(new PropertyValueFactory<Empresa,String>("Fecha_Firma"));
		ColFin.setCellValueFactory(new PropertyValueFactory<Empresa,String>("Fecha_Fin"));
		ColNplz.setCellValueFactory(new PropertyValueFactory<Empresa,String>("NPlazas"));
		
	}
	
	
	public void setStagePrincipal(Stage Empresas) {
		
		this.Empresas = Empresas;
	}

	public void closeWindow(){
		this.Empresas.close();
	}

	
	@FXML
    private void nuevaVentanaAnadirRepresentante() {
		try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../application/AnadirRepresentante.fxml"));
		AnchorPane ventanaDos = (AnchorPane)loader.load();
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
	
	

	private static boolean isNumeric(String cadena){
		try {
		Integer.parseInt(cadena);
		return true;
		} catch (NumberFormatException nfe){
		return false;
		}}
		public static void campononumerico(){
		    Alert alert = new Alert(AlertType.ERROR);
		    alert.setTitle("Campo incorrecto");
		    alert.setHeaderText("Valores no validos en un campo numerico");
		    alert.setContentText("Reviselo");
		    alert.showAndWait();	
		}
		public void NuevaEmpresa() throws SQLException, ParseException{


		String Cod_ConvenioST = Cod_Convenio.getText();
		String NombreST =  Nombre.getText();
		String EspecialidadST =  Especialidad.getText();
		String NIFST =  Nif.getText();
		String ObservacionesST =  Observaciones.getText();
		String basico;
		String medio;
		String superior;

		if (Basico.isSelected()==true) {
		basico="SI";
		}
		else {
		basico="NO";
		}

		if (Medio.isSelected()==true) {
		medio="SI";
		}
		else {
		medio="NO";
		}

		if (Superior.isSelected()==true) {
		superior="SI";
		}
		else {
		superior="NO";
		}
		
		String dnirep = Rep.getSelectionModel().getSelectedItem();
		conexionbbdd.VincularEmpresaRep(Cod_ConvenioST,dnirep);

		//El cancer de las fechas

		        String firmaST = Fecha_Firma.getEditor().getText();
		        //firmaST = sdf.format(firmaST);
		        
		        
		        String finST = Fecha_Fin.getEditor().getText();
		        //finST = sdf.format(finST);
		        
		String NplzST = Numero_plazas.getText();
		if(isNumeric(NplzST)==true) {
		
		

		//creo objeto de la clase TestConexion para poder ejecutar los metodos de conexion a la base de datos y el metodo de insercion del alumno nuevo 
		TestConexion AñadirEmpresa = new TestConexion();
		AñadirEmpresa.InsertarEmpresaNueva(Cod_ConvenioST , NIFST, EspecialidadST, firmaST , finST, basico,  medio,  superior,  ObservacionesST, NombreST, NplzST );
		TablaEmpresa.setItems(AñadirEmpresa.CargarTablaEmpresa());
		}
		else {campononumerico();}
		}

		
	
}
