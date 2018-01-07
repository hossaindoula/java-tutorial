package info.doula.concurrency;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 *
 * skype: mohammedhossaindoularonnie
 *
 * http://hossaindoula.com
 *
 * https://github.com/hossaindoula
 */
public class DaemonThread {
	public static void main(String[] args) {
		Thread t = new Thread(DaemonThread::print);
		t.setDaemon(true);
		t.start();
		System.out.println("Exiting main method");
	}
	
	public static void print() {
		int counter = 1 ;
		while(true) {
			try {
				System.out.println("Counter:" + counter++);
				Thread.sleep(2000); // sleep for 2 seconds  
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
