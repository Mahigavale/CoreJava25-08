package functional_interfaces;

import java.util.function.Function;

public class Function_4 {

	public static void main(String[] args) {
		
		Function<String, Integer> fun=(i)->{return i.length();};
		
		Function<Integer, Double> fun2=(i)->{return i*5.0;};
		
//		System.out.println(fun.apply("null"));
//		System.out.println(fun2.apply(10)); 
		
		 Function<String,Double> fun3=fun.andThen(fun2);
		 
		 
		 System.out.println(fun3.apply("welcome"));

	}

}
