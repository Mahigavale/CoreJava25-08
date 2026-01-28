package optional;

import java.util.Optional;

public class Third {

	public static void main(String[] args) {
		 
		
		Optional<String> ops=Optional.ofNullable("nu");
		
		System.out.println(ops.isPresent());
		System.out.println(ops);
		ops.ifPresent((i)->{System.out.println(i.toUpperCase());});
		
		ops.ifPresentOrElse(System.out::println, ()->{System.out.println("Nhi bhetli re value!!!!");});

	}

}
