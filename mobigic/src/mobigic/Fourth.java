package mobigic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

public class Fourth {

	public static void main(String[] args) {
		
  Id<Integer> id1=new demo<Integer>();
  Id<String> id2= new demo<String>();
  
  
  id1.add(23);
  
  id2.add("abc");
     
     System.out.println(id1.getClass().equals(id2.getClass()));
  
  System.out.println(id1.display());
  System.out.println(id2.display());
	}
}
 
 interface Id<E>
 {
	  E add( E e);
	  
	  E display();
 }
 
 class demo<E> implements Id<E>
 {
	  Object[] arr=new Object[1];

	@Override
	public E add(E e) {
		
		  
		  arr[0]=e;
		  
		  
		  return  e;
	}
	
	public E display ()
	{
		return   (E)arr[0].toString();
	}
	 
 }