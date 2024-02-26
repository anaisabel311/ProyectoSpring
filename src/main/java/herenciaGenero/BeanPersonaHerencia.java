package herenciaGenero;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanPersonaHerencia {
	
	
	@Autowired
	private BeanServicioPrensa servicioPrensa;
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	private String tipodeSuscripcion;
	
	public BeanPersonaHerencia(String nombre, String apellidos, String dni, String tipodeSuscripcion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.tipodeSuscripcion = tipodeSuscripcion;
		
	}

	
	
	public BeanServicioPrensa getServicioPrensa() {
		return servicioPrensa;
	}



	public void setServicioPrensa(BeanServicioPrensa servicioPrensa) {
		this.servicioPrensa = servicioPrensa;
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

	public String getTipodeSuscripcion() {
		return tipodeSuscripcion;
	}

	public void setTipodeSuscripcion(String genero) {
		this.tipodeSuscripcion = tipodeSuscripcion;
	}
	
	@Override
	public String toString() {
		return "BeanPersonaHerencia [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", genero="
				+ genero + ", tipodeSuscripcion=" + tipodeSuscripcion + "]";
	}
	
	
	public void solicitarLectura() {
		List<String> periodicos = servicioPrensa.mostrarPrensa(tipodeSuscripcion);
		System.out.println("Estos son los periodicos que puedes leer: ");
			
			for (String periodico : periodicos) {
				System.out.println(periodico);
			}
		
		
	}
	
	
	public String leer (String periodico) {
		
		System.out.println("Selecciona un periodico");
		Scanner scan=new Scanner(System.in);
		String periodicoSeleccionado=scan.nextLine();
		
		return periodicoSeleccionado;
	
	}
	
	public void iniciarLectura() {
		
		solicitarLectura();
		//leer(solicitarLectura());
	}
}
