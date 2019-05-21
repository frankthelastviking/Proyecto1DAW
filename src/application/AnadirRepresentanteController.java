package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class AnadirRepresentanteController {
	
	private Stage AnadirRepresentante;
	
	@FXML
	private Button Salir;
	
	@FXML
	private Button Guardar_Cambios;
	
	@FXML
	private TextField Nombre;
	
	@FXML
	private TextField Apellido;
	
	@FXML
	private TextField DNI;
	
	@FXML
	private TextField Telefono;
	
	@FXML
	private TextField Correo;
	
	@FXML
	private TextArea Observaciones;
	

	public void initialize() {
		
		
	}
	
	public static void dninovalido(){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("DNI INCORRECTO");
        alert.setHeaderText("El DNI no es valido, letra y numeros no concuerdan");
        alert.setContentText("Reviselo");
        alert.showAndWait();
    }
	
	public void NuevoRep() {
        TestConexion Añadirrep = new TestConexion();

      


        String DNIrep = DNI.getText();
        String NOMBRErep = Nombre.getText();
        String APELLIDOSrep = Apellido.getText();
        String CORREOrep = Correo.getText();
        String TELEFONOrep = Telefono.getText();
        String Observacionesrep = Observaciones.getText();
      

        ValidadorDNI validador = new ValidadorDNI(DNIrep);
        if(validador.validar()==true){
        //Tutor nuevo = new Tutor(DNItutor,NOMBREtutor,APELLIDOStutor,CORREOtutor,TELEFONOtutor,ObservacionesTutor,codconvenio);


        Añadirrep.InsertarReprNuevo(DNIrep,NOMBRErep,APELLIDOSrep,CORREOrep,TELEFONOrep,Observacionesrep);
       
        //String nombreempr = Empresa.getSelectionModel().getSelectedItem();
        //AñadirTutor.VincularEmpresaTutor(DNItutor, codconvenio);
        }
        else {
            dninovalido();
        }}

	public void setStagePrincipal(Stage AnadirRepresentante) {
		
		this.AnadirRepresentante = AnadirRepresentante;
	}

	public void closeWindow(){
		this.AnadirRepresentante.close();
	}
	
	
	


}



