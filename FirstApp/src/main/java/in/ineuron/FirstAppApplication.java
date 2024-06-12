package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.ineuron.comp.WishMessage;

@SpringBootApplication
public class FirstAppApplication {
	
	static {
		System.out.println("FirstAppApplication.class file is loading..");
	}
	
	public FirstAppApplication() {
		System.out.println("FirstAppApplication object is instantiated..");
	}
	
	
	@Bean
	public LocalDateTime createObj() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(FirstAppApplication.class, args);
		WishMessage wmg=applicationContext.getBean(WishMessage.class);
		System.out.println("\n"+applicationContext.getClass().getName());
		System.out.println("\n"+wmg);
		String msg=wmg.greetUser("Sai Charan");
		System.out.println("\n"+msg);
		applicationContext.close();
	}
}
