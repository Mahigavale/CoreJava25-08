package abstraction;

public class First {

	public static void main(String[] args) {
		
	Animal animal=new Elephant();
	
	Animal animal2=new Cheetah();
	
	animal.eat("grass");
	animal2.eat("carniveroes");

	}

}


abstract class Animal
{
	private String  name="skd";
	public void run()
	{
		System.out.println("run fast...");
		
	}
	
	 abstract  void eat(String str);  //Incomplete method.
	 
	 // Private abstract methods are not possible in abstract class.
	 public Animal()
	 {
		 System.out.println("hello");
	 }
}

  class Elephant extends Animal
{
	 void eat(String str)
	 {
		 System.out.println("Elephant is eating :"+str);
	 }
//	 public void run()
//		{
//			System.out.println("run fast...");
//		}
} 
 
 
 class Cheetah extends Animal
 {

	@Override
	void eat(String str) {
	 System.out.println("Chettah is eating:"+str);
	}
	 
 }