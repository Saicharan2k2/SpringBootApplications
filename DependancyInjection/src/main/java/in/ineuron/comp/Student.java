package in.ineuron.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	static {
		System.out.println("Student.class file is loading..");
	}
	
	public Student() {
		System.out.println("Student object is instantiated..");
	}

	@Autowired(required=true)
	@Qualifier("java")
	private ICourse course;
	public void prepare(String exam) {
		System.out.println("Student.prepare()\n");
		System.out.println("Course choosen is ::"+course.getClass().getName());
		System.out.println("Course content ::"+course.CourseContent());
		System.out.println("Course price is ::"+course.price());
		
		
	}
	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}

}
