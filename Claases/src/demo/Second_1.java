package demo;

public class Second_1 {

	public static void main(String[] args) {
		
		/**
		 * local variable,
		 * instance variable,
		 * static variable.
		 */

		
		
		
		Aeroplane boeing=new Aeroplane();
		
		
		
		boeing.fly();
		
		System.out.println(boeing.price);
		
		
		
		Aeroplane Air_Ind=new Aeroplane();
		
		Air_Ind.name="77av";
		Air_Ind.price=434534.56;
		Air_Ind.fly();
	}

}


class Aeroplane
{
	
	public void fly()
	{
	
		String s="dandandnandna";
		System.out.println("no . of  pilots are:"+s);
		System.out.println("aeroplane has started....");
	}
	
	public void land()
	{
		System.out.println(name);
		System.out.println("landing....");
	}
	
	
	String name; //null
	double price; //0.0
	
	
}