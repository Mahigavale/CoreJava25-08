package operations;

import java.util.function.Function;
import java.util.function.Supplier;

public class Tenth {

	public static void main(String[] args) {

		Supplier<Animal> sup=Animal::new;
		System.out.println("not created Object!");
		sup.get();
		System.out.println("object created here!");
		
	
		Function<String, Animal> fun=Animal::new;
		
		   fun.apply("Hello");
	}
}
 
class Animal
{
	public Animal()
	{
		System.out.println("constrcutor called!");
	}
	
	public Animal (String s)
	{
		System.out.println("Constructor called with the String:"+s);
	}
}