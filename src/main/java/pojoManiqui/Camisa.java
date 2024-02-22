package pojoManiqui;


import java.util.Set;

public class Camisa {

	private long id;
	private String color;
	private String talla;
	private double precio;
	private Set<Boton> botones;

	
// CONSTRUCTOR

public Camisa(long id, String color, String talla, double precio) {
	super();
	this.id = id;
	this.color = color;
	this.talla = talla;
	this.precio = precio;
	
}


// GETTERS AND SETTERS


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getTalla() {
	return talla;
}

public void setTalla(String talla) {
	this.talla = talla;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}


public Set<Boton> getBotones() {
	return botones;
}


public void setBotones(Set<Boton> botones) {
	this.botones = botones;
}


@Override
public String toString() {
	return "Camisa [id=" + id + ", color=" + color + ", talla=" + talla + ", precio=" + precio + ", "
			+ "botones=" + botones.size()+ "]";
}


	
	

	
	
	
	
	
	
}
