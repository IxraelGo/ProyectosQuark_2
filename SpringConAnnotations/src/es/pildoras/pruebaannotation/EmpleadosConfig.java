package es.pildoras.pruebaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaannotation")
@PropertySource("classpath:datosEmpresa.propiedades")
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
