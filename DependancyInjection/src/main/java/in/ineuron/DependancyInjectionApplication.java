package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Student;

@SpringBootApplication
public class DependancyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DependancyInjectionApplication.class, args);
		Student st=applicationContext.getBean("student",Student.class);
		System.out.println(st);
		st.prepare("Java");
		applicationContext.close();
	}

}
