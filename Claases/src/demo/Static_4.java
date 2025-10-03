package demo;

public class Static_4 {

	public static void main(String[] args) {
		

		
		
		Tank arjun=new Tank();
		
	
		
		 arjun.price=1200;
		 arjun.display();
		 
		 
		 Tank Apache=new Tank();
		 Apache.price=4000;
		 Apache.display();
		
		
		 
		 Tank.run();
	}

}


class Tank
{
 	static String name="kjdlslxs*^";
	
	 int price=300;
	public void display()
	{
		System.out.println(name);
		System.out.println(price);
	}
	
	public static void run()
	{
		System.out.println(name);
	}
}