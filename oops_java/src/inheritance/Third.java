package inheritance;

public class Third {

	public static void main(String[] args) {
		

		Elephant jumbo=new Elephant();
		
		jumbo.run();
		
		Gajodhar gaj=new Gajodhar();
		
		gaj.run();
		gaj.sleep();
		
		
		Jumbo j=new Jumbo();
		
		System.out.println(j.colour);
		j.sleep();
		j.run();
		
		
		Animal animal=new Animal();
		
		System.out.println(animal.colo);
		
	}

}

class Animal
{
	
	public void run()
	{
		System.out.println("I am running...");
	}
}


class Elephant extends Animal
{
	/**
	 * Elephant IS-A animal
	 * Single level inheritance.
	 */
	
	public void sleep()
	{
		System.out.println("elephant is sleeping....");
	}
}
class Gajodhar extends Elephant
{
	/**
	 * Gajodhar IS-A Elephant
	 */
	
	final String colour="Black";
	
}
class Jumbo extends Gajodhar
{
	
}