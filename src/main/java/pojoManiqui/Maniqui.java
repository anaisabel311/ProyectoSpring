package pojoManiqui;


public class Maniqui {
	
	
	private long idMani;
	private Camisa cami;
	private Pantalon pan;
	
// CONSTRUCTOR DESNUDO
	
	public Maniqui(long idMani) {
		super();
		this.idMani = idMani;
	}
	
// CONSTRUCTOR CAMISA Y PANTALÓN

public Maniqui(long idMani, Camisa cami, Pantalon pan) {
	super();
	this.idMani = idMani;
	this.cami = cami;
	this.pan = pan;
}

// GETTERS AND SETTERS

public long getIdMani() {
	return idMani;
}

public void setIdMani(long idMani) {
	this.idMani = idMani;
}

public Camisa getCami() {
	return cami;
}

public void setCami(Camisa cami) {
	this.cami = cami;
}

public Pantalon getPan() {
	return pan;
}

public void setPan(Pantalon pan) {
	this.pan = pan;
}


//MÉTODO VESTIR CAMISA-PANTALÓN

public void vestirManiqui (Pantalon p, Camisa c) {
	desvestirManiqui (); // primero desvisto el maniquí.
	this.cami = c;
	this.pan = p;
			
}

// MÉTODO DESVESTIR

public void desvestirManiqui () {
	
	this.cami = null;
	this.pan = null;

	
}

@Override
public String toString() {
	return "Maniqui [idMani=" + idMani + ", cami=" + cami + ", pan=" + pan + "]";
}



}

	
	
	
