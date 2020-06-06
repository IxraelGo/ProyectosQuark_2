package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	// Dependencia que inyecta con un setter
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getIformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}

	private CreacionInformes informeNuevo;

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

}
