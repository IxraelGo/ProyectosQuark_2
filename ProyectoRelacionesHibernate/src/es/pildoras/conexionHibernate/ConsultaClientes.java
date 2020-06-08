package es.pildoras.conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaClientes {
	
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();
		
		Session miSession= miFactory.openSession();
		
		try {
			
			//comenzar sesión
			miSession.beginTransaction();
			
			//Consulta de clientes
			List<Cliente> losClientes=miSession.createQuery("from Clientes").getResultList();
			
			//mostrar los clientes
			recorreClientesConsultados(losClientes);
			
			//consulta: dame los Gómez
			losClientes=miSession.createQuery("from Clientes cl where cl.apellidos='Gómez'").getResultList();
			
			recorreClientesConsultados(losClientes);
			
			//muestra los que viven en Gran Via o que se apellidan Delgado
			losClientes=miSession.createQuery("from Clientes cl where cl.apellidos='Delgado'" + 
			"or cl.direccion='Gran Vía'").getResultList();
			recorreClientesConsultados(losClientes);
			
			//commit
			miSession.getTransaction().commit();
			//cerrar la sesión
			miSession.close();
			
		}finally {
			miFactory.close();
		}
		
	}

	private static void recorreClientesConsultados(List<Cliente> losClientes) {
		for (Cliente unCliente:losClientes) {
			
			System.out.println(unCliente);
			
		}
	}

	
}
