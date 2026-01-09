package demo;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
	
		Function<String,StringBuffer>fun=(t)->{return new StringBuffer(t);};
	 
	System.out.println(fun.apply("Hello").reverse());
	}

}
