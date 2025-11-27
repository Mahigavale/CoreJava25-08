package contract;

import java.util.Objects;

public class Important_contract {

	public static void main(String[] args) {
		
		/**
		 *  obj1, obj2 => True => obj1.equals(obj2);
		 *  obj1.hashcode()==obj2.hashcode()
		 */

		
		 Car one=new Car(2,"Maruti");
		 Car two=new Car(3,"Maruti");
		 
		 System.out.println(one.equals(two));
		 
		 
		 System.out.println(one.hashCode());
		 System.out.println(two.hashCode());
	}

}


class Car
{
	int id;
	String name;
	
	public Car(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int hashCode()
	{
		return 100;
	}
	
	public boolean equals(Object obj)
	{
		Car car=(Car)obj;
		
		return this.id==car.id && this.name.equals(car.name);
	}
}
