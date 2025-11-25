package error_handling;

import java.util.ArrayList;
import java.util.List;

public class First {

	public static void main(String[] args) {

		List<Student> list=new ArrayList<Student>();
		
		 int id=1;
		 String name="Ajju";
		 try {
		while(true)
		{
			list.add(new Student(id, name));
		}
		 }
		catch(OutOfMemoryError er)
		{
			System.out.println(er.getMessage());
		}
		 finally
		 {
			 System.out.println("hello");
		 }
	}

}

class Student
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
