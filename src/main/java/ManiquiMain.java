

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojoManiqui.Camisa;
import pojoManiqui.Maniqui;
import pojoManiqui.Pantalon;
import pojoManiqui.Tienda;


public class ManiquiMain {

	public static void main(String args[]){
		
	
		ApplicationContext context=new ClassPathXmlApplicationContext("Maniqui.xml");
		
		//Pantalon pant1 =(Pantalon)context.getBean("pantalon1");
		//Pantalon pant2 =(Pantalon)context.getBean("pantalon2");
		//Camisa cami1 = (Camisa)context.getBean("camisa1");
		//Maniqui mani1 = (Maniqui)context.getBean("maniqui1");
		//Maniqui mani2 = (Maniqui)context.getBean("maniqui2");
		Tienda tienda1 = (Tienda)context.getBean("tienda");
		
		//System.out.println(cami1);
		//System.out.println(pant1);
		//System.out.println(mani1);
		//System.out.println(mani2);
		//System.out.println(tienda1);
		Map<String,Maniqui> maniquies=tienda1.getManiquies();
		
		for (Maniqui maniqui : maniquies.values()) {
			System.out.println(maniqui);
			
		}
		
	}
	
}
