package es.pildoras.pruebaannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		
		
		//leer el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Pedir un BEan al contenedor
		Empleados Antonio =contexto.getBean("ComercialExperimentado",Empleados.class);
		//Usar el Bean
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		//Cerrar el contexto
		contexto.close();
	}

}
