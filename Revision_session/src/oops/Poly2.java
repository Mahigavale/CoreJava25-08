package oops;

public class Poly2 {

	public static void main(String[] args) {
		
		
		//dynamic method dispatch
		
		Parent parent=new Child();
		
		
		parent.read();
		
		
	

	}
}

//method overriding / dynamic polymorphism.

class Parent
{
	public void read()
	{
		System.out.println("I am reading the old novels.");
	}
}
 
class Child extends Parent
{
	
	public void read()
	{
		System.out.println("I am reading the superman comic....");
	}
}
