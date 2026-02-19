package copying;

public class Third {

	public static void main(String[] args) throws Exception {
		

		Bike bike=new Bike("SHINE",151);
		
		 bike.cc=120;
		 
		 System.out.println(bike.cc);
		 System.out.println(bike.name);
		 
		 System.out.println("****************************************");
		 Bike bike2=(Bike)bike.clone();
		 System.out.println(bike2.cc);
		 System.out.println(bike2.name);
	}

}

class Bike implements Cloneable
{
	String name;
	int cc;
	
	public Bike(String name, int cc) throws Exception
	{
		if(cc<125)
		{
			throw new Exception("not a real bike....!");
		}
		this.cc=cc;
		this.name=name;
		System.out.println("OBJECT CREATED...");
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}