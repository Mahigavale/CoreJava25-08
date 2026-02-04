package basic;

public class Fourth {

	public static void main(String[] args) throws InterruptedException {
		
		
		/**
		 * Runnable=>Task=>run()
		 */
		Thread t1=new Thread(()->{
			for(int i=0;i<=100;i++)
			{
				try {
				Thread.sleep(700);
				}catch(Exception e)
				{
					
				}
				System.out.println(i);
			}
		});
		
		Thread t2=new Thread(()->{
			
			for(int i=1;i<=100;i++)
			{
				try {
				Thread.sleep(700);
				}
				catch(Exception e)
				{
					
				}
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		});
		
		
		t1.start();
		t1.join();
		t2.start();
	}

}
