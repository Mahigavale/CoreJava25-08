package sync;

public class ClassLevel {

	public static void main(String[] args) throws Exception {
	
		ClassDemo de=new ClassDemo();
		ClassDemo de2=new ClassDemo();
		
		One first=new One(de);
		One second=new One(de2);
		first.start();
		second.start();
		Thread.sleep(2500);
		
		System.out.println(de.getCount());
		System.out.println(de2.getCount());
	}
}


class ClassDemo
{
 static	int counter=0;
	
	public  void increase()
	{
	   synchronized(ClassDemo.class){
		counter++;
	   }
		
	}
	
	public int getCount()
	{
		return this.counter;
	}
}

class One extends Thread
{
	ClassDemo demo;
	
	public One(ClassDemo demo)
	{
		this.demo=demo;
	}
	
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			
			demo.increase();
		}
	}
}