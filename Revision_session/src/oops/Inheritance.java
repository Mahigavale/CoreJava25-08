package oops;

public class Inheritance {

	
	public static void main(String args[])
	{
		
		Mustang mustang=new Mustang();
		
		
		mustang.start();
		mustang.stop();
		
		mustang.fire();
	}
}

//IS-A , HAS-A


//One class will acquire the property of another class.



//Base/parent/super
class  Car
{
	public void start()
	{
		System.out.println("car is started....");
	}
	
	public void stop ()
	{
		System.out.println("car is stopped...");
	}
	
	
}

//child/derived/subclass
//Mustang IS-A Car
class Mustang extends Car
{
	public void fire()
	{
		System.out.println("ENgine has started to ignite....");
	}
}