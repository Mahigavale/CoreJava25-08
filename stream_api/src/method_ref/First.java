package method_ref;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		String greet="Hello, ";
	//	System.out.println(greet.concat("pune"));
		// return "pune".length()=>String
		List.of("pune","mumbai","latur","solapur","kolhapur","tuljapur")
		.stream()
		.map(greet::concat)
		.map(String::toUpperCase)
		.forEach((i)->{System.out.println(i);});
		
	}
}
