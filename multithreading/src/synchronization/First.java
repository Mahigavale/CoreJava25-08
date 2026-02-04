package synchronization;

public class First {
	

	public static void main(String[] args) throws Exception {

		Counter count=new Counter();
		Counter count2=new Counter();
		
		
		FirstThread first=new FirstThread(count);
		SecondThread  second =new SecondThread(count);
		
		first.start();
		second.start();
		
	Thread.sleep(2500);
		
		System.out.println(count.getCount());
		System.out.println(count2.getCount());
		
	}

}

class  Counter
{
	int count=0;
	
	public void increase()
	{
		this.count++;
	}
	public int getCount()
	{
		
		return this.count;
	}
}


class FirstThread extends Thread
{ 
	Counter count;
	
	  public FirstThread(Counter count)
	  {
		  this.count=count;
	  }
	  
	  public void run()
	  {
		  for(int i=0;i<1000;i++)
		  {
			    count.increase();
		  }
		
	  }
	
}

class SecondThread extends Thread
{
	Counter count;
	
	 public SecondThread(Counter count)
	  {
		  this.count=count;
	  }
	 
	 public void run()
	  {
		  for(int i=0;i<1000;i++)
		  {
			    count.increase();
		  }
		
	  }
}