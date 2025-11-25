package contract;

import java.util.Arrays;
import java.util.Objects;

public class First {

	public static void main(String[] args) {

		
		Phone phone =new Phone();
		
		phone.id=12;
		phone.model="SMART";
		phone.price=567.90;
	
		Phone phone2=new Phone();
		phone2.id=12;
		phone2.model="SMART";
		phone2.price=566.90;
		
		
		System.out.println(phone.hashCode());
		System.out.println(phone2.hashCode());
	}
}


class Phone
{
	int id;
	String model;
	double price;
	
	
	public int hashCode()
	{
		return this.id+(int)this.price+this.model.hashCode();
	}
}