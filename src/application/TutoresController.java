package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TutoresController {
	
	private Stage tutores;
	
	
	@FXML
	private Button SUBIR_FOTO;
	
	@FXML
	private Button Adjuntar_Fotocopia_DNI;
	
	@FXML
	private Button Adjuntar_Documentacion;
	
	@FXML
	private Button SALIR;
	
	@FXML
	private Button Nuevo_Tutor;
	
	@FXML
	private Button Guardar_Cambios;
	
	@FXML
	private TextField Nombre;
	
	@FXML
	private TextField Apellido;
	
	@FXML
	private TextField DNI;
	
	@FXML
	private TextField Correo;
	
	@FXML
	private TextField Telefono;
	
	@FXML
	private TextArea Observaciones;
	
	//ChoiceBox
	@FXML
	ChoiceBox<String> Empresa;
	
	
	@FXML
	private TableView<Tutor> Tabla;
	
	@FXML
	private TableColumn<Tutor,String> ColDNI;

	@FXML
	private TableColumn<Tutor,String> ColNomb;
	
	@FXML
	private TableColumn<Tutor,String> ColApell;

	@FXML
	private TableColumn<Tutor,String> ColCorr;
	
	@FXML
	private TableColumn<Tutor,String> ColTel;
	
	
	
	
	TestConexion conexionbbdd;
	
	ObservableList<String> EmpresaList = FXCollections.observableArrayList("");
	
	public void initialize(){
		
        conexionbbdd = new TestConexion();
		
		EmpresaList = conexionbbdd.ListadoEmpresas();
		
		Empresa.setItems(EmpresaList);
		
		
         TestConexion iniciotabla = new TestConexion();
		
		Tabla.setItems(iniciotabla.CargarTablaTutor());
		
		
		
		
		ColDNI.setCellValueFactory(new PropertyValueFactory<Tutor,String>("DNI"));
		ColNomb.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Nombre"));
		ColApell.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Apellidos"));
		ColCorr.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Correo"));
		ColTel.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Telefono"));
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
	
public void setStageTutores(Stage tutores) {
		
		this.tutores = tutores;
	}

	public void closeWindow(){
		this.tutores.close();
	}
	
	
	
	
	public static void dninovalido(){
    	Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("DNI INCORRECTO");
    	alert.setHeaderText("El DNI no es valido, letra y numeros no concuerdan");
    	alert.setContentText("Reviselo");
    	alert.showAndWait();		
	}
	
	public void NuevoTutor() {
		TestConexion AñadirTutor = new TestConexion();

		String aux = Empresa.getSelectionModel().getSelectedItem();
		
		
		String DNItutor = DNI.getText();
		String NOMBREtutor = Nombre.getText();
		String APELLIDOStutor = Apellido.getText();
		String CORREOtutor = Correo.getText();
		String TELEFONOtutor = Telefono.getText();
		String ObservacionesTutor = Observaciones.getText();
		String codconvenio = AñadirTutor.SelectCodWhereNombre(aux);
		
		ValidadorDNI validador = new ValidadorDNI(DNItutor);
		if(validador.validar()==true){
		//Tutor nuevo = new Tutor(DNItutor,NOMBREtutor,APELLIDOStutor,CORREOtutor,TELEFONOtutor,ObservacionesTutor,codconvenio);
			if(isNumeric(TELEFONOtutor)==true) {
		
		AñadirTutor.InsertarTutorNuevo(DNItutor,codconvenio,NOMBREtutor,APELLIDOStutor,CORREOtutor,TELEFONOtutor,ObservacionesTutor);
		Tabla.setItems(AñadirTutor.CargarTablaTutor());
		//String nombreempr = Empresa.getSelectionModel().getSelectedItem();
		//AñadirTutor.VincularEmpresaTutor(DNItutor, codconvenio);
			}else {campononumerico();}
		}
		else {
			dninovalido();
		}}
	
    String herotoelsistema="";
	
	
	public void herotoelsistema() {
		herotoelsistema=DNI.getText();
	}
	
	
	public void GuardarCambios() {
		TestConexion update = new TestConexion();
		String dniviejo=herotoelsistema;
		String dni=DNI.getText();
		String aux = Empresa.getSelectionModel().getSelectedItem();
		String codconvenio = update.SelectCodWhereNombre(aux);
		String nombre=Nombre.getText();
		String apellidos=Apellido.getText();
		String correo=Apellido.getText();
		String telefono=Apellido.getText();
		String observaciones=Observaciones.getText();
		
		update.ActualizarTutores(dni, codconvenio, nombre, apellidos, correo, telefono, observaciones, dniviejo);
		Tabla.setItems(update.CargarTablaTutor());
	}
	
	public void EditarTutor() {
		//TestConexion conexion = new TestConexion();
		Tutor editado = Tabla.getSelectionModel().getSelectedItem();
		
		DNI.setText(editado.getDNI());
		//Empresa.setValue(conexion.SelectNombreWhereCod(editado.getCod_Convenio()));
		Nombre.setText(editado.getNombre());
		Apellido.setText(editado.getApellidos());
		Correo.setText(editado.getCorreo());
		Telefono.setText(editado.getTelefono());
		Observaciones.setText(editado.getObservaciones());
		
		
	
	}
	
	
	
	
}
