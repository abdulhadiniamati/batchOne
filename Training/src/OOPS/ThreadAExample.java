package OOPS;

public class ThreadAExample {

	public static void main(String[] args) {
		ThreadBExample thread = new ThreadBExample();
		thread.start();
		
		synchronized (thread) {
			System.out.println("Waiting for thread to complete");
			try {
				thread.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Total is : "+thread.total);

	}

}
