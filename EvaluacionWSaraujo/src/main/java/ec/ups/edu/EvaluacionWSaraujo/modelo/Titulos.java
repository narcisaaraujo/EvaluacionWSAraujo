package ec.ups.edu.EvaluacionWSaraujo.modelo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Titulos")
public class Titulos implements Serializable{
	/**
	 * 
	 */
	@Id
    @Column(name = "id")
	private int id;
    @Column(name = "nombre")
	private String nombre;
    @Column(name = "universidad")
	private String universidad;
    @Column(name = "fecha")
	private Date fecha;
	@Column(name = "code")
	private String code;
	
	@ManyToOne
	private Persona persona;

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

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Titulos [id=" + id + ", nombre=" + nombre + ", universidad=" + universidad + ", fecha=" + fecha
				+ ", code=" + code + ", persona=" + persona + "]";
	}
	
	
	
}
