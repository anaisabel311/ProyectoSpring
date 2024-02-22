package herenciaGenero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GeneroMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("HerenciaGenero.xml");
		
		
		BeanPersonaHerencia p1 =(BeanPersonaHerencia)context.getBean("persona1");
		System.out.println(p1);
		BeanPersonaHerencia p2 =(BeanPersonaHerencia)context.getBean("persona2");
		System.out.println(p2);
		
	}

}
