package operations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Thirteenth {

	public static void main(String[] args) {
		
	   StringBuffer sb=List.of("***","xyz","jkl").stream().collect(new StringCollector());
	   
	   System.out.println(sb);
		
		
		
	}
}

class StringCollector implements  Collector<String, StringBuffer, StringBuffer>
{

	/**
	 * Supplier gives you the accumulator.=>Modifying Accumulator.
	 */
	@Override
	public Supplier<StringBuffer> supplier() {
	   return ()->{return new StringBuffer();};	
	   /**
	    * return StringBuffer::new;
	    */
	}

	/**
	 * Uses the element and modifying accumulator to collect the element.
	 */
	@Override
	public BiConsumer<StringBuffer, String> accumulator() {
		return (sb,s)->{sb.append(s);};
	}

	/**
	 * If there are two accumulators combines them.
	 */
	@Override
	public BinaryOperator<StringBuffer> combiner() {
		return(sb1,sb2)->{
			 sb1.append(sb2);
			 
			 return sb1;
		};
		
	}

	@Override
	public Function<StringBuffer, StringBuffer> finisher() {
		return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		
		Set<Collector.Characteristics> s =new HashSet<Collector.Characteristics>();
		s.add(Collector.Characteristics.IDENTITY_FINISH);
		return s;
	}
	
}