package es.pildoras.pruebaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.pildoras.pruebaannotation")
public class EmpleadosConfig {

	// Definir el bean para InformeFinancieroDtoCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { // Será el id del bean inyectado

		return new InformeFinancieroDtoCompras();

	}

	// Definir el bean para DirectorFinanciero e Inyectar Dependencias
	@Bean
	public Empleados directorFinanciero() {

		return new DirectorFinanciero(informeFinancieroDtoCompras());

	}

}
