package operations;

import java.util.List;

public class Eleventh {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		
		List.of("ancd","aabbd","yutroe","79*&(nskwp")
		.stream()
		.map(sb::append)
		.forEach((i)->{
			System.out.println(sb==i);
			System.out.println(sb);
		});

}
}