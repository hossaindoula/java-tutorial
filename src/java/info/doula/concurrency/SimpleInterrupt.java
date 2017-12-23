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
public class SimpleInterrupt {
	public static void main(String[] args) {
		System.out.println("#1:" + Thread.interrupted());

		// Now interrupt the main thread  
		Thread.currentThread().interrupt();

		// Check if it has been interrupted  
		System.out.println("#2:" + Thread.interrupted());

		// Check again if it has been interrupted  
		System.out.println("#3:" + Thread.interrupted());
	}
}
