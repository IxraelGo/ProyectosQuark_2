package es.pildoras.pruebaannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.*;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	@Autowired
	@Qualifier("informeFinancieroTrim4") // bean Id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;

	/*
	 * @Autowired public ComercialExperimentado(CreacionInformeFinanciero
	 * nuevoInforme) { this.nuevoInforme = nuevoInforme; }
	 * 
	 * @Autowired public void queMasDaElNombre(CreacionInformeFinanciero
	 * nuevoInforme) { this.nuevoInforme = nuevoInforme; }
	 */
	
	
	//Ejecución de código después de creación del Bean.
	
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creación de bean.");
	}
	
	//Ejecución de código después del apagado contenedor Spring.
	
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destrucción del bean.");
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		// return "Este es un informe generado por el comercial.";
		return nuevoInforme.getInformeFinanciero();
	}

}
