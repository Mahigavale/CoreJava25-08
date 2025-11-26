package contract;

public class Second {

	public static void main(String[] args) {
		// .equals() => memory reference. => default behaviour.
		
		
		Student st=new Student(1,"ABC");
		Student st2=new Student(2,"ABC");
		
		
		
		System.out.println(st.equals(st2));
		

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
	
	
	public boolean equals(Object obj)
	{
		  Student stud=(Student)obj;
		  
		  
		  return this.id==stud.id && this.name.equals(stud.name);
	}
	
	
}

