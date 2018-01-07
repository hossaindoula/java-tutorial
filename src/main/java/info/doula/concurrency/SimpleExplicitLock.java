package info.doula.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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
public class SimpleExplicitLock {
	// Instantiate the lock object  
	private Lock myLock = new ReentrantLock();

	public void updateResource() {
		// Acquire the lock  
		myLock.lock();

		try {
			// Logic for updating/reading the shared resource goes here
		} finally {
			// Release the lock  
			myLock.unlock();
		}
	}
}
