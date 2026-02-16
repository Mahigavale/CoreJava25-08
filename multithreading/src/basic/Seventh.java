package basic;

public class Seventh {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(()->{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("first thread...");
			while(true)
			{
				while(true)
				{
					while(true)
					{
						while(true)
						{
							 while(true)
							 {
								 System.out.println("first");
							 }
						}
					}
				}
				
			}
		});
		Thread t2=new Thread(()->{
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("second thread...");
			while(true)
			{
				while(true)
				{
					while(true)
					{
						while(true)
						{
							while(true)
							{
								System.out.println("second");
							}
						}
					}
				}
			}
		});

		Thread t3=new Thread(()->{
			
			System.out.println("third thread...");
			while(true)
			{
				while(true) {
					while(true)
					{
				System.out.println("third");
					}
				}
			}
		});
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		Thread.sleep(1500);
		t3.start();
	}

}
