package stream_operations;

import java.util.stream.IntStream;

public class arr {

	public static void main(String[] args) {
		
		
		
	
		Child c=new Child();

		IntStream.rangeClosed(1, 100)
		.forEach(System.out::println);
	}

}
class Parent 
{
	public Parent(int i)
	{
		
	}
}
class Child extends Parent
{
	
}