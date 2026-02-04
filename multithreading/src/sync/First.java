package sync;

public class First {

	public static void main(String[] args) throws Exception {
		
		
		Counter ct=new Counter();
		Counter ct2=new Counter();
		First_T first=new First_T(ct);
		First_T second=new First_T(ct2);
		
		
		first.start();
		second.start();
		
		
		Thread.sleep(2500);
		
		System.out.println(ct.getcount());
		System.out.println(ct.getcount2());
		
		System.out.println("***************");
		System.out.println(ct2.getcount());
		System.out.println(ct2.getcount2());
		
	
	}
}

class Counter
{
	int count=0;
	int count2=0;
	public  void  increase()
	{
		
		synchronized(this){
		this.count++;
		}
		
		this.count2++;
	}
	
	public int getcount()
	{
		return this.count;
	}
	
	public int getcount2()
	{
		return this.count2;
	}
}


class First_T extends Thread
{
	Counter count;
	
	
	public First_T(Counter count)
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