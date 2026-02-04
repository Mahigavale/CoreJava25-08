package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Fifth {

	public static void main(String[] args) throws Exception{
		
		       Class<?> cs=Student_Info.class;
		       
		        Constructor<?> con=cs.getDeclaredConstructor(String.class);
		        
		                con.setAccessible(true);
		         Student_Info st=(Student_Info)con.newInstance("Alan");
		         
		       Field fcity=cs.getDeclaredField("city");
		       
		       fcity.setAccessible(true);
		       fcity.set(st, "Pune");
		       
		       Method m=cs.getDeclaredMethod("getname",String.class);
		       
		       m.setAccessible(true);
		       System.out.println( m.invoke(st,"Hippa Huyya"));
		     
		       
		    
	}

}
class Student_Info
{
	private String name;
	
	private  String city;
	private Student_Info(String name)
	{
		System.out.println("Object created.....");
		this.name=name;
	}
	
	
	
	private String getname(String arr)
	{
		return this.name+" ::"+this.city+arr;
	}
}