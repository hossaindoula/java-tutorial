package info.doula.concurrency;

import java.util.concurrent.ForkJoinPool;

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
public class ForkJoinTest {
	public static void main(String[] args) {
		// Create a ForkJoinPool to run the task  
		ForkJoinPool pool = new ForkJoinPool();

		// Create an instance of the task  
		RandomIntSum task = new RandomIntSum(3);

		// Run the task  
		long sum = pool.invoke(task);

		System.out.println("Sum is " + sum);
	}
}
