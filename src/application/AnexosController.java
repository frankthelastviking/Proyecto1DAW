package application;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


import javafx.scene.control.ChoiceBox;


public class AnexosController {
	
private Stage Anexos;

@FXML
private Button Anexo1;

@FXML
private Button Anexo2;

@FXML
private Button SALIR;



@FXML
ChoiceBox<String> DNI;

@FXML
ChoiceBox<String> Empresa;
	
TestConexion conexion ;


DatosColegio coledata = new DatosColegio("DEIVID","PEREZ ALONSO","03866873K","COLEGIO VALLE DEL MIRO","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO", "SUROESTE");
DatosEmpresa empdata = new DatosEmpresa("DAVID","PEREZ ALONSO", "03866873K","INDRA","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO");
DatosAlumnos alumno = new DatosAlumnos("18/19","IFS02","DAW","20/03/2019", "20/06/2019","5", "09:00","15:00h", "14:00","18:00", 8, 370, "Valdemoro", "C/ Murillo 17", "Juan Carlos","Mataix Gilbert","123456789P", "Pedro", "Camacho Ortega", "1111111111T","arturo", "Casado");

ObservableList<String> EmpresaList = FXCollections.observableArrayList("");
ObservableList<String>AlumnosList = FXCollections.observableArrayList("");

public void initialize(){
	//AnexosController anexo =new AnexosController();
	conexion= new TestConexion();
	EmpresaList = conexion.ListadoEmpresas();
	
	Empresa.setItems(EmpresaList);


	AlumnosList = conexion.ListadoAlumnos();
	DNI.setItems(AlumnosList);
	
}


public DatosAlumnos generadorDatosAlumno() {
	String dni =DNI.getSelectionModel().getSelectedItem();
	System.out.println("obteniedno datos alumno" );
	System.out.println(DNI.getSelectionModel().getSelectedItem());
	TestConexion generaralu = new TestConexion();
	Alumno nuevoalupdf = generaralu.SelectDatosAlPDF(dni);
	DatosAlumnos alumno = new DatosAlumnos("18/19","IFS02","DAW","20/03/2019", "20/06/2019","5", "09:00","15:00h", "14:00","18:00", 8, 370, "Valdemoro", "C/ Murillo 17", nuevoalupdf.getNombre(),nuevoalupdf.getApellidos(),"123456789P", "Pedro", "Camacho Ortega", "1111111111T","arturo", "Casado");
	return alumno;
	
}

public void genanex1() throws FileNotFoundException, DocumentException{
	
AnexoI anexoI = new AnexoI(coledata, empdata);
anexoI.generarAnexoI("", "src/anexos/");}


public void genanex2() throws FileNotFoundException, DocumentException{
	//

AnexoII anexoII = new AnexoII(coledata, empdata, this.generadorDatosAlumno());
anexoII.generarAnexoII("", "C:\\");
}

public void setStageAnexos(Stage anexos) {

this.Anexos = anexos;
}


public void closeWindow(){
this.Anexos.close();
}

}
