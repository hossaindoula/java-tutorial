package info.doula.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
public class BadRunnableTask {
	public static void main(String[] args) {
		Runnable badTask = () -> {			
			throw new RuntimeException("Throwing exception from task execution...");
		};

		ExecutorService exec = Executors.newSingleThreadExecutor();
		exec.execute(badTask);
		exec.shutdown();
	}
}
