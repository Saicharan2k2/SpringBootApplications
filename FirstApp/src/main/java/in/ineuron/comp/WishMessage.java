package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessage {

	@Autowired(required = true)
	private LocalDateTime date;
	
	static {
		System.out.println("\nWishMessage.class file is loading..");
	}
	
	public WishMessage() {
		System.out.println("\nWishMessage object is instantiated..\n");
	}
	
	public String greetUser(String UserName) {
		if(date.getHour()<12)
			return "Good Morning "+UserName;
		else if(date.getHour()<16)
			return "Good Afternoon "+UserName;
		else if(date.getHour()<20)
			return "Good Evening "+UserName;
		else
			return "Good Night "+UserName;
		
	}
}
