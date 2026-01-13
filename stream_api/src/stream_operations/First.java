package stream_operations;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		 
		     List<Integer> list=List.of(11,13,14,7,8,10);
		     Predicate<Integer> pred=(p)->{ return p>10;};
		       
		     //Atleast one Stream Terminal Operations.
		    list.stream().filter(pred)
		    .forEach((i)->{System.out.println(i);});
		    
		    System.out.println("***********************************");
		    
		   
	}   
}
//}
//class Int_consumer implements Consumer<Integer>
//{
//
//	@Override
//	public void accept(Integer t) {
//		//System.out.println(t*2+"a");
//		System.out.println("a");
//		
//	}
//	
//}
