package pojoManiqui;

import java.util.Map;

public class Tienda {
	
	private String nombre;
	private Map <String, Maniqui> maniquies;
	
// CONSTRUCTOR

	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
		
	}
	
	
// GETTERS AND SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Map<String, Maniqui> getManiquies() {
		return maniquies;
	}


	public void setManiquies(Map<String, Maniqui> maniquies) {
		this.maniquies = maniquies;
	}


	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", maniquies=" + maniquies + "]";
	}

	
}
