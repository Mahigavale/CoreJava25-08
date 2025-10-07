package constructors;

public class This_2 {

	public static void main(String[] args) {
		
		Demo d=new Demo(12);
	}
}


class Demo
{
	
	//4-5-3-1-2
	
	//this. => instance variables 
	// this() => Constructor this=> Demo => this() => Demo()
	public Demo()
	{	this(1,2);
		
		System.out.println("One");	
	}
	
	public Demo(int i)
	{
		
		this();
		System.out.println("Two");
	}
	public Demo(int j,int i)
	{     this(1.0);
		System.out.println("three");
	}
	
	public Demo(float f)
	{
		System.out.println("FOur");
	}
	
	public Demo(double d)
	{   this(1.0f);
		System.out.println("five");
	}
}