package core;

public class Second {

	public static void main(String[] args) {
		
		
		Display dis=new Display();
		
		dis.setId(99);
		dis.setName("Biscuits");
		System.out.println(dis.id);
		System.out.println(dis.name);
	}
}

class Display
{
	
	int id;
	String name;
	
	/**
	 * Intialize the instance variables.
	 */
	
	/**
	 * Constructor Injection.
	 * @param id
	 * @param name
	 */
	
	public void setId(int id)
	{
		if(id>100)
		{
			this.id=id;
		}
		else
		{
			this.id=10;
		}
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	
}

