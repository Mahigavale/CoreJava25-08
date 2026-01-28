package optional;

import java.util.Optional;

public class Second {

	public static void main(String[] args) {
		Optional<String> ops=Optional.empty();
		Optional<String> ops2=Optional.ofNullable("nu");
		
		System.out.println(ops2.isPresent());
		System.out.println(ops.isPresent());

	}

}
