package es.pildoras.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class)
				.addAnnotatedClass(DetallesCliente.class).buildSessionFactory();

		Session miSession = miFactory.openSession();

		try {

			miSession.beginTransaction();// Inicia la transaccion para guardarlo

			
			miSession.getTransaction().commit();
			
			// Obtener DetallesCliente
			DetallesCliente detallesDeCliente = miSession.get(DetallesCliente.class, 1);
			
			System.out.println(detallesDeCliente);
			
			System.out.println(detallesDeCliente.getElCliente());

			miSession.close();

		} finally {
			miFactory.close();
		}

	}

}
