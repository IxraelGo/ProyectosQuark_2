package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * /Creación de objetos de tipo Empleado Empleados Empleado1= new
		 * JefeEmpleado(); //Uso de los objetos creados
		 * System.out.println(Empleado1.getTareas());
		 */

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(Juan.getTareas());
		System.out.println(Juan.getIformes());

		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());

		/*
		 * SecretarioEmpleado María = contexto.getBean("miSecretarioEmpleado",
		 * SecretarioEmpleado.class);
		 * 
		 * System.out.println(María.getTareas());
		 * 
		 * System.out.println(María.getIformes());
		 * 
		 * System.out.println("E-mail: " + María.getEmail());
		 * 
		 * System.out.println(María.getNombreEmpresa());
		 * 
		 * System.out.println("E-mail Pablo: " + Pablo.getEmail());
		 */

		contexto.close();
	}

}
