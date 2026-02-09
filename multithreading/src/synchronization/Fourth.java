package synchronization;

public class Fourth {

	public static void main(String[] args) throws InterruptedException {
		
		Counter_R R=new Counter_R();
		
		T1 t=new T1();
		T2 t2=new T2();
		
		t.R=R;
		t2.R=R;
		t.start();
		//t.join();
		t2.start();
		
		Thread.sleep(1500);
		
		System.out.println("Counter is:"+R.getCount());
	}

}

class Counter_R
{
	 volatile int count=1;
	
	public void increase()
	{
		this.count++;
	}
	
	public int getCount()
	{
		return this.count;
	}
}

class T1 extends Thread
{
	Counter_R R;
	
	public void run()
	{
		while(R.count  !=789)
		{
			
			System.out.println("hello");
		}
	}
	
}

class T2 extends Thread
{
	Counter_R R;
	
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("***********************************************************************************");
		System.out.println("Increasing the value of the counter to 2000");
		for(int i=0;i<1000;i++)
		{
			R.increase();
			System.out.println(R.getCount()+"::Increased to");
		}
	}
}