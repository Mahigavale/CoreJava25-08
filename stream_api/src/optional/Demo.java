package optional;

import java.util.UUID;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Car car=new Car();
		 
		 Car car2=new Car();
		 System.out.println(car.getid());
		 System.out.println(car2.getid());
	}

}


class Car
{
	UUID uuid=UUID.randomUUID();
	
	public String getid()
	{
		return  this.uuid+" ";
	}
}