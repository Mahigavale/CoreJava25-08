package optional;

import java.util.Optional;

public class Fourth {

	public static void main(String[] args) throws Exception {
		
		Optional<String> ops=Optional.ofNullable(null);
		
		
		 System.out.println(ops.or(()->(Optional.of("no value present"))));
		 
		 
		 
	 System.out.println(ops.orElse("demo"));
	 
	 
	 System.out.println(ops.orElseGet(()->("NO VALUE RE")));
		
		
	 	//ops.orElseThrow(); =>no such element Exception
		
		 System.out.println(ops.orElseThrow(()->(new Exception("NO value re"))));
		
		
	}

}
