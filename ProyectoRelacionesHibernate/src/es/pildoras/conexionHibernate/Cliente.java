package es.pildoras.conexionHibernate;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellidos;
	@Column(name="direccion")
	private String direccion;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private DetallesCliente detallesCliente;
	
	//Constructoress
	public Cliente() {}

	public Cliente(String nombre, String apellidos, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
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
