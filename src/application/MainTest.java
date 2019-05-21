package application;
import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;


public class MainTest {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub

		DatosColegio coledata = new DatosColegio("DAVID","PEREZ ALONSO","03866873K","COLEGIO VALLE DEL MIRO","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO", "SUROESTE");
		DatosEmpresa empdata = new DatosEmpresa("DAVID","PEREZ ALONSO", "03866873K","INDRA","CC123445","MADRID","C/ CLARA CAMPOAMOR","28032","12345678","12345678","123456789","VALDEMORO");
		DatosAlumnos alumno = new DatosAlumnos("18/19","IFS02","DAW","20/03/2019", "20/06/2019","5", "09:00","15:00h", "14:00","18:00", 8, 370, "Valdemoro", "C/ Murillo 17", "Juan Carlos","Mataix Gilbert","123456789P", "Pedro", "Camacho Ortega", "1111111111T","arturo", "Casado");

		AnexoI anexoI = new AnexoI(coledata, empdata);
		AnexoII anexoII = new AnexoII(coledata, empdata, alumno);
		anexoI.generarAnexoI("", "C:\\Users\\Frank\\Desktop\\Proyecto DAW1 FJ V (1)\\Proyecto DAW1 FJ V\\src");
		anexoII.generarAnexoII("", "C:\\Users\\Frank\\Desktop\\Proyecto DAW1 FJ V (1)\\Proyecto DAW1 FJ V\\src");

	}

}
