package second;

import first.Elephant;
public class Elephandemo {

	public static void main(String[] args) {
		
//		
//		Second second=new Second();
//		
//		second.show3();
		
		
		Elephant elephant=new Elephant();
		
		//System.out.println(elephant.);
		
	}

	
	
}

class Second extends Elephant
{
	
	
	public void show3()
	{
		System.out.println(this.name);
		this.show();
	}
}