package functional_interfaces;

import java.util.function.Supplier;

public class Supplier_1 {

	public static void main(String[] args) {
		/**
		 * 1)Predicate<T>=>Test(T t)=>Boolean.
		 * 2)Consumer<T>=>Accept(T t)=>Void.
		 * 3)Supplier<T>=>Get()=>T
		 * 4)Function<T,R>=>Apply(T t)=>R
		 */

		 Supplier<Double> otp=()->{return Math.random()*10000;};
		          
		     System.out.println(otp.get().intValue());
	}
}
