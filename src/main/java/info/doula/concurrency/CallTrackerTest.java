package info.doula.concurrency;

import java.util.Random;

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
public class CallTrackerTest {
	public static void main(String[] args) {		
		// Let us start three threads to the CallTracker.call() method
		new Thread(CallTrackerTest::run).start();
		new Thread(CallTrackerTest::run).start();
		new Thread(CallTrackerTest::run).start();
	}

	public static void run() {
		Random random = new Random();
		
		// Generate a random value between 1 and 5  
		int counter = random.nextInt(5) + 1;
		
		// Print the thread name and the generated random number by the thread
		System.out.println(Thread.currentThread().getName() + 
		                   " generated counter: " + counter);

		for (int i = 0; i < counter; i++) {		
			CallTracker.call();
		}
	}
}
