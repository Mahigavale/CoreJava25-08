package polymorphism;

public class Eighth {

	public static void main(String[] args) {
	
		
		Base b=new Child1();
		
		b.Add(12, 23);

	}

}


class Base
{
	//private
	//default
	//protected 
	//public 
	/**
	 * 
	 * You can change the access modifier in the child class.
	 * provided that it is  same or less secure than the parent class
	 * access modifier.
	 *
	 */
	
	 public void Add(int i, int j)
	{
		System.out.println(i+j);
	}
}
class Child1 extends Base{
	
	public void Add(int i, int j)
	{
		 System.out.println("The overridden method");
		 System.out.println(i+j+" child1");
	}
}