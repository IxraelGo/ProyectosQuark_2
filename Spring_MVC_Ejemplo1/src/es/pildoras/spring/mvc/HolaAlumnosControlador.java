package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { // Proporciona el formulario

		return "HolaAlumnosFormulario";

	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {// Devuelve el formulario

		return "HolaAlumnosSpring";

	}

	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {

		String nombre = request.getParameter("nombreAlumno");

		nombre += " es el mejor alumno";

		String mensajeFinal = "�Qui�n es el mejor alumno? " + nombre;

		// Agregando Informacio al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);

		return "HolaAlumnosSpring";

	}

}
