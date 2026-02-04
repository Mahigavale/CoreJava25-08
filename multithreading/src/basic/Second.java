package basic;

public class Second {

	public static void main(String[] args) throws Exception {
		
		NumberPrinter np=new NumberPrinter();  //Thread0
		NumberPrinter np2=new NumberPrinter();
		NumberPrinter np3=new NumberPrinter();
		NumberPrinter np4=new NumberPrinter();
		
	    np.start();
	    np.join();
		np2.start();
		np2.join();
		np3.start();
		np4.start();
		/**
		 * Going to create a thread and start the execution of run() method.
		 */
		np.run(23);
		
		int count=1;
		while(count<100)
		{
			System.out.println("hello");
			Thread.sleep(1500);
			count++;
		}
		
		
		
		
		
			}
}

//NUMBERPRINTER IS A THREAD.
class NumberPrinter extends Thread
{

	
	
		
	@Override
	public void run(){
		
		  System.out.println(Thread.currentThread().getName()+" :::calling run");
		// System.out.println(t.getName());.getName()
		
		System.out.println("Start internally calling the Rum method....!");
		for(int i =1;i<10;i++)
		{
			
			try {
			Thread.sleep(1500);
			}
			catch(Exception  ex)
			{
				System.out.println(ex.getMessage());
			}
			
			System.out.println(i);
		}
		
	}
	
	public void run(int i) throws InterruptedException
	{
		//this.run();
		
		System.out.println(Thread.currentThread().getName()+"callign cusom run");
		for(int j=0;j<15;j++)
		{
			Thread.sleep(1500);
			System.out.println("*");
		}
	}
	
	
	
}