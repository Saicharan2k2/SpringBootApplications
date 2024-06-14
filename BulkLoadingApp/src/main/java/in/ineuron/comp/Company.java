package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.info")
public class Company {
	
	private String location;
	private String name;
	private Integer size;
	static {
		System.out.println("Company.class file is loading..");
	}
	public Company() {
		System.out.println("Company object is instantiated..");
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Company [location=" + location + ", name=" + name + ", size=" + size + "]";
	}

	
}
