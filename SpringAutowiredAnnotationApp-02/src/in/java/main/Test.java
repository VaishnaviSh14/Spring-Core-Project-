package in.java.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.java.bean.Flipkart;
import in.java.config.AnnotationConfig;


public class Test {

	public static void main(String[] args) {
		
		//Starting the container and informing the configuration file to scan the spring-bean
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		Flipkart flipkart = applicationContext.getBean(Flipkart.class);
		System.out.println(flipkart);
		
		String status = flipkart.shopping(new String[] {"Fossil","Max","Puma"},new float[] {34556.0f,2500.0f,768.0f});
		System.out.println(status);

		//closing the container
		((AbstractApplicationContext) applicationContext).close();
		

		
	}

}