package functional_interfaces;

import java.util.function.Consumer;

public class Consumer_1 {

	public static void main(String[] args) {
		
		Consumer<Integer> demo=(t)->{System.out.println(t*4);};
		
		 demo.accept(25);
	
	}
}
////
// class Cons_demo implements Consumer<Integer>{
//
//	
//	public void accept(Integer t) {
//		
//		System.out.println(t*3);
//	}
//	 
// }