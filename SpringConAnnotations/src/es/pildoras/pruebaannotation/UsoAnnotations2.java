package es.pildoras.pruebaannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {

		// leer el XML de configuración
		// ClassPathXmlApplicationContext contexto = new
		// ClassPathXmlApplicationContext("applicationContext.xml");

		// Leer el class de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// Pedir un Bean al contenedor

		DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Email del director: " + empleado.getEmail());
		System.out.println("Nombre de la empresa: " + empleado.getNombreEmpresa());

		/*
		 * Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		 * 
		 * System.out.println(empleado.getTareas());
		 * System.out.println(empleado.getInforme());
		 */

		/*
		 * Empleados Antonio = contexto.getBean("comercialExperimentado",
		 * Empleados.class); Empleados Lucia =
		 * contexto.getBean("comercialExperimentado", Empleados.class);
		 * 
		 * // ¿Apuntan al mismo objeto en memoria? if (Antonio == Lucia) {
		 * System.out.println("Apuntan al mismo lugar de memoria.");
		 * System.out.println(Antonio + "\n" + Lucia); } else {
		 * System.out.println("No apuntan al mismo lugar en memoria.");
		 * System.out.println(Antonio + "\n" + Lucia); }
		 */

		// Cerrar el contexto
		contexto.close();

	}

}
