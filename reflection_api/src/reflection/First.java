package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class First {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		     Class<?> cl=Class.forName("reflection.Student");
		     
		      Constructor<?>[] cs=cl.getDeclaredConstructors();
		      
		      for(Constructor<?> c:cs)
		      {
		    	  System.out.println("_______________________________________");
		    	   System.out.println(c);
		    	   System.out.println("******");
		    	   System.out.println(c.getName());
		    	   System.out.println(c.getParameterCount());
		           Class<?>[]	 pm=  c.getParameterTypes();
		     
		     for(Class<?> p:pm)
		     {
		    	 System.out.println(p); 
		     }
		     System.out.println("_______________________________________");
		      }
		     
		    
		      
		      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		      
		         Constructor<?> cs2=cl.getDeclaredConstructor(String.class);
		         
		         System.out.println(cs2);

		         
		         cs2.setAccessible(true);
		         
		     Student st=(Student)cs2.newInstance("Welcome");
		     System.out.println(st.s);
	}
}

class Student
{
	 String s;
	private Student(String s)
	{ 
		this.s=s;
		System.out.println("Object created using the private constructor....");
	}
	
//	public Student(int i)
//	{
//		
//	}
//	
//	public Student(int i, String j)
//	{
//		
//	}
}