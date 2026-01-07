package functional_interfaces;

import java.util.function.Predicate;

public class Logical_1 {

	public static void main(String[] args) {
		/**
		 *  starts from 1
		 *  >100
		 */
		
		Predicate<Integer> pred=(i)->{
			System.out.println("A");
			return i.toString().startsWith("1");
		};
		Predicate<Integer> p2=(i)->{
			System.out.println("B");
			return i>100;};
		
		          Predicate<Integer> p3=pred.and(p2);
		          
		       Predicate<Integer>p4=p3.negate();
		       
		      // System.out.println(p4.test(221));
		       
		       
//		      Predicate<String> p=Predicate.isEqual("hello");
//		      
//		      System.out.println(p.test("hello1"));
		       
		       
		  Predicate<Integer>p=Predicate.not((i)->{return i>10;});
		  
		          
		          
		         System.out.println(p.test(5));
		           
	}

}
