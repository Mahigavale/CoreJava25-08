package functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_4 {

	public static void main(String[] args) {
		
		/**
		 * List<List<List<Integer>>> list=>[[[],[]],[[],[]]]
		 */
		
		
		List<Integer> list=Arrays.asList(10,20,30);
		
		List<Integer> list2=Arrays.asList(30,40,50);
		
		List<Integer> list3=Arrays.asList(11,11,11);
		List<Integer> list4=Arrays.asList(80,80,80);
		List<List<Integer>> _2d=new ArrayList<List<Integer>>();
		
		_2d.add(list2);
		_2d.add(list);
		
		List<List<Integer>> two_d=new ArrayList<List<Integer>>();
		two_d.add(list4);
		two_d.add(list3);
		
		List<List<List<Integer>>> Three_d=new ArrayList<List<List<Integer>>>();
		
		
		Three_d.add(two_d);
		Three_d.add(_2d);
		//[[[80,80,80],[11,11,11]],[[30,40,50][10,20,30]]
		Consumer_3d cons=new Consumer_3d();
		cons.accept(Three_d);
	}
}
class Consumer_A implements Consumer<List<Integer>>
{

	@Override
	public void accept(List<Integer> t) {
		int sum=0;
		for(int i:t)
		{
			sum+=i;
		}
		System.out.println("Sum:"+sum);
	}
	
}

class Cosumer_2d implements Consumer<List<List<Integer>>>
{

	@Override
	public void accept(List<List<Integer>> t) {
		for(List<Integer> l:t)
		{
			Consumer_A con=new Consumer_A();
			con.accept(l);
			System.out.println("################");
		}
		
	}
	
}

class Consumer_3d implements Consumer<List<List<List<Integer>>>>{

	@Override
	public void accept(List<List<List<Integer>>> t) {
	
	
		for(List<List<Integer>> list:t)
		{
			Cosumer_2d two=new Cosumer_2d();
			
			two.accept(list);
			System.out.println("***************");
		}
	}


}