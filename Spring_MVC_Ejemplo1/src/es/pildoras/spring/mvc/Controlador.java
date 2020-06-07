package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	// mensaje de prueba
	// Mensaje de prueba 2
	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}

}
