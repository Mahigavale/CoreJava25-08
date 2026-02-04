package synchronization;

public class Second {

	public static void main(String[] args) throws Exception {
		
		Counter_Demo demo=new Counter_Demo();
		
	//	Counter_Demo demo2=new Counter_Demo();
		
		
		
		One on=new One();
		Two tw=new Two();
		on.demo=demo;
		tw.demo=demo;
		
		on.start(); //1000 =>run()
		tw.start();   //1000=>run()
		
		
		Thread.sleep(2500); //main thodi wait karel so that one and two can perform some Operation
		System.out.println(demo.getCount());
		
		System.out.println("Count 2::"+demo.getCount2());
	//	System.out.println(demo2.getCount());

		
	}
}

class Counter_Demo
{
	int count=0;
	
	int count2=0;
	
	/**
	 * Thread Safe=> One after another
	 */
	/**
	 * Method level synchronization.
	 */
	
	/**
	 * This Leevel =>Object level
	 */
	public void Increase()
	
	{
		synchronized(this){
	    this.count++;	
		}
	    
	    
	    this.count2++;
	}
	
//	public synchronized void decrease()
//	{
//		this.count--;
//	}
	public int getCount()
	{
		return this.count;
	}
	
	public int getCount2()
	{
		return this.count2;
	}
}


class One extends Thread
{
	
	Counter_Demo demo;  //Instance variable //null
	
	public void run()
	{
		for(int i=0;i<1000000;i++)
		{
			demo.Increase();
		}

	}
}

class Two extends Thread
{
	
	Counter_Demo demo; //null
	
	public void run() {
		
	for(int i=0;i<500000;i++)
	{
		demo.Increase();
	}
	}
}