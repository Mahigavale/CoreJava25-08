package iterating;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Itr {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(23);
		list.add(34);
		list.add(57);
		list.add(111);
		list.add(1430);
		
		
	ListIterator<Integer> ltr=list.listIterator();
	
	
	while(ltr.hasNext())
	{
		if(ltr.next()==111)
		{
		   ltr.add(34638);
		}
	}
	
	System.out.println("*******************");
	
	while(ltr.hasPrevious())
	{
		System.out.println(ltr.previous());
	}
		
	
	
	System.out.println("################");
//	for(int i :list)
//	{
//		
//		if(i==23)
//		{
//			list.remove(Integer.valueOf(23));
//		}
//	}
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)==23)
		{
			list.remove(i);
		}
		System.out.println(list.get(i));
	}
	}

}
