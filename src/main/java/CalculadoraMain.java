import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojoLogGetafe.Calculadora;
import pojoLogGetafe.LogGetafe;

public class CalculadoraMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanLogGetafe.xml");

		Calculadora suma = (Calculadora) context.getBean("Calculadora");
		suma.sumar(suma.getOpe1(), suma.getOpe2());

		
		
	
}
}