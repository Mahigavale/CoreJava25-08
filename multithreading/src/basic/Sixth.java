package basic;

public class Sixth {
	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			int count=1;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(count<100)
			{
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				System.out.println("first Thread");
			}
		});
		Thread t2=new Thread(()->{
			int count=1;
			while(count<100) {
				while(true) {
					
					while(true) {
					
						while(true) {
							System.out.println("Second Thread");
						}
					}
				}
			}
			
		});
		Thread t3=new Thread(()->{
			int count=1;
			while(count<100)
			{
				while(true) {
					while(true) {
						
						while(true) {
				System.out.println("Third Thread");
						}
					}
				}
			}
		});
		
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(10);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		
		t2.start();
		t3.start();
		t1.start();
	}
}
