//package mutual;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class First {
//
//	public static void main(String[] args) {
//		
//		
//		SharedResource res=new SharedResource();
//		
//		Producer prod=new Producer();
//		
//		Consumer cons=new Consumer();
//		
//		prod.source=res;
//		cons.source=res;
//		
//		prod.start();
//		cons.start();
//	}
//}
//
//class SharedResource
//{
//	List<Integer> list=new ArrayList<Integer>();
//	
//	int num=1;
//	
//	//list.size() => STOP.
//	 public synchronized void addNumber() throws InterruptedException
//	 {
//		 Thread.sleep(1000);
//		 System.out.println("checking size....");
//		 
//		 if(list.size()==10)
//		 {
//			// System.out.println("adding number :: size is :"+list.size());
//			
//			// num++;
//			 System.out.println("entering the waiting state........");
//			 System.out.println("Condition fullfilled :....stopping to add the number");
//			 wait();
//		 }
//		 list.add(num);
//		 num++;
//		 System.out.println("Item added :"+num+"*************");
//		 notify();
//		 System.out.println("notifying the remover");
//		 
//		 
//	 }
//	 
//	 
//	 public synchronized void removenumber() throws InterruptedException
//	 {
//		 
//	
//		 if(list.size()==0)
//		 {
//			 wait();
//			 System.out.println("nothing to removee.....remover stopped");
//		 }
//		 
//		 else {
//		 int removed_num= list.remove(0);
//		 System.out.println("removed item:"+removed_num);
//		 System.out.println("notifying the producer.......");
//		 notify();
//		 }
//	 }
//	
//}
//
//
//class Producer extends Thread
//{
//	SharedResource source;
//	
//	
//	public void run()
//	{
//		while(true) {
//		try {
//			source.addNumber();
//			 Thread.sleep(250);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//	}
//}
//
// class Consumer extends Thread
// {
//	 SharedResource source;
//	 
//	 public void run()
//	 {
//		 while(true) {
//		 try {
//			 Thread.sleep(5000);
//			source.removenumber();
//		 } catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		 }
//		 }
//	 }
// }