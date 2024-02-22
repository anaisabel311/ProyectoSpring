package pojoLogGetafe;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculadora {

	
	@Autowired
	private LogGetafe log;
	private int ope1;
	private int ope2;
	
	
// GETTERS AND SETTERS
	
	
	public LogGetafe getLog() {
		return log;
	}
	public void setLog(LogGetafe log) {
		this.log = log;
	}
	public int getOpe1() {
		return ope1;
	}
	public void setOpe1(int ope1) {
		this.ope1 = ope1;
	}
	public int getOpe2() {
		return ope2;
	}
	public void setOpe2(int ope2) {
		this.ope2 = ope2;
	}
	
	
	public void sumar(int ope1, int ope2) {
		
		int resultado=ope1+ope2;
		log.trace("La suma de " +ope1+ " + " +ope2+ " es igual a "+ resultado);
	}
}
