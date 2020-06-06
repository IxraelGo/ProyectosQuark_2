package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	// Creaci�n de campo tipo Creaci�nInforme (interfaz)

	private CreacionInformes informeNuevo;

	// Creac�i�n de constructor que inyecta la independencia
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

	// Creaci�n de inyecci�n de campos
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
	
	//M�todo init. Ejecutar tareas antes de que el bean est� disponible 
	public void metodoInicial() {
		System.out.println("Dentro del m�todo init. Aqu� irian las tareas a ejecutar antes de que el bean est� listo.");
	}

	//M�todo Destroy. Ejecutar tareas despu�s de que el bean haya sido utilizado.	
	public void metodoFinal() {
		System.out.println("Dentro del m�todo destroy. Aqu� irian las tareas a ejecutar despues de utilizar el bean");
	}
	
}