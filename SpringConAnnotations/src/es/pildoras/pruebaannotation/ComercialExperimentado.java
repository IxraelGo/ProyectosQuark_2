package es.pildoras.pruebaannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	
	
	
	@Autowired
	private CreacionInformeFinanciero nuevoInforme;
	
	/*
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	@Autowired
	public void queMasDaElNombre(CreacionInformeFinanciero nuevoInforme) {        
		this.nuevoInforme = nuevoInforme;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!!";
	}




	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Este es un informe generado por el comercial.";
		return nuevoInforme.getInformeFinanciero();
	}

}
