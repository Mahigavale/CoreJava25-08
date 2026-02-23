package executor_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cached {

	public static void main(String[] args) {
		
		ExecutorService ex=Executors.newCachedThreadPool();
		
		Runnable run=()->{
			System.out.println(Thread.currentThread().getName()+"TASk1");
		};
		Runnable run2=()->{System.out.println(Thread.currentThread().getName()+"TASk2");};
		Runnable run3=()->{System.out.println(Thread.currentThread().getName()+"TASk3");};
		
		for(int i=0;i<100;i++) {
		ex.execute(run3);
		ex.execute(run2);
		ex.execute(run);
		}
		ex.shutdown();
	}
}
