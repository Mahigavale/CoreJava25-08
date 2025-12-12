package setif;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Fourth {

	public static void main(String[] args) {
		
		
		LocalDateTime date1=LocalDateTime.of(1999, 2, 21, 13, 13);	
		LocalDateTime date2=LocalDateTime.of(2007, 1, 26, 11, 11);
	
		Car mustang=new Car(34.67,"Ford-Mus",new LocalDateTime[] {date1,date2});
		
		Car mustang2=new Car(35.67,"Ford-Mus",new LocalDateTime[] {date1,date2});
		
		
	
		
		
	HashSet<Car> set=new HashSet<Car>();
	
	
	

	set.add(mustang);
	set.add(mustang2);
	
	
	System.out.println(set);

	
	//System.out.println(set.remove(new Car(34.67,"Ford-Mus",new LocalDateTime[] {date1,date2})));
	
	System.out.println(set);	
	
	
	
	for(Car car:set)
	{
		 System.out.println(car);
	}
			}
}

class Car
{
	double price;
	String name;
	LocalDateTime[] servicings;
	
	
	public Car(double price, String name,LocalDateTime[] servicings)
	{
		this.price=price;
		this.name=name;
		this.servicings=servicings;
	}
	
	public int hashCode()
	{
		System.out.println("Set Calling HashCode...before adding ");
		return (int)this.price+this.name.length();
	}
	
	public boolean equals(Object obj)
	{
		
		System.out.println("set calling .equals() after the hashCOde is same to determine the uniqueness...");
		Car car=(Car)obj;
		
		return this.name.equals(car.name)&& this.price==car.price;
		
	}


	public String toString()
	{
		
		StringBuffer s=new StringBuffer();
		for(LocalDateTime local:servicings)
		
		{
			s.append(local.toString()+" :");
		}
					
		
		return this.name+" "+this.price+" "+s;
	
	}
	
}
