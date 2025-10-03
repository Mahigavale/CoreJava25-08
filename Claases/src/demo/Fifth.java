package demo;

public class Fifth {

	public static void main(String[] args) {
	

		//int age=34;
		 Car hyundai=new Car();
		 
		 
		 hyundai.mileage=45;
		 hyundai.price=45;
		 
		 
		 Car skoda=new Car();
		 
		 skoda.mileage=45;
		 skoda.price=45;
		 
		 
		 System.out.println(hyundai.mileage);
		 System.out.println(skoda.mileage);
		 
		 System.out.println(skoda==hyundai);
		 
		
		 
		 Truck hyva=new Truck();
		 
		 hyva.tyres=14;
		 
		 System.out.println(hyva.tyres);
		
	}

}

class Car{
	int mileage;
	double price;
}

class Truck
{
	int tyres;
	
}