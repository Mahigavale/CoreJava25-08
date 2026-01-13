package stream_operations;

import java.util.List;
import java.util.function.Predicate;

public class Second {

	public static void main(String[] args) {

		Student first=new Student(1,"Yuvraj");
		Student second=new Student(2,"Aditya");
		Student third=new Student(3,"Pooja");
		
		List<Student> list2=List.of(first,second,third);

//		List<Integer> list=List.of(11,23,24,56,22,34,78,89);
//		
//		    list.stream().filter((i)->{return i%2==0;})
//		    .forEach((jabba)->{System.out.println(jabba);});
		
		
		Predicate<Student> pred=(s)->{return s.name.length()>5;};
		
		list2.stream().filter(pred)
		.forEach((s)->{
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println("****************");
		});
		

	}

}

class Student
{
	int id;
	String name;
	
	public Student(int id,String name )
	{
		this.id=id;
		this.name=name;
	}
	
	
}