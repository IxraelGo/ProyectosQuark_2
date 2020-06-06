package es.pildoras.pruebaannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// leer el XML de configuraci�n
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir un BEan al contenedor
		Empleados Antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Lucia = contexto.getBean("comercialExperimentado", Empleados.class);
		
		// �Apuntan al mismo objeto en memoria?
		if (Antonio == Lucia) {
			System.out.println("Apuntan al mismo lugar de memoria.");
			System.out.println(Antonio + "\n" + Lucia);
		} else {
			System.out.println("No apuntan al mismo lugar en memoria.");
			System.out.println(Antonio + "\n" + Lucia);
		}
		// Cerrar el contexto
		contexto.close();

	}

}