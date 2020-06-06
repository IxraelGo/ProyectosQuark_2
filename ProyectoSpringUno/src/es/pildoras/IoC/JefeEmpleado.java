package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de secci�n.";
	}

	@Override
	public String getIformes() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}

}