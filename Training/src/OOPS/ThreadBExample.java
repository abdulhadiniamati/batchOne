package OOPS;

public class ThreadBExample extends Thread {

	int total;
	
	public void run(){
		synchronized (this) {
			for(int i=0;i<100;i++){
				total = total + i;
			}
			notify();
		}
	}

}
