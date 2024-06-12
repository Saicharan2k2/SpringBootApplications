package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component(value = "python")
public class PythonCourse implements ICourse {
	
	static {
		System.out.println("PythonCourse.class file is loading..");
	}
	
	public PythonCourse() {
		System.out.println("PythonCourse object is instantiated..");
	}
	

	@Override
	public String CourseContent() {
		// TODO Auto-generated method stub
		return "1.Python Basics\n 2.Django \n3.Pandas\n4.Matplotlib.....";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 11000;
	}

}
