package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class CursosYCiclosController {
	
private Stage CursosYCiclos;
	
	@FXML
	private Button Salir;
	
	@FXML
	private Button GenerarCurso;
	
	@FXML
	private Button Nuevo_Ciclo;
	
	@FXML
	private Button GuardarCambios;
	
	@FXML
	private Button AdjOtraDoc;

	@FXML
	private Button DocPres1 ;
	
	@FXML
	private Button DocPres2 ;
	
	@FXML
	private TextField Nombre;
	
	@FXML
	private TextField FamiliaProf;
	
	@FXML
	private TextField Tipo;
	
	@FXML
	private TextField Codciclo;
	
	@FXML
	private TextField nplz;
	
	@FXML
	private TextField nhors;
	
	@FXML
	private TextField AnoAcad;
	
	@FXML
	private TextField nhrsCUR;
	
	@FXML
	private CheckBox Vigente;
	
	@FXML
	private ChoiceBox<String> ciclo;
	
	@FXML
	private TableView<Ciclo> Tabla;
	
	@FXML
	private TableColumn<Ciclo,String> Colcod;

	@FXML
	private TableColumn<Ciclo,String> ColTipo;

	@FXML
	private TableColumn<Ciclo,String> Colfamiliaprof;

	
	@FXML
	private TableColumn<Ciclo,String> Colhoras;
	
	@FXML
	private TableColumn<Ciclo,String> Colnplz;
	
	@FXML
	private TableColumn<Ciclo,String> Colnombr;

	ObservableList<String> CicloList = FXCollections.observableArrayList("");
	
	TestConexion conexionbbdd;

	public void initialize() {
		
		
		
		
		    conexionbbdd = new TestConexion();
			
			CicloList = conexionbbdd.ListadoEmpresas();
			
			ciclo.setItems(CicloList);
		
			Tabla.setItems(conexionbbdd.CargarTablaCursosYCiclos());
		
		Colcod.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("cod_ciclo"));
		ColTipo.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("tipo"));
		Colfamiliaprof.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("familiaprof"));
		Colhoras.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("nhoras"));
		Colnplz.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("Nplz"));
		Colnombr.setCellValueFactory(new PropertyValueFactory<Ciclo,String>("nombre"));
		
		
		
	}
	
	public void NuevoCiclo() {
		
		String codciclo = Codciclo.getText();
		String tipo = Tipo.getText();
		String familiaprof = Codciclo.getText();
		String nhoras = Codciclo.getText();
		String vigente;
		if (Vigente.isSelected()==true) {
			vigente="SI";
			}
			else {
			vigente="NO";
			}
		String Nplz = nplz.getText();
		String nmbr = Nombre.getText();
		
		TestConexion AñadirCiclo = new TestConexion();
		AñadirCiclo.InsertarCicloNuevo(codciclo, tipo, familiaprof, nhoras,vigente,Nplz,nmbr);	
		Tabla.setItems(AñadirCiclo.CargarTablaCursosYCiclos());}
	
	public void EditarCiclo() {
		
		Ciclo editar = Tabla.getSelectionModel().getSelectedItem();
		
		Nombre.setText(editar.getNombre());
		FamiliaProf.setText(editar.getFamiliaprof());
		Tipo.setText(editar.getTipo());
		Codciclo.setText(editar.getCod_ciclo());
		nplz.setText(editar.getNplz());
		nhors.setText(editar.getNhoras());
		
		
	}
	
	
String herotoelsistema="";
	
	
	public void herotoelsistema() {
		herotoelsistema=Codciclo.getText();
	}
	
    public void GuardarCambios() {
		
		TestConexion update = new TestConexion();
		String codviejo=herotoelsistema;
		//System.out.println(dniviejo);
		String nombre=Nombre.getText();
		String familia=FamiliaProf.getText();
		String tipo=Tipo.getText();
		String cod=Codciclo.getText();
		String nplazas=nplz.getText();
		String horas=	nhors.getText();
		
		//update.ActualizarAlumnos(dni, nombre, apellidos, observaciones, dniviejo);
		//Tabla.setItems(update.CargarTablaAlumnos());
	}
    
	
	
	public void setStageCursosYCiclos(Stage CursosYCiclos) {
		
		this.CursosYCiclos = CursosYCiclos;
	}

	public void closeWindow(){
		this.CursosYCiclos.close();
	}

}
