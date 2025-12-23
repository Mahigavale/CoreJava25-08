package queueif;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Pq {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Reversed_Integer());
		
		pq.add(23);
		pq.offer(34);
		pq.offer(45);
		pq.offer(31);
		pq.offer(112);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		
		System.out.println(pq.poll());
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
	
		
		PriorityQueue<Business> pq2=new PriorityQueue<Business>(new  B_Comparator());
		
		
		pq2.offer(new Business(2345.67,"AK Travles"));
		pq2.offer(new Business(11111.45,"PK Biryani"));
		pq2.offer(new Business(232221.45,"Gehlot Hospitlity"));
		pq2.offer(new Business(232221.45,"Ghatge Hospitlity"));
		
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		
		
	 Comparator<Business>com=(Comparator<Business>) pq2.comparator();
	 
	 
	}

}


class Reversed_Integer implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return Integer.compare(o2,o1);
	}
	
}
class Business implements Comparable<Business>
{
	 double turnover;
	 String name;
	 
	 
	 public Business(double turnover,String name)
	 {
		   this.turnover=turnover;
		   this.name=name;
	 }
	 
	 
	 public String toString()
	 {
		 return this.turnover+" "+this.name;
	 }


	 @Override
	 public int compareTo(Business o) {
		return Double.compare(o.turnover,this.turnover);
	 }
}

class B_Comparator implements Comparator<Business>
{

	@Override
	public int compare(Business o1, Business o2) {
	
		return Double.compare(o1.turnover, o2.turnover);
	}
	
}