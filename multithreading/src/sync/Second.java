package sync;

public class Second {

	public static void main(String[] args) {

		Thread one = new Thread(() -> {

			for (int i = 0; i <= 10; i++) {
				try {
					Thread.sleep(1500);
				} catch (Exception e) {

				}

				System.out.println("I:Daemon" + i);
			}
		});

		Thread Two = new Thread(() -> {

			for (int i = 0; i <=5; i++) {
				try {
					Thread.sleep(1500);
				} catch (Exception e) {

				}
				System.out.println("Normal Thread:" + i);
			}
		});
		
		
		
		one.setDaemon(true);
		
		one.start();
		Two.start();

	}

}
