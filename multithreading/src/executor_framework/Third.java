package executor_framework;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Third {

	public static void main(String[] args) {
		
		Runnable run=()->{
			int i=1;
			while(i<=100)
			{
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println("Thread is:"+Thread.currentThread().getName());
				System.out.println("hiii");
				i++;
			}
		};
		Runnable run2=()->{
			int i=1;
			while(i<=100)
			{		
				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println("Thread is:"+Thread.currentThread().getName());

				System.out.println("hello");
				i++;
			}
		};
		Runnable run3=()->{
			int i=1;
			while(i<=100)
			{
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println("Thread is:"+Thread.currentThread().getName());

				System.out.println("bye");
				i++;
			}
		};
		
	ExecutorService ex=Executors.newFixedThreadPool(1);
	
	
	
	
	ex.execute(run);

	ex.execute(run2);
	System.out.println("run3:"+run3);
	System.out.println("RUn2:"+run2);
	 List<Runnable> list=ex.shutdownNow();
	 list.forEach(System.out::println);
	ex.execute(run3);
	

	ex.shutdown();
	
	
	}

}
