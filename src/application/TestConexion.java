package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
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
	

	public TestConexion()  {
		
		
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexi�n establecida");
				//conexion.close();
			}
			else
				System.out.println("Fallo en Conexi�n");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexi�n con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
		
	public String Consulta() {
		
		String aux = "";
		
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery("SELECT * FROM "+esquema+".ALUMNOS" ); 
			while(rset.next()) {
				aux += rset.getInt(1) + " " + rset.getString(2) ;
				aux += "\n";
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
		hola.Consulta();
		conexion.close();
	}

	
	
}