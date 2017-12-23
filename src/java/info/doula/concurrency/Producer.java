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
public class Producer extends Thread {
	private Buffer buffer;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		Random rand = new Random();
		while(true) {
			// Generate a random integer and store it in the buffer  
			int n = rand.nextInt();
			buffer.produce(n);
		}
	}
}
