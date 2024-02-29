package Personabbdd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Personabbdd.PersonaEntity;
import Personabbdd.PersonaCommand;


public class PersonaMainApp {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonaCommand command=(PersonaCommand)context.getBean("command");
//		PersonaEntity persona = new PersonaEntity();
//		persona.setNombre("Juan");
//		persona.setApellidos("Díez Haruta");
//		persona.setDni("11111111");
//		persona.setTipoSuscripcion("basic");
//		
//		command.guardarPersona(persona);
		
//		usuario=new Usuario();
//		usuario.setUsuario("Alicia");
//		usuario.setContrasena("root");
//		command.guardarUsuario(usuario);
//		
		PersonaEntity usuario2=command.getPersona("Juan");
		System.out.println(usuario2);
		System.out.println(command.mostrarPrensa(usuario2.getTipoSuscripcion()));
//		System.out.println("Contrase�a de "+usuario.getUsuario()+" -> "+usuario.getContrasena());
//		System.out.println("Done.");
	}
}
