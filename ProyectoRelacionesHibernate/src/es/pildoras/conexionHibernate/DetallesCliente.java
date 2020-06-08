package es.pildoras.conexionHibernate;

import javax.persistence.*;

@Entity
@Table(name="detalles_cliente")
public class DetallesCliente {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="web")
	private String web;
	@Column(name="tfno")
	private String tfno;
	@Column(name="comentarios")
	private String comentarios;
	
	//Constructoress
	public DetallesCliente() {}

	public DetallesCliente(String web, String tfno, String comentarios) {
		super();
		this.web = web;
		this.tfno = tfno;
		this.comentarios = comentarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	
	
	
	
	
	
	
}
