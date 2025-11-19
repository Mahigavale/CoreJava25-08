package oops;

public class AccessModifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Public  =>*
		 * Protected => **
		 * Default/Package => ***
		 * Private =>****
		 */
		
		
		
	}

}

class Bag

{
	
	/**
	 * Public  =>*
	 * Protected => **
	 * Default/Package => ***
	 * Private =>****
	 */
	private  void run()
	{
		System.out.println("the run method of the Bag class.");
	}
}


class Gucci extends Bag
{
	 public  void run()
	  {
		  System.out.println("from the child class");
	  }
	/**
	 * you can change the access modifier of the parent method class/
	 * Only less secure.
	 */
}