package pojoLogGetafe;

import java.io.Serializable;

//import org.springframework.beans.factory.annotation.Qualifier;

public class LogGetafe implements Serializable {
	
	private int nivelLog;
	
	


// GETTERS AND SETTERS
	
	
	
	public int getNivelLog() {
		return nivelLog;
	}

	public void setNivelLog(int nivelLog) {
		this.nivelLog = nivelLog;
	}
	
	
	
	// métodos
		
	public void trace(String msg) {
		if(0>=nivelLog) {
			System.out.println("TRACE: "+ msg);
		}
	}
	
	public void debug(String msg) {
		if (1>=nivelLog) {
		System.out.println("DEBUG: " + msg);
		}
	}
	
	public void info(String msg) {
		if (2>=nivelLog) {
			System.out.println("INFO: " + msg);
			}
	}
	public void warning(String msg) {
		if (3>=nivelLog) {
			System.out.println("WARNING: " + msg);
			}
		
	}
	public void error(String msg) {
		if (4>=nivelLog) {
			System.out.println("ERROR: " + msg);
			}
		
	}
	public void fatal(String msg) {
		if (5>=nivelLog) {
			System.out.println("FATAL: " + msg);
			}
	}
	
	
}
