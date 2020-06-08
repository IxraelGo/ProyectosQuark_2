package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaClientes {

	
	
	//yyyyy
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
		
		Session miSession= miFactory.openSession();
		
		try {
			
			//int ClienteId=1;
			
			miSession.beginTransaction();//Inicia la transaccion para guardarlo
			
			//Clientes miCliente=miSession.get(Clientes.class,ClienteId);
			
			//miCliente.setNombre("Juan");
			
			miSession.createQuery("delete Clientes where Direccion = 'Goya'").executeUpdate();
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro Eliminado correctamente en BBDD.");
			
						
			
			miSession.close();
			
			
			
		} finally {
			miFactory.close();
		}
		
	}

}
