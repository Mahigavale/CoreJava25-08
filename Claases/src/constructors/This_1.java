package constructors;

public class This_1 {

	public static void main (String args[])
	{
		
		
		
		Animal animal=new Animal(100,"elephant","Pune");
		
		
		Animal an2=new Animal(1,"a","p");
		
		
		
		animal.displaycity();
	}
}


class Animal
{
	 
	
	int id;
	String name;
	String city;
	
	public Animal(int id, String name, String city)
	{
		
		
		
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	
	public void displaycity()
	{
		
		System.out.println(this.city);
	}
	
}