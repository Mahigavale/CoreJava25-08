package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Second {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		

           Class<?> cl=Class.forName("java.lang.String");
           
           Constructor<?>[] cs=cl.getDeclaredConstructors();
           
           System.out.println(cs.length);
           

           for(Constructor<?> c: cs)
           {
        	   System.out.println("_____________");
        	   System.out.println(c);
        	   System.out.println("_______________");
           }
           
        Constructor<?> cs3=cl.getDeclaredConstructor(char[].class);
        
        
              String s=(String)cs3.newInstance(new char[]{'a','b'});
              System.out.println(s.toUpperCase());

	}

}
