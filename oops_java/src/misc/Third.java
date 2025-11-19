package misc;

public class Third {

	public static void main(String[] args) {
		
		
		Animal animal=new Animal();
		
		animal.id=12;
		Animal animal2=new Animal();
		animal2.id=34;
	
		
		/**
		 * toString() => Object class.
		 */
		System.out.println(animal);
		
		
		System.out.println(animal2);
		
	 System.out.println(	Animal.takeip("aBC"));
	 System.out.println(	Animal.takeip(animal));
	 
	 Animal.takeip(12);
	 Animal.takeip(new int[] {1,2,4});
	}

}

class Animal extends Object
{
	int id;
	public String toString()
	{
		return "[ID:"+this.id+"]";
	}
	
	
	 static public Object takeip(Object o)
	{
		return o;
	}
}