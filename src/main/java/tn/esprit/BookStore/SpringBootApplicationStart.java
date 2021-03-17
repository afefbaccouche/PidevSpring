package tn.esprit.BookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan("tn.esprit")
public class SpringBootApplicationStart {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootApplicationStart.class, args);
 
	}

} 
 