package abstraction;

public class First {

	public static void main(String[] args) {
		
	}
}



 abstract class Aeroplane
{
	
	//Abstract method.
	 public abstract String start(String password );
	 
	 public void stop()
	 {
		 System.out.println("I am stopping the aeroplane...");
	 }
	 public Aeroplane()
	 {
		 System.out.println("hello");
	 }
}
 
  abstract class Boeing extends Aeroplane
 {
	 
 }