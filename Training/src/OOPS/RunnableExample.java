package OOPS;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<6;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread Name: "+Thread.currentThread().getName()+" Value: "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		RunnableExample threadClass = new RunnableExample();
		Thread t1 = new Thread(threadClass);
		Thread t2 = new Thread(threadClass);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t1.wait();
		t2.start();
	}
}
