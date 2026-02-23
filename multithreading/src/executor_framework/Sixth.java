package executor_framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sixth {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		Runnable run=()->{for(int i=0;i<10;i++)
			{System.out.println(i);}};
			
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		         Future<?> ft=ex.submit(run,"DEFAULT VALUE");
		         System.out.println(ft.get());
		
		         ex.shutdown();
	}

}
