package queueif;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Second {

	public static void main(String[] args) {
		
		/**
		 * FIFO=>
		 * 
		 */
		
		
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		for(int i=0;i<50000000;i++)
		{
			list.add(i);
		}

		 long StartTime=System.nanoTime();
		  System.out.println(list.get(49999999));
		  long endTime=System.nanoTime();
		  //26363
		  System.out.println((endTime-StartTime)/10000);
	}

}
