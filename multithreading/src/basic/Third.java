package basic;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Thread one=new Thread(()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName());
	
				System.out.println(3*i);
			}
		});
		one.start();
		
		
		
		System.out.println(Thread.currentThread().getName()+"re");
		
		
		Thread two=new Thread(()->{
			int counter=1;
			while(counter<100)
			{
				System.out.println(Thread.currentThread().getName());
				 System.out.println(counter);
				 counter++;
			}
		});
		two.run();
				
	}

}

/**
 * Runnable=>TASK.
 */

/**
 * TablePrinter IS-A Runnable.
// */
//class TablePrinter implements Runnable
//{
//
//	@Override
//	public void run() {
//		
//		
//		System.out.println(Thread.currentThread().getName()+"*");
//		for(int i=1;i<=10;i++)
//		{
//			try {
//			Thread.sleep(1500);
//			}catch(Exception e)
//			{
//				
//			}
//			System.out.println(2*i);
//		}
//		
//	}
//	
//}