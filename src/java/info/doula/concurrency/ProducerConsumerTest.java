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
public class ProducerConsumerTest {
	public static void main(String[] args) {
		// Create Buffer, Producer and Consumer objects  
		Buffer buffer = new Buffer();
		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);

		// Start the producer and consumer threads  
		p.start();
		c.start();
	}
}