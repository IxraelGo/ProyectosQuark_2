package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
									   .addAnnotatedClass(Cliente.class)
									   .addAnnotatedClass(DetallesCliente.class)
									   .buildSessionFactory();
		
		Session miSession= miFactory.openSession();

		
		try {
			
			Cliente cliente1= new Cliente("Sandra","Delgado","Goya");
			
			DetallesCliente detallesCliente1= new DetallesCliente("www.pildorasinformaticas.es","321654","Primer cliente");
			
			//asociar los obejtos
			cliente1.setDetallesCliente(detallesCliente1);
						
			miSession.beginTransaction();//Inicia la transaccion para guardarlo
			
			// Esto guarda la información en las dos tablas relacionadas
			miSession.save(cliente1);
			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en BBDD.");		
			
			miSession.close();
			
			
			
		} finally {
			miFactory.close();
		}
		
		
	}

}
