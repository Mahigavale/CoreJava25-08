package executor_framework;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {

	public static void main(String[] args) throws Exception {
		
		
		
//		 Callable<String> carl=()->(new String("hello"));
//		 
//		 System.out.println(carl.call());
		
		
		
		Runnable r1=()->{
			System.out.println("First Task");
			System.out.println(Thread.currentThread().getName()+"working");
			int i=0;
			while(i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		Runnable r2=()->{
			System.out.println("Second Task");
			System.out.println(Thread.currentThread().getName()+"working");
			int i=0;
			while(i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable r3=()->{
			System.out.println("Third Task");
			System.out.println(Thread.currentThread().getName()+"working");
			int i=0;
			while(i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable r4=()->{
			System.out.println("Fourth Task");
			System.out.println(Thread.currentThread().getName()+"working");
			int i=0;
			while(i<5)
			{
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
		
		
		try(ExecutorService ex=Executors.newFixedThreadPool(3);)
		{
		
		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);
		ex.execute(r4);
		
		}
		catch(Throwable t)
		{
			
			System.out.println(t.getMessage());
		}
	}

}
