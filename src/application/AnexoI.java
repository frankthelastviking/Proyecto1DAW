package application;
import java.io.FileNotFoundException;
import com.itextpdf.text.Image;

import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AnexoI {


	DatosColegio coledata;
	DatosEmpresa empdata;



	public AnexoI(DatosColegio coledata, DatosEmpresa empdata) {
		this.coledata = coledata;
		this.empdata = empdata;

	}

	/* Este m�todo generar� el PDF del AnexoI con los datos que se han pasado al constructor
	 * recibir� como par�mentro el nombre del archivo y la ruta donde se ha de almacenar, si estos par�metros est�n vac�os
	 * generar� uno con AnexoI.pdf
	 */
	public void generarAnexoI(String filename, String filepath) throws FileNotFoundException, DocumentException {
		String sFileNamePath = "";

		if(!filepath.equals(""))
			sFileNamePath = filepath;

		if(filename.equals(""))
			sFileNamePath += "AnexoI";
		else
			sFileNamePath += filename;

		sFileNamePath += ".pdf";

		// Se crea el documento
		Document documento = new Document();


		// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
		FileOutputStream ficheroPdf = new FileOutputStream(sFileNamePath);

		// Se asocia el documento al OutputStream y se indica que el espaciado entre
		// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
		PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);

		// Se abre el documento.
		documento.open();

		/*try
		{
			Image foto = Image.getInstance("CAM.jpg");
			//foto.scaleToFit(100, 100);
			foto.setAlignment(Chunk.ALIGN_LEFT);
			documento.add(foto);
		}
		catch ( Exception e )
		{
			System.out.println(e.getMessage());
		}*/

		Paragraph p1 = new Paragraph("Anexo 1 \n FORMACI�N EN CENTROS DE TRABAJO ",
		FontFactory.getFont("arial",   // fuente
		11,                            // tama�o
		Font.BOLD));
		p1.setAlignment(Element.ALIGN_CENTER);
		documento.add(p1);

		Paragraph p2 = new Paragraph("Convenio de Colaboraci�n Centro Educativo-Empresa",
						FontFactory.getFont("arial",   // fuente
						11,                            // tama�o
						Font.BOLDITALIC));
		p2.setAlignment(Element.ALIGN_CENTER);
		documento.add(p2);

		Paragraph p3 = new Paragraph("(Centros educativos de titularidad privada)",
						FontFactory.getFont("arial",   // fuente
						11,
						Font.NORMAL));
		p3.setAlignment(Element.ALIGN_CENTER);
		documento.add(p3);


		Paragraph p4 = new Paragraph("\nCONVENIO N� " + empdata.getCodigoConvenio(),
		FontFactory.getFont("arial",   // fuente
				10,                            // tama�o
						Font.BOLD));

				documento.add(p4);

				Paragraph p5 = new Paragraph("\nDe una parte ",
						FontFactory.getFont("arial",   // fuente
						9,                            // tama�o
						Font.BOLD));

				documento.add(p5);

				Paragraph p6 = new Paragraph("\nD. " + this.coledata.getNombre() + " " + this.coledata.getApellidos() +"\ncon NIF " + this.coledata.getNIF() + " como director del Centro Educativo " + this.coledata.getCodigoCentro() + "\ndomiciliado en " + this.coledata.getCiudad(),
						FontFactory.getFont("arial",   // fuente
						9));

				documento.add(p6);
				Paragraph p7 = new Paragraph("provincia de " + this.coledata.getProvincia() + " calle," + this.coledata.getDireccion() + "\nC.P. " + this.coledata.getCP() + ", CIF " + this.coledata.getCIF() + ", Telefono " + this.coledata.getTelefono() + ", Fax" + this.coledata.getFax(),
						FontFactory.getFont("arial",   // fuente
						9));

				documento.add(p7);


				Paragraph p8 = new Paragraph("\nY de la otra ",
						FontFactory.getFont("arial",   // fuente
						10,                            // tama�o
						Font.BOLD));

				documento.add(p8);

				Paragraph p9 = new Paragraph("\nD. " + this.empdata.getNombreemp() + " " + this.empdata.getApellidosemp() +"\ncon NIF " + this.empdata.getNIFEmp() + " como representante legal de la Empresa/Entidad colaboradora " + this.empdata.getNombreEmpresa() + "\ndomiciliada en " + this.empdata.getCiudadEmp(),
						FontFactory.getFont("arial",   // fuente
						9));

				documento.add(p9);

				Paragraph p10 = new Paragraph("provincia de " + this.empdata.getProvinciaemp() + " calle," + this.empdata.getDireccionemp() + "\nC.P. " + this.empdata.getCPEmp() + ", CIF " + this.empdata.getCIFEmp() + ", Telefono " + this.empdata.getTelefonoEmp() + ", FaxEmp" + this.empdata.getFaxEmp(),
						FontFactory.getFont("arial",   // fuente
						9));

				documento.add(p10);


				Paragraph p11 = new Paragraph("\nEXPONEN ",
						FontFactory.getFont("arial",   // fuente
						10,                            // tama�o
						Font.BOLD));
				p11.setAlignment(Element.ALIGN_CENTER);
				documento.add(p11);

				Paragraph p12 = new Paragraph("     � Que ambas partes se reconocen rec�procamente capacidad y legitimidad para convenir. \n     � Que el objeto del presente Convenio es establecer la colaboraci�n entre las entidades a las que representan para el desarrollo de un Programa Formativo de Formaci�n en Centros de Trabajo, dirigido a los alumnos que cursan Formaci�n Profesional Reglada.\n     � El m�dulo profesional de Formaci�n en Centros de Trabajo est� regulado por el art�culo 25 del Real Decreto 1147/2011, de 29 de julio, por el que se establece la ordenaci�n general de la formaci�n profesional del sistema educativo",
						FontFactory.getFont("arial",   // fuente
						9));
				p12.setAlignment(Element.ALIGN_JUSTIFIED);
				documento.add(p12);

				Paragraph p13 = new Paragraph("\nACUERDAN ",
						FontFactory.getFont("arial",   // fuente
						10,                            // tama�o
						Font.BOLD));
				p13.setAlignment(Element.ALIGN_CENTER);
				documento.add(p13);

				Paragraph p14 = new Paragraph("         � Suscribir el presente Convenio de colaboraci�n para el desarrollo del m�dulo profesional de Formaci�n en Centros de Trabajo de los Ciclos Formativos y las Pr�cticas Formativas de otras ense�anzas, de acuerdo con las normas emitidas por la Consejer�a de Educaci�n e Investigaci�n de la Comunidad de Madrid, que ambas partes conocen y acatan, y a lo dispuesto en las cl�usulas que figuran al dorso de este documento.\n    � Incorporar durante su per�odo de vigencia las relaciones nominales de alumnos acogidos al mismo (Relaci�n de Alumnos), la programaci�n de las actividades formativas a desarrollar por �stos en las empresas (Programa Formativo), y los documentos que faciliten su seguimiento y evaluaci�n.",
						FontFactory.getFont("arial",   // fuente
						9));
				p14.setAlignment(Element.ALIGN_JUSTIFIED);
				documento.add(p14);

				Paragraph p15 = new Paragraph("\n\n\nEn                                                           a               de                                               de      \nEL TITULAR DEL CENTRO                                                                     EL REPRESENTANTE  DE LA EMPRESA\n\n\n\n\nFdo.:                                                                     Fdo.:",
						FontFactory.getFont("arial",   // fuente
						9));
				documento.add(p15);

				Paragraph p16 = new Paragraph("\n\n\n\n\nCLAUSULAS ",
						FontFactory.getFont("arial",   // fuente
						10,                            // tama�o
						Font.BOLD));
				p16.setAlignment(Element.ALIGN_CENTER);
				documento.add(p16);

				Paragraph p17 = new Paragraph("PRIMERA.- Los alumnos que figuran en la �Relaci�n de Alumnos� del presente convenio desarrollar�n las actividades formativas programadas (Programa Formativo), en los locales del centro o centros de trabajo de la empresa firmante, o, en su caso, en aquellos lugares en los que la empresa desarrolle su actividad productiva, sin que ello implique relaci�n laboral alguna con ella.\n\nSEGUNDA.- La empresa se compromete al cumplimiento de la programaci�n de actividades formativas que previamente hayan sido acordadas con el centro educativo, a realizar su seguimiento y la valoraci�n del progreso de los alumnos y, junto con el tutor del centro educativo, a la revisi�n de la programaci�n, si una vez iniciado el per�odo de pr�cticas, y a la vista de los resultados, fuese necesario.\n\nTERCERA.- La empresa nombrar� un responsable para la coordinaci�n de las actividades formativas a realizar en el centro de trabajo, que garantizar� la orientaci�n y consulta del alumno, facilitar� las relaciones con el profesor-tutor del centro educativo y aportar� los informes valorativos que contribuyen a la evaluaci�n. A tal fin, facilitar� al profesor-tutor del centro educativo el acceso a la empresa y las actuaciones de valoraci�n y supervisi�n del proceso.\n\nCUARTA.- Cada alumno dispondr� de un documento de seguimiento y evaluaci�n de las actividades realizadas, que ser� supervisado por el responsable de la empresa en colaboraci�n con el tutor del centro educativo. En dicho documento figurar�n las actividades formativas m�s significativas realizadas en la empresa, con registro de los resultados obtenidos, que cumplimentar� el responsable de la empresa.\n\nQUINTA.- La empresa o entidad colaboradora no podr� cubrir, ni siquiera con car�cter interino, ning�n puesto de trabajo en plantilla con el alumno que realice actividades formativas en ella, salvo que se establezca al efecto una relaci�n laboral de contraprestaci�n econ�mica por servicios contratados. En este caso, se considerar� que el alumno abandona el programa formativo en el centro de trabajo, debi�ndose comunicar este hecho por la empresa o instituci�n colaboradora al Titular del Centro, quien lo pondr� en conocimiento de la Direcci�n del �rea Territorial correspondiente.\n\nSEXTA.- Los alumnos no percibir�n cantidad alguna por la realizaci�n de las actividades formativas en la empresa.\n\nS�PTIMA.- La duraci�n de este convenio es de un a�o a partir de su firma, consider�ndose prorrogado autom�ticamente cuando ninguna de las partes firmantes manifieste lo contrario. Podr� rescindirse por mutuo acuerdo entre el centro educativo y la instituci�n colaboradora, o por denuncia de una de las partes, que ser� comunicada a la otra con una antelaci�n m�nima de 15 d�as, cuando concurra alguna de las circunstancias siguientes: \na) Cese de actividades del centro educativo o de la entidad colaboradora.\nb) Imposibilidad de desarrollar adecuadamente las actividades programadas, por causas imprevistas.\nc) Incumplimiento de las cl�usulas establecidas en el convenio de colaboraci�n en relaci�n con las normas por las que se rijan las actividades programadas.\n\nIgualmente, podr� excluirse la participaci�n en el convenio de uno o varios alumnos por decisi�n unilateral del centro educativo, de la instituci�n colaboradora, o conjunta de ambos, previa audiencia del interesado, en los siguientes casos:\n\na) Faltas repetidas de asistencia o puntualidad no justificadas.\nb) Actitud incorrecta o falta de aprovechamiento.\nc) Incumplimiento del programa formativo en el centro de trabajo.\n\nEn cualquier caso, el Centro Educativo deber� informar a la Direcci�n del �rea Territorial de la extinci�n o rescisi�n del Convenio.\nnAsimismo, los representantes de los trabajadores de los centros de trabajo ser�n informados del contenido espec�fico del programa formativo que desarrollar�n los alumnos sujetos al convenio de colaboraci�n, de su duraci�n, del horario de las actividades, y la localizaci�n del Centro o Centros de trabajo donde �stas se realizar�n.\n\nOCTAVA.- Cualquier eventualidad de accidente que pudiera producirse ser� contemplada a tenor del Seguro Escolar, de acuerdo con la Reglamentaci�n establecida por el Decreto 2078/71 de 13 de agosto (BOE del 13 de septiembre). Todo ello sin perjuicio de la p�liza que la Consejer�a de Educaci�n e Investigaci�n pueda suscribir como seguro adicional para mejorar indemnizaciones, cubrir da�os a terceros o responsabilidad civil.\n\nNOVENA.- En todo momento, el alumno ir� provisto del D.N.I. o documento acreditativo de la identidad y tarjeta de identificaci�n del centro educativo.",
						FontFactory.getFont("arial",   // fuente
						9));
				p17.setAlignment(Element.ALIGN_JUSTIFIED);
				documento.add(p17);

				documento.close();


	}

}
