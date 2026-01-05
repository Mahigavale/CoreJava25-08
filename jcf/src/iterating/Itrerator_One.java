package iterating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Itrerator_One {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(34);
		list.add(11);
		list.add(13);
		list.add(57);
		list.add(67);
		System.out.println(list);

		//remove => remove(Object)  vs remove(index)
		//
	
		// 
//		for(int i:list)
//		{
//			
//			list.remove(2);
//			System.out.println(i);
//		}
		
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//			
//			list.remove(2);
//		}
//		System.out.println(list);
		
		
		
		//
                Iterator<Integer> itr=list.iterator();
//   //23,34,11,57             
//                System.out.println(itr.hasNext());
//                System.out.println(itr.next());
//                System.out.println(itr.hasNext());
//                System.out.println(itr.next());
//                System.out.println(itr.hasNext());
//                System.out.println(itr.next());
//                System.out.println(itr.hasNext());
//                System.out.println(itr.next());
//                System.out.println(itr.hasNext());
                //23,34,11,13,57,67   
                while(itr.hasNext())
                {
                	System.out.println(itr.next());
                	if(itr.next()==1000) {}
                	System.out.println("***");
                }
                
               // System.out.println(list);
	}

}
