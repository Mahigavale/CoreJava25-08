package setif;

import java.util.TreeSet;
import java.util.Vector;

public class Comparable_demo {

	public static void main(String[] args) {
		
		Student_1 first=new Student_1(94,"JOhn");
		Student_1 second=new Student_1(93,"Peter");
		Student_1 third=new Student_1(87,"Gold");
		Student_1 fourth=new Student_1(99,"Jolly");
		Student_1 fifth=new Student_1(93,"Aasha");
		
		TreeSet<Student_1> set=new TreeSet<Student_1>();
		
		set.add(first);   //94
		set.add(second);  //93
		set.add(third);   //87
		set.add(fifth);
		set.add(fourth);  //99
		System.out.println(set);
		
		
		
		
	}
}

class Student_1 implements Comparable<Student_1>
{
	int marks;
	String name;
	
	public Student_1(int marks, String name)
	{
		this.marks=marks;
		this.name=name;
	}
	
	public String toString()
	{
		return this.marks+" "+this.name;
	}

	@Override
	public int compareTo(Student_1 o) {
		
		System.out.println("Teeset calling the compareTo to decide the order...");
		return Integer.compare(o.marks, this.marks);
		
		
		
	}
}