package copying;

public class Second {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student one =new Student();
		one.id=23;
		one.name="Ananda";
		
		      //Student two=one.clone();
		      
		       Student two=(Student) one.clone();
		
		      
		//two.id=24;
		
		System.out.println(one.id);
		System.out.println(two.id);
		System.out.println(one==two);
		System.out.println(one.equals(two));
		System.out.println(one.clone().equals(two));
	}

}


class Student implements Cloneable
{
	int id;
	String name;
	
	public Student()
	{
		System.out.println("called...");
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}