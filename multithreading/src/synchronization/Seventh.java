package synchronization;

import java.lang.System.Logger;

public class Seventh {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread t1=new Thread(()->{
			
				
			System.out.println(Thread.currentThread().getName()+"started");
			while(true)
			{
				
				while(true)
				{
					while(true)
					{
						for(long i=0;i<500000;i++)
						{
						System.out.println(i);	
						}
					}
				}
				//System.out.println("First");
			}
		});
		Thread t2=new Thread(()->{
			System.out.println(Thread.currentThread().getName()+"started");
			while(true)
			{
				while(true)
				{
					
					while(true)
					{
						
						for(long i=0;i<500000;i++)
						{
						System.out.println(i);	
						}
					}
				}
				
				// System.out.println("second");
			}
		});
		Thread t3=new Thread(()->{
			System.out.println(Thread.currentThread().getName()+"started");
			while(true)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Third");
			}
		});

		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(10);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		 t1.start();
		 t2.start();
		 Thread.sleep(2000);
		 t3.start();
	}

}
