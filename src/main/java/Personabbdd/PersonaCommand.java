package Personabbdd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;



public class PersonaCommand implements PersonaDAO {

	//private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;
	
	@Autowired
	private ServicioPrensa sp;
	
	
	public PersonaCommand(){
		
	}

//	public SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//		//template=new HibernateTemplate(sessionFactory);
//	}


	public void guardarPersona(PersonaEntity persona) {
		template.save(persona);
	}


	public PersonaEntity getPersona (String nombre) {
		String query = "from PersonaEntity where nombre = ?";
		return (PersonaEntity) template.find(query, nombre).get(0);
	}

	public List<String> mostrarPrensa(String tipoSuscripcion){
		List<String> listaEnvio=null;

		
		if (tipoSuscripcion.equalsIgnoreCase("free")) {
			listaEnvio = sp.getPeriodicos().subList(0, 1);
		}else if (tipoSuscripcion.equalsIgnoreCase("BASIC")) {
			listaEnvio = sp.getPeriodicos().subList(0, sp.getPeriodicos().size()/2);
		}else if (tipoSuscripcion.equalsIgnoreCase("premium")) {
			listaEnvio = sp.getPeriodicos();
		}
		
		return listaEnvio;
	}
}
