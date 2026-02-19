package copying;

public class copy_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company comp2=new Company();
		comp2.company_name="Honda";
		
		Car car=new Car();
		car.comp=comp2;
		car.name="City";
		car.price=80700.98;
		
		
		System.out.println(car.comp.company_name);
		Car car2=new Car(car);
		
		
		System.out.println(car.comp.company_name);
		System.out.println(car2.name);
		
		System.out.println("hello");
	}

}

class Car
{
	 String name;
	 double price;
	 Company comp;
	 
	 
	 public Car(Car car)
	 {
		 Car car2=new Car();
		//Company comp3=new Company();
		 car2.name=car.name;
		 car2.price=car.price;
		 car2.comp=new Company();
		 car2.comp.company_name=car.comp.company_name;
		// car2.comp=new Company();//name=null;
		
		// car2.comp=comp;
		// car2.comp.company_name=car.comp.company_name;
		 
		 
	 }
	 public Car()
	 {
		 
	 }
	 
}


class Company
{
	String company_name;
}