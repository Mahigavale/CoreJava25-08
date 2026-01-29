package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Fourth {

	public static void main(String[] args) throws Exception {
		
		
		     Class<?> cs=Class.forName("reflection.Actor");
		     Constructor<?> cons=cs.getDeclaredConstructor();
		     cons.setAccessible(true);
	         Actor ac=(Actor)cons.newInstance();
	         
	         
	         
	      Field[]  fields=cs.getDeclaredFields();
	      
	      for(Field f:fields)
	      {
	    	  System.out.println(f);
	      }
		     
	      
	      Field f=cs.getDeclaredField("salary");
	      Field f2=cs.getDeclaredField("name");
	      
	      f2.set(ac, "Akashya kumari");
	      
	      f.setAccessible(true);
	      
	      f.setDouble(ac, 9090);
	      System.out.println(f.getDouble(ac));
	      System.out.println(f2.get(ac));
	      
	      
	}

}


class Actor
{
	private double salary;
	public String name;
	
	private Actor()
	{
		//this.salary=salary;
		System.out.println("Object Created...");
	}
}