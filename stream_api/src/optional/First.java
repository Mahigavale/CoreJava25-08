package optional;

import java.util.Optional;

public class First {
	 
	public static void main(String[] args) {
		
		/** empty()=>Optional.empty
		 * .of(T)=> NULL NO 
		 * .ofNullable(T) => NULL YES
		 * .get()=> Instance method =>returns => T | NoSuchElementException
		 */
		
		       
		Optional<String> op=Optional.ofNullable("YES BANK");
		
		
		System.out.println(op.get());
		  
		  
	}
}
