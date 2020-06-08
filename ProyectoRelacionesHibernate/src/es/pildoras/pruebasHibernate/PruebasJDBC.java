package es.pildoras.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebasJDBC {
	
	public static void main(String[] args) {
		//Datos
		String jdbcUrl="jdbc:mysql://localhost:3306/pruebasHibernate?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario="root";
		String contra="";
		
		try {
			
			System.out.println("Intentando conectar con la base de BBDD: "+ jdbcUrl);
			Connection miConexion= DriverManager.getConnection(jdbcUrl,usuario,contra);
			System.out.println("Conexión exitosa!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
