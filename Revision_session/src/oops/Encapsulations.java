package oops;

public class Encapsulations {

	public static void main(String args[])
	{
		
		Demo demo=new Demo();
		
		demo.Applyname("ABCD");
		
		
		System.out.println(demo.getPrivate());
		
	}
}


class Demo
{
	// Private
	 private int i;
	 private String name; //ABC
	
	
	public void display()
	{
		
	}
	
	public void Applyname(String name)
	{
		
		if(name.length()>=4) {
		this.name=name;
		}
		else
		{
			this.name=null;
		}
	}
	
	public String getPrivate()
	{
		return this.name;
	}
}