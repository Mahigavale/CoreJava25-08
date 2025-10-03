package demo;

public class First {

	public static void main(String[] args) {
		 int age=23;
		 
		 
		 char chars='A';
   
		// System.out.println(age);
		 
		 // Object
		 // OOPS=> Objects.
		 
		// System.out.println(Second.age);
		  
		 /**
		  * @Class => non -primitive data type.
		  * 
		  * class=> Second
		  * =>  Second saheel;   int age;
		  */
		 
		 
//		 System.out.println("26   :::"+new Second().hashCode());
//		 
//		 
//		 System.out.println("27   :::"+new Second().hashCode());
//		 
		 
		Second saheel=new Second();
	
		
		saheel.age=23;
		saheel.chars='C';

		 
		System.out.println(saheel.age);
		
		System.out.println(saheel.chars);
		
		
		System.out.println("**************");
		Second sameer=new Second();
		
		sameer.age=67;
		sameer.chars='A';
		System.out.println(sameer.age);
		System.out.println(sameer.chars);
	
	}

}

class Second
{
	int age=56;
	
	char chars='B';
}

