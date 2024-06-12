package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value ="java")
public class JavaCourse implements ICourse {
	
	static {
		System.out.println("JavaCourse.class file is loading..");
	}

	public JavaCourse() {
		System.out.println("JavaCourse is instantiated..");
	}
	@Override
	public String CourseContent() {
		// TODO Auto-generated method stub
		return "1.Java SE\n 2.J2SE \n 3.Spring Framework\n 4.Microservices architecture\n 5.Rest APIs.....";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
