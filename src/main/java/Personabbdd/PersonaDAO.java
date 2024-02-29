package Personabbdd;


import Personabbdd.PersonaEntity;

public interface PersonaDAO {

	public void guardarPersona(PersonaEntity persona);
	
	public PersonaEntity getPersona (String nombre);
}
