package es.pildoras.pruebaannotation;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {
	
	
	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentaci�n de informe financiero del trimestre 1";
	}

}
