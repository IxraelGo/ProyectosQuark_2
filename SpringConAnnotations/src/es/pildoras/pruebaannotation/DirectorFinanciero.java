package es.pildoras.pruebaannotation;

public class DirectorFinanciero implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gesti�n y direcci�n de las opercaiones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	// Campo encapsulado
	private CreacionInformeFinanciero informeFinanciero;

	// Constructor para Inyecci�n del campo
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

}
