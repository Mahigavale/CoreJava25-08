package arrays_demos;

import java.util.UUID;

public class Java_Demo {

	public static void main(String[] args) {
		
		Demo_s demo=new Demo_s();
		
		System.out.println(demo.getvalue().hashCode());
		
		
	}
}


class Demo_s
{
	
	
	public UUID getvalue()
	{
		return UUID.randomUUID();
	}
}