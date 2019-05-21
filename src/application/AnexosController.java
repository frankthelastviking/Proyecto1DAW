package application;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AnexosController {
	
private Stage Anexos;

@FXML
private Button Anexo1;

@FXML
private Button Anexo2;
	
DatosColegio coledata = new DatosColegio("DAVID","PEREZ ALONSO","03866873K","COLEGIO VALLE DEL MIRO","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO", "SUROESTE");
DatosEmpresa empdata = new DatosEmpresa("DAVID","PEREZ ALONSO", "03866873K","INDRA","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO");
DatosAlumnos alumno = new DatosAlumnos("18/19","IFS02","DAW","20/03/2019", "20/06/2019","5", "09:00","15:00h", "14:00","18:00", 8, 370, "Valdemoro", "C/ Murillo 17", "Juan Carlos","Mataix Gilbert","123456789P", "Pedro", "Camacho Ortega", "1111111111T","arturo", "Casado");


public void initialize(){
	
	
	


}


public void genanex1() throws FileNotFoundException, DocumentException{
	
AnexoI anexoI = new AnexoI(coledata, empdata);
anexoI.generarAnexoI("", "");}

public void genanex2() throws FileNotFoundException, DocumentException{
AnexoII anexoII = new AnexoII(coledata, empdata, alumno);
anexoII.generarAnexoII("", "");
}

public void setStageAnexos(Stage anexos) {

this.Anexos = anexos;
}


public void closeWindow(){
this.Anexos.close();
}

}
