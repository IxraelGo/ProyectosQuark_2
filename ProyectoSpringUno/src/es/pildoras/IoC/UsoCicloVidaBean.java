package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		//Carga de XML de configuraci�n
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");  
		
		//Obtenci�n del Bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getIformes());
		//Cerrar el contexto
		contexto.close();
	}

}
