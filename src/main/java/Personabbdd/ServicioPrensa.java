package Personabbdd;

import java.util.List;

public class ServicioPrensa {

	private List<String> periodicos;

	public ServicioPrensa(List<String> periodicos) {
		super();
		this.periodicos = periodicos;
	}

	/**
	 * @return the periodicos
	 */
	public List<String> getPeriodicos() {
		return periodicos;
	}

	/**
	 * @param periodicos the periodicos to set
	 */
	public void setPeriodicos(List<String> periodicos) {
		this.periodicos = periodicos;
	}
	

	
	public void leerPeriodico(String periodico) {
		
		if (this.periodicos.contains(periodico)) {
			System.out.println("leyendo "+periodico);
		}else {
			System.out.println("Periódico inexistente");
		}
		
	}
	
}








