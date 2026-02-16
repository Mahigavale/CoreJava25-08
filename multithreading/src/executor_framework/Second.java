package executor_framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Second {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex=Executors.newFixedThreadPool(1);
		
		
		Callable<String> call=()->{
			Thread.sleep(5000);
			return "abcdefghijkl";
		};
		Callable<String> call2=()->("abcd");
		Callable<String> call3=()->("abcde");
		
	Future<String> f=ex.submit(call);
//		ex.submit(call2);
//		ex.submit(call3);
		
	
	   Future<?> f2=ex.submit(()->{System.out.println("run method");},"hello");
	
	  // f.cancel(true);
		ex.shutdown();
		
		System.out.println(f.get());
		System.out.println(f2.get());
	}

}
