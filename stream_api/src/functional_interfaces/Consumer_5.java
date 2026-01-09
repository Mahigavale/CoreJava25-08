package functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_5 {

	public static void main(String[] args) {
		
		Consumer<Integer> con=(i)->{System.out.println(i*2);};
		Consumer<Integer> con2=(i)->{System.out.println(i*5);};
		
		 Consumer<Integer>con3=con.andThen(con2);
		 
		
		 List.of(11,22,56,32,10).forEach(con3);
	
	}
}
