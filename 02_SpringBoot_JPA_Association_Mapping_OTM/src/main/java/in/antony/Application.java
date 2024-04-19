package in.antony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.antony.entity.Employee;
import in.antony.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeService bean = context.getBean(EmployeeService.class);
		//bean.saveEmployee();
		//bean.getEmployee();
		//bean.getAddress();
		bean.deleteEmployee();
	}

}
