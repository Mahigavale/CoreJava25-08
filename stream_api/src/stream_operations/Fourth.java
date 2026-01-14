package stream_operations;

import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		/**
		 * String=>Integer
		 */
		
		List.of("abc","abcd","xyx")
		.stream()
		.map((s)->{return new StringBuffer(s).reverse().toString();})
        .forEach((s)->{System.out.println(s);});		

		
	}

}
