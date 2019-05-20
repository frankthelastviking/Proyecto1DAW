package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
	private TextField Cod_Convenio;
	
	
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
	
	
	
	private final ObservableList<Tutor> data = FXCollections.observableArrayList();
	
	TestConexion conexionbbdd;
	
	ObservableList<String> EmpresaList = FXCollections.observableArrayList("");
	
	public void initialize(){
		
        conexionbbdd = new TestConexion();
		
		EmpresaList = conexionbbdd.ListadoEmpresas();
		
		Empresa.setItems(EmpresaList);
		
		
		
		
		
		
		Tabla.setItems(this.data);
		ColDNI.setCellValueFactory(new PropertyValueFactory<Tutor,String>("DNI"));
		ColNomb.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Nombre"));
		ColApell.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Apellidos"));
		ColCorr.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Correo"));
		ColTel.setCellValueFactory(new PropertyValueFactory<Tutor,String>("Telefono"));
	}

	
public void setStageTutores(Stage tutores) {
		
		this.tutores = tutores;
	}

	public void closeWindow(){
		this.tutores.close();
	}
	
	
	
	@FXML
	public void SeleccionarEmpresa(){
		
		
		String aux = Empresa.getSelectionModel().getSelectedItem();
		
		
		
		
		
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
		
		
		Tutor nuevo = new Tutor(DNItutor,NOMBREtutor,APELLIDOStutor,CORREOtutor,TELEFONOtutor,ObservacionesTutor,codconvenio);
		data.add(nuevo);
		
				AñadirTutor.InsertarTutorNuevo(DNItutor,NOMBREtutor,APELLIDOStutor,CORREOtutor,TELEFONOtutor,ObservacionesTutor,codconvenio);
		//String nombreempr = Empresa.getSelectionModel().getSelectedItem();
		//AñadirTutor.VincularEmpresaTutor(DNItutor, codconvenio);
	}
	
	
}
