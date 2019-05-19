package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Properties;


public class TestConexion {
	
	Properties propiedades = new Properties();
	InputStream entrada = null;
	private String url;
	private String usr;
	private String pwd;
	private String esquema;
	{
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
	
		
	}
	
	private static Connection conexion;
	

	public void Conectar()  {
		
		
		
		
		
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
	
public String InsertarAlumnoNuevo(String dni, String nombre, String apellidos, String Observaciones ) {
		
		String aux = "";
		
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("INSERT INTO "+esquema+".ALUMNOS VALUES ('"+dni+"','"+nombre+"','"+apellidos+"','"+Observaciones+"')");
				
			while(rset.next()) {
				
				
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		return aux;
		
	}


public String InsertarEmpresaNueva(String Cod_Convenio ,String NIF,String Especialidad,java.util.Date firmaDT ,java.util.Date finDT,String basico, String medio, String Superior, String ObservacionesST,String Nombre,String NplzST ) {
	
	String aux = "";
	
	
	try {
		Statement stmt = conexion.createStatement();
		ResultSet rset = stmt.executeQuery("INSERT INTO "+esquema+".EMPRESAS VALUES ('"+Cod_Convenio+"','"+NIF+"','"+Especialidad+"','"+firmaDT+"','"+finDT+"','"+basico+"','"+medio+"','"+Superior+"','"+ObservacionesST+"','"+Nombre+"','"+NplzST+"')" ); 
		while(rset.next()) {
			
			
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
