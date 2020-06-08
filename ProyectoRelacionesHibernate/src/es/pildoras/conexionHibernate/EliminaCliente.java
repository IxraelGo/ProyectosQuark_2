package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
									   .addAnnotatedClass(Cliente.class)
									   .addAnnotatedClass(DetallesCliente.class)
									   .buildSessionFactory();
		
		Session miSession= miFactory.openSession();

		
		try {
						
			miSession.beginTransaction();//Inicia la transaccion para guardarlo
			
			Cliente elCliente=miSession.get(Cliente.class, 3);
			
			if(elCliente!=null) {
				
				System.out.println("Voy a eliminar al cliente " + elCliente.getNombre());
				
				miSession.delete(elCliente);
			}
			
			
			
			miSession.getTransaction().commit();
			
			if(elCliente!=null) System.out.println("Registro eliminado correctamente en BBDD.");		
			else System.out.println("Nada que eliminar");
			
			
			miSession.close();
			
			
			
		} finally {
			miFactory.close();
		}
		
		
	}

}
