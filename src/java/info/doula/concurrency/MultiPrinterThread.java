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
public class MultiPrinterThread {
	public static void main(String[] args) {
		// Create two Thread objects
		Thread t1 = new Thread(MultiPrinterThread::print);
		Thread t2 = new Thread(MultiPrinterThread::print);
		
		// Start both threads
		t1.start();
		t2.start();
	}

	public static void print() {
		for (int i = 1; i <= 500; i++) {
			System.out.println(i);
		}
	}
}
