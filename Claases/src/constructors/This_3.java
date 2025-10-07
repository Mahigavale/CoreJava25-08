package constructors;

public class This_3 {

	public static void main(String[] args) {

		Car car=new Car();
		
		 car.setId(100);
		 
		 car.setName("Jp morgan");
		 int res=car.getId();
		 String car_name=car.getName();
		 
		 System.out.println(res+" "+ car_name);
		 
		
	}
}

class Car
{ 
	/**
	 * local, instance, static, instance m, static m,
	 * final, static and final, constructor
	 * Setter and getter methods.
	 */
	int id;
	String name;
	
	/**
	 * Setter Injection => when you use the setters and getters to set the values of the instance variables.
	 * 
	 * Constructor Injection=> =++====== use the constructor => IV.
	 */
	
	public Car()
	{
		
	}
	
	public void setId( int id)
	{
		this.id=id;
		
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
}
