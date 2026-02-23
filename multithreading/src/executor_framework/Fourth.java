package executor_framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fourth {

	public static void main(String[] args) throws Exception {
		
		try(ExecutorService ex=Executors.newFixedThreadPool(3);){
		
		
		ex.execute(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Thread:"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		});
		ex.execute(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Thread:"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		});
	}
	}
}
