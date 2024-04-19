package in.antony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.antony.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		PersonService ps = ctx.getBean(PersonService.class);
		
		//ps.savePerson();
		//ps.getPerson();
		ps.getPassport();
	}

}
