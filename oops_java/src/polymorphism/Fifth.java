package polymorphism;

public class Fifth {

	public static void main(String[] args) {
		
		
		Truck as=new AshokLeyland();

		
		as.display();
		
		
		Truck.demo();
		
		
		AshokLeyland as2=new AshokLeyland();
		
	AshokLeyland.demo();
		
		
		
	}

}

class Truck
{
	
	public int  run()
	{
		return 100;
	}
	
	public final void display()
	{
		System.out.println("this is the display method of the Truck");
	}
	
	
	public static void demo()
	{
		System.out.println("this is the demo method of the Truck");
	}
}
class AshokLeyland extends Truck
{
	public int run()
	{
		return 200;
	}
	
	public  void demo(int i)
	{
		System.out.println("instance from Ashokleyland..");
	}
	
}