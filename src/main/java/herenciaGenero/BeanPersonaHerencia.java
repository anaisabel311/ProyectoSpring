package herenciaGenero;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanPersonaHerencia {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	
	public BeanPersonaHerencia(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "PersonaHerenciaSpring [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", genero="
				+ genero + "]";
	}
	
	

}
