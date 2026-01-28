package optional;

import java.util.Optional;

public class Fifth {

	public static void main(String[] args) {
		Optional<Integer> ops=Optional.ofNullable(23);
		
		// System.out.println(ops.filter((i)->(i>30)));
		
	
	
		
 System.out.println(ops.flatMap((i)->(Optional.of(i*2))).get());

	}

}
