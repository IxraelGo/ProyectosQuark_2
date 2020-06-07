package es.pildoras.conexionHibernate;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Clientes {
	@Id
	@Column(name="Id")
	private int id;
	@Column(name="Nombre")
	private String nombre;
	@Column(name="Apellido")
	private String apellidos;
	@Column(name="Direccion")
	private String direccion;
	
	//Constructores
	public Clientes() {}

	public Clientes(String nombre, String apellidos, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
	
	
}
