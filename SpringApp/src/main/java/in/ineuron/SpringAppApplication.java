package in.ineuron;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.dao.IEmployeeDao;
import in.ineuron.model.Employee;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);
		System.out.println("no of beans :: "+Arrays.toString(context.getBeanDefinitionNames()));
		IEmployeeDao dao=context.getBean(IEmployeeDao.class);
		try{
			List<Employee> list = dao.findAllEmployees();
			list.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		((ConfigurableApplicationContext)context).close();
	}

}
