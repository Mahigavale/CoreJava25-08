package demo;

public class Method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike pulsar=new Bike();
		
		pulsar.price=400.78;
		Bike yamaha=new Bike();
		yamaha.price=1000.67;
		yamaha.servicing= new int[] {1,2,3,4};
		
		pulsar.start();
		pulsar.servicing= new int[] {5,6,7,8};
		System.out.println("pulsar:"+pulsar.giveprice());
		yamaha.start();
		System.out.println("yamaha:"+yamaha.giveprice());

		
		
		
		
		System.out.println(pulsar.returnarray());
		
		for(int i=0;i<pulsar.returnarray().length;i++)
		{
		
			System.out.println("Pulsar serv:"+pulsar.returnarray()[i]);
		}
		
		System.out.println(yamaha.returnarray());
		for(int i=0;i<yamaha.returnarray().length;i++)
		{
			System.out.println("yamaha serv:"+yamaha.returnarray()[i]);
		}
	}

}

class Bike
{
	double price;
	String name;
	
	int[] servicing;
	public void start()
	{
		System.out.println("bike is starting...");
		
	}
	
	public void stop()
	{
		
	}
	
	
	public int giveprice()
	{
		return (int)price;
		//explicit casting.
	}
	
	public int[] returnarray()
	{
		return servicing;
	}
}