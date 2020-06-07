package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaClientePrueba {

	
	
	//yyyyy
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession= miFactory.openSession();
		
		try {
			Clientes cliente1= new Clientes("Juan","Díaz","Gran Vía");
			
			miSession.beginTransaction();//Inicia la transaccion para guardarlo
			miSession.save(cliente1);
			miSession.getTransaction().commit();
			System.out.println("Registro insertado correctamente en BBDD.");
			miFactory.close();
			
		} finally {
			miFactory.close();
		}
		
	}

}
