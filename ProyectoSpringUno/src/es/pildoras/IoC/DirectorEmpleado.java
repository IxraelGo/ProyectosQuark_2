package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	// Creación de campo tipo CreaciónInforme (interfaz)

	private CreacionInformes informeNuevo;

	// Creacñión de constructor que inyecta la independencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getIformes() {
		// TODO Auto-generated method stub
		return "Informe crado por el constructor: " + informeNuevo.getInforme();
	}

	// Creación de inyección de campos
	private String email;
	private String nombreEmpresa;

	// Creacion de los Getter y Setters de los campos
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//Método init. Ejecutar tareas antes de que el bean esté disponible 
	public void metodoInicial() {
		System.out.println("Dentro del método init. Aquí irian las tareas a ejecutar antes de que el bean esté listo.");
	}

	//Método Destroy. Ejecutar tareas después de que el bean haya sido utilizado.	
	public void metodoFinal() {
		System.out.println("Dentro del método destroy. Aquí irian las tareas a ejecutar despues de utilizar el bean");
	}
	
}