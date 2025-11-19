package abstraction;

public class Second {

	public static void main(String[] args) {

		
		Ianimal animal=new Tiger();
		
		animal.run("HII");
		animal.eat("HEllo");
		animal.sleep();
	}
}

interface Ianimal
{
	
	/**
	 * FULL ABSTRACTION.
	 */
	/**
	 * Public and abstract
	 * @param str
	 */
	 void eat(String str);
	 
	 void run(String str);
	 
	public default void sleep()
	 {
		 System.out.println("default implementation");
	 }
	 
	
	public static void hunt()
	{
		
	}
	 
	
}

class Tiger implements Ianimal
{
	public void eat(String str)
	{
		System.out.println("from tiger :"+str);
	}
	
	public void run(String str)
	{
	System.out.println("from tiger :"+str);
	}
	
//	 public void sleep()
//	 {
//		System.out.println("I am sleeping in the woods...."); 
//	 }
}

class Lion implements Ianimal
{

	@Override
	public void eat(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(String str) {
		// TODO Auto-generated method stub
		
	}
	
}