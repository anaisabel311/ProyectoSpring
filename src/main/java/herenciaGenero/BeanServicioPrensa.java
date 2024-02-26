package herenciaGenero;

import java.util.List;

public class BeanServicioPrensa {
	
	
	private List <String> listprensa;

	
// CONSTRUCTORES
	
	public BeanServicioPrensa(List listprensa) {
		super();
		this.listprensa = listprensa;
	}

	public BeanServicioPrensa() {
		super();
	}

// GETTERS AND SETTERS
	
	
	public List<String> getListprensa() {
		return listprensa;
	}

	public void setListprensa(List<String> listprensa) {
		this.listprensa = listprensa;
	}
	
	
	

	public List<String> mostrarPrensa (String tipoSuscripcion){
		
		List<String> sublista=null;

		 if (tipoSuscripcion.equals("free")) {
				 sublista = listprensa.subList(0, 1);
			} else {
				if (tipoSuscripcion.equals("basic")) {
					sublista = listprensa.subList(1, 4);
				} else {
					if (tipoSuscripcion.equals("basic")) {
						sublista = listprensa.subList(1, 7);
					}
				}
			}
		
		return sublista;
	}

		
	public void leerPrensa (String periodicos) {
		if (this.listprensa.contains(periodicos))
		System.out.println("Leyendo " + periodicos);

	}
}		
	
	

	



