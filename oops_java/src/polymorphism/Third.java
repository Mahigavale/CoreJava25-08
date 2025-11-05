package polymorphism;

public class Third {

	public static void main(String[] args) {

		Bl2 bl=new Bl2();
		
		
		bl.seat();
		bl.show();
		
		
	}
}


class Planet
{
	public String name="Aqua";
	public void show()
	{
		System.out.println("SHow method of Planet..");
	}
	
	public void seat()
	{
		System.out.println("seat method of the Planet");
	}
	
	public Planet()
	{
		System.out.println("The constructor of the planet...");
	}
	
	public Planet(int i)
	{
		System.out.println("The param wala of the  planet");
	}
}

class Blue extends Planet
{
	/**
	 * Blue IS-A Planet.
	 */
	
  public String name="demo";
	public Blue()
	{
		super();
		System.out.println("The constructor of the blue class.");
	}
	
	public void seat()
	{
		System.out.println("This is the Seat of the Blue");
	}
	
//	public void show()
//	{
//		System.out.println("The show from the blue");
//	}
}

class Bl2 extends Blue
{
	
	
	//name, seat(), show(),seat(int i);
	
//	public int  seat()
//	{
//		System.out.println("The swat method of the Bl2");
//		return 1;
//	}
	
	public int seat(int i)
	{
		return 34;
	}
	public Bl2()
	{ super();
		
	System.out.println("the constructor of the bl2");
	}
}