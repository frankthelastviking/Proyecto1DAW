package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class TestConexion {
	
	Properties propiedades = new Properties();
	InputStream entrada = null;
	private String url;
	private String usr;
	private String pwd;
	private String esquema;
	private static Connection conexion;
	
	
	public TestConexion() {
		
		try {
			File miFichero = new File("src/configuracion.ini");
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				propiedades.load(entrada);
				
				url=propiedades.getProperty("url");
				usr=propiedades.getProperty("usuario");
				pwd=propiedades.getProperty("clave");
				esquema=propiedades.getProperty("esquema");
				
			}
			else{
				System.out.println("Fichero no encontrado");
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		
			
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
				//conexion.close();
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
		
	public String ConsultaFecha() {
		
		String aux = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {


			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT FECHA_FIRMA_CONVENIO FROM "+esquema+".EMPRESAS" ); 
			while(rset.next()) {
				aux += sdf.format(rset.getDate(1))  ;
				aux += "\n";
				System.out.println(aux);
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		return aux;
		
	}
	
	
	//AQUI EMPIEZAN LOS METODOS PARA INSERTAR EN LA BBDD
	
public void InsertarAlumnoNuevo(String dni, String nombre, String apellidos, String Observaciones ) {
		
		
		
		try {
			PreparedStatement stmt;
			stmt = conexion.prepareStatement("INSERT INTO "+esquema+".ALUMNOS VALUES (?,?,?,?)");
			
			stmt.setString(1,dni);
			stmt.setString(2,nombre);
			stmt.setString(3,apellidos);
			stmt.setString(4,Observaciones);
			
			//stmt.executeUpdate("INSERT INTO "+esquema+".ALUMNOS VALUES ('"+dni+"','"+nombre+"','"+apellidos+"','"+Observaciones+"')");
				
			System.out.println("INSERT INTO "+esquema+".ALUMNOS VALUES ('"+dni+"','"+nombre+"','"+apellidos+"','"+Observaciones+"')");
			stmt.executeUpdate();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		
	}


public void InsertarEmpresaNueva(String Cod_Convenio ,String NIF,String Especialidad,String firmaDT ,String finDT,String basico, String medio, String Superior, String ObservacionesST,String Nombre,String NplzST ) {
	
	
	
	
	try {
		PreparedStatement stmt;
		stmt = conexion.prepareStatement("INSERT INTO "+esquema+".EMPRESAS VALUES (?,?,?,?,?,?,?,?,?,?,?)");
		
		stmt.setString(1,Cod_Convenio);
		stmt.setString(2,NIF);
		stmt.setString(3,Especialidad);
		stmt.setString(4,firmaDT);
		stmt.setString(5,finDT);
		stmt.setString(6,basico);
		stmt.setString(7,medio);
		stmt.setString(8,Superior);
		stmt.setString(9,ObservacionesST);
		stmt.setString(10,Nombre);
		stmt.setString(11,NplzST);
		
		//stmt.executeUpdate("INSERT INTO "+esquema+".EMPRESAS VALUES ('"+Cod_Convenio+"','"+NIF+"','"+Especialidad+"','"+firmaDT+"','"+finDT+"','"+basico+"','"+medio+"','"+Superior+"','"+ObservacionesST+"','"+Nombre+"','"+NplzST+"')" ); 
		
		stmt.executeUpdate();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	
	
}

public void InsertarTutorNuevo(String dni, String codconvenio ,String nombre, String apellidos,String correo,String telefono, String Observaciones) {
	
	
	
	try {
		PreparedStatement stmt;
		stmt = conexion.prepareStatement("INSERT INTO "+esquema+".TUTOR_EMPRESA VALUES (?,?,?,?,?,?,?)");
		
		stmt.setString(1,dni);
		stmt.setString(2,codconvenio);
		stmt.setString(3,nombre);
		stmt.setString(4,apellidos);
		stmt.setString(5,correo);
		stmt.setString(6,telefono);
		stmt.setString(7,Observaciones);
		
		
			
		System.out.println("INSERT INTO "+esquema+".TUTOR_EMPRESA VALUES ('"+dni+"','"+codconvenio+"','"+nombre+"','"+apellidos+"','"+correo+"','"+telefono+"','"+Observaciones+"')");
		stmt.executeUpdate();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	
	
}

public void ActualizarAlumnos(String dni, String nombre, String apellidos, String Observaciones,String dniviejo) {
	
	
	
	try {
		PreparedStatement stmt;
		stmt = conexion.prepareStatement("UPDATE Alumnos SET DNI = ?, NOMBRE = ? ,APELLIDOS = ?, OBSERVACIONES = ? WHERE DNI = ?" );
		
		stmt.setString(1,dni);
		stmt.setString(2,nombre);
		stmt.setString(3,apellidos);
        stmt.setString(4,Observaciones);
		stmt.setString(5,dniviejo);
		
			
		System.out.println("Este mensaje esta programado para imprimirse jsuto antes de donde creo que esta el cancer. si lo ves visita el metodo actualizaralumnos en la clase testconexion");
		stmt.executeUpdate();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	
	
}

public void ActualizarTutores(String dni, String codconvenio ,String nombre, String apellidos,String correo,String telefono, String Observaciones,String dniviejo) {
	
	
	
	try {
		PreparedStatement stmt;
		stmt = conexion.prepareStatement("UPDATE TUTOR_EMPRESA SET DNI = ?,Cod_Convenio = ?, NOMBRE = ? ,APELLIDOS = ? ,CORREO = ? ,TELEFONO = ?, OBSERVACIONES = ? WHERE DNI = ?" );
		
		stmt.setString(1,dni);
		stmt.setString(2,codconvenio);
		stmt.setString(3,nombre);
		stmt.setString(4,apellidos);
		stmt.setString(5,correo);
		stmt.setString(6,telefono);
        stmt.setString(7,Observaciones);
		stmt.setString(8,dniviejo);
		
			
		System.out.println("Este mensaje esta programado para imprimirse jsuto antes de donde creo que esta el cancer. si lo ves visita el metodo actualizartutores en la clase testconexion");
		stmt.executeUpdate();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	
	
}


public void VincularEmpresaTutor(String dnitut, String codcon) {
	
	
	
	try {
		PreparedStatement stmt;
		stmt = conexion.prepareStatement("INSERT INTO "+esquema+".E_TIENEN VALUES (?,?)");
		System.out.println("dnitut" + dnitut+ " codcon " + codcon);
		stmt.setString(1,dnitut);
		stmt.setString(2,codcon);
		
		
		
			

		stmt.executeUpdate();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	
	
}


public String SelectCodWhereNombre(String nombre) {
	
	String aux="";
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT Cod_Convenio FROM "+esquema+".EMPRESAS WHERE Nombre='"+nombre+"'");
		while(rset.next()) {
			aux +=rset.getString(1);
			
		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}


public String SelectNombreWhereCod(String cod) {
	
	String aux="";
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT Nombre FROM "+esquema+".EMPRESAS WHERE Cod_Convenio = '"+cod+"'");
		while(rset.next()) {
			aux +=rset.getString(1);
			
		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}

public ObservableList<String> ListadoEmpresas() {
	
	ObservableList<String> aux = FXCollections.observableArrayList();
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM "+esquema+".EMPRESAS" );
		while(rset.next()) {
			aux.add(rset.getString(10));

		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}


public ObservableList<Alumno> CargarTablaAlumnos() {
	
	ObservableList<Alumno> aux = FXCollections.observableArrayList();
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM "+esquema+".ALUMNOS" );
		while(rset.next()) {
			String DNI = rset.getString(1);
			String Nombre = rset.getString(2);
			String Apellidos = rset.getString(3);
			String Observaciones = rset.getString(4);
			Alumno alnuevo=new Alumno(DNI,Nombre,Apellidos,Observaciones);
			aux.add(alnuevo);

		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}

public ObservableList<Tutor> CargarTablaTutor() {
	
	ObservableList<Tutor> aux = FXCollections.observableArrayList();
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("SELECT * FROM "+esquema+".TUTOR_EMPRESA" );
		while(rset.next()) {
			String DNI = rset.getString(1);
			String codconv = rset.getString(2);
			String Nombre = rset.getString(3);
			String Apellidos = rset.getString(4);
			String corr = rset.getString(5);
			String tel = rset.getString(6);
			String Observaciones = rset.getString(7);
			Tutor tutornuevo=new Tutor(DNI,Nombre,Apellidos,corr,tel,Observaciones,codconv);
			aux.add(tutornuevo);

		}
		rset.close();
		stmt.close();
		
	}catch (SQLException s){
		s.printStackTrace();
	}
	return aux;
	
}



	
	public static void main(String[] args) throws SQLException {
		
		
		
		TestConexion hola = new TestConexion();
		hola.ConsultaFecha();
		conexion.close();
	}

	
	
}
