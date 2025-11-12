package misc;

public class Second {

	public static void main(String[] args) {
		
 I_A c=new C();
 c.run();


 
	}
	
}

interface I_A
{
	 default  void run()
	{
		System.out.println("A");
	}
	 
	 static int demo()
	 {
		 return 1;
	 }
}
interface I_D 
{
	 default  void  run()
	 {
		 System.out.println("B");
		
	 }
	 
	 static void demo()
	 {
		System.out.println("from second interface...");
	 }
}

class C implements  I_D,I_A
{
	 
	
	 public  void run()
	  {
		   I_A.super.run();
		   I_D.super.run();
		   System.out.println("C");
	  }
	 
	 public  void demo()
	 {
		 System.out.println("hello");
	 }
}