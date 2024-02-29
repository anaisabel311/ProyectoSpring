package Personabbdd;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import pojoLogGetafe.LogGetafe;

@Entity
@Table (name="TB_PERSONABBDD")



public class PersonaEntity implements Serializable {
	
	@Transient
	private LogGetafe logGetafe;
	
	
	
	@Id
	@SequenceGenerator(name="PERSONAENTITY", sequenceName="PERSONA_ENTITY", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONAENTITY")
	private long id;
	@Column (name="Nombre", length=50)
	private String nombre;
	@Column (name="Apellidos", length=50)
	private String apellidos;
	@Column (name="DNI", length=10)
	private String dni;
	@Column (name="SUSCRIPCION", length=10)
	private String tipoSuscripcion;//free,basic,premium
	
	public PersonaEntity(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public PersonaEntity(String nombre, String apellidos, String dni, String tipoSuscripcion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.tipoSuscripcion = tipoSuscripcion;
	}

	public PersonaEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the tipoSuscripcion
	 */
	public String getTipoSuscripcion() {
		return tipoSuscripcion;
	}

	/**
	 * @param tipoSuscripcion the tipoSuscripcion to set
	 */
	public void setTipoSuscripcion(String tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}

	/**
	 * @return the servicioPrensa
	 */
	/*
	 * public ServicioPrensa getServicioPrensa() { return servicioPrensa; }
	 */
	
	
	/**
	 * @return the logGetafe
	 */
	public LogGetafe getLogGetafe() {
		return logGetafe;
	}

	/**
	 * @param logGetafe the logGetafe to set
	 */
	public void setLogGetafe(LogGetafe logGetafe) {
		this.logGetafe = logGetafe;
	}


	@Override
	public String toString() {
		return "Persona [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (dni != null ? "dni=" + dni + ", " : "");
	}
	 
}










