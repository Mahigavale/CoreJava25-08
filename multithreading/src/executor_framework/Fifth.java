package executor_framework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fifth {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		/**
		 * Submit()=>Callable<V>=>Future<V>
		 */
		
		Callable<String> ca=()->{
			//Thread.sleep(15000);
			return new String("HELLLO");};
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		
	Future<String> ft=ex.submit(ca);
//Thread.sleep(11000);
	
	//ft.cancel(true);
	 System.out.println(ft.get());
	}

}
