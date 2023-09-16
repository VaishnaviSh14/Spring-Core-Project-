package in.java.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages ="in.java.bean")
public class AnnotationConfig {
	
	static {
		System.out.println("AnnotationConfig.class file is loading...");
	}
	
	@Bean
	public Date dataObj() {
		return new java.util.Date();
	}
	

}