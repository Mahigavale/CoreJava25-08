package listif;

import java.util.ArrayList;
import java.util.List;

public class Sixth {

	public static void main(String[] args) {
		
		
		List<Student> list=new ArrayList<Student>();
		
		Student st=new Student();
		st.id=1;
		st.name="ABC";
		st.email="ABC@Gmail.com";
		
		Student st2=new Student();
		st2.id=2;
		st2.name="DEF";
		st2.email="DEF@Gmail.com";
		
		
		list.add(st2);
		list.add(st);
		
		Student st3=new Student();
		st3.id=3;
		st3.name="GHI";
		//st3.name="GHi@Gmail.com";
		
		System.out.println(list);
		
	 System.out.println("setting:"+list.set(0, st3));
		
		System.out.println(list);
		
	System.out.println(list.reversed());
		
	//s	System.out.println(list);
	}
}

class Student
{
	int id;
	String name;
	String email;
	
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
}