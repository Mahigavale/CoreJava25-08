package polymorphism;

public class Fourth {

	public static void main(String[] args) {
		
	Human human=new Man();
		/**
		 * human
		 * Polymorphic Object.
		 */
		
	 A a=human.show();
	 A a1=new C();
	 
		
	
	}

}

class Human
{
	String name="Human";
  	public A show()
	
	{
		System.out.println("This is the show method !");
		return new A();
	}
	
	public Human()
	{
		System.out.println("A");
	}
}

//Man IS-A Human
class Man extends Human
{
	
	public Man()
	{ 
		super();
		System.out.println("B");
	}
	
	public C show()
	{
		
		
		System.out.println("hello");
		return new C();
		//return 1;
	}
	
	public int show(int i)
	{
		return i;
	}
	
	public void run()
	{
		System.out.println("Man is running......");
	}
}


class A
{
	
}
class B extends A
{
	
	//B IS-A A
	//A a=new B();
}
class C extends B
{
	String name="Jumbo";
	
	public C()
	{
		System.out.println("This C is call");
	}
}

class Z
{
	
}