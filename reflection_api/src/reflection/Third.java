package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Third {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 
		 Class<?> cs=Class.forName("reflection.Employee");
		 
		 
		Field[] fields=cs.getDeclaredFields();
		
		
		
		Constructor<?> cs3=cs.getDeclaredConstructor(double.class);
		cs3.setAccessible(true);
		
	 Employee emp=(Employee)cs3.newInstance(8989.90);
		
		for(Field f:fields)
		{
			System.out.println(f);
			
		}
		   Field sal=cs.getDeclaredField("salary");
		    Field email=cs.getDeclaredField("email");
		   
		   System.out.println("***********");
		   System.out.println(sal);
		   
		   sal.setAccessible(true);
		   
		   email.set(emp, "maheshgavale07@gmail.com");
		//   sal.setDouble(emp, 0);
		   System.out.println(sal.getDouble(emp));
		   
		   System.out.println(email.get(emp));
		   
		  		   
	}
}

class Employee
{
	private double salary;
	public String name;
	public String email;
	
	
	private Employee (double  salary)
	{
		System.out.println("OBJEct created...");
		this.salary=salary;
	}
}