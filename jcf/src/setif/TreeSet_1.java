package setif;

import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) {
	
		
		Student one=new Student(34,"ABcdf");
		
		Student two=new Student(44,"cdesd");
		
		TreeSet<Student> tree=new TreeSet<Student>();
		
		tree.add(one);
		tree.add(two);
	
		
		
		
		System.out.println(tree);
		
		
		//Comparable
	
	}

}
/**
 * Comparable<T>  also known as The Natural Sorting.
 * it is used to compare two Objects of the same class.
 * by our given logic.
 * 
 */
class Student  implements Comparable<Student>
{
	int marks ;
	String name;
	
	public Student(int marks, String name)
	{
		this.marks=marks;
		this.name=name;
	}
	
	public String toString()
	{
		return this.name+" "+this.marks;
	}

	@Override
	public int compareTo(Student o) {
		
		System.out.println("calling the comparable to decide the position");
		//0 => same
		// 1  1>2
		//-1 1<2
		return    o.name.compareTo(this.name);
	}
}
