package misc;

public class First {

	public static void main(String[] args) {
	
		demo d=new demo();
		
		
	}
}

interface I_one
{
	 default void run()
	 {
		 System.out.println("from I_One");
	 }
}
interface I_two extends I_one
{
  default void run(int i, int j)
  {
	 System.out.println("I_two");
  }
  
  default void run()
  {
	  System.out.println("zero");
  }
}

class demo implements  I_two
{
 
	
	
	
}