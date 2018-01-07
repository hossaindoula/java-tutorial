package info.doula.concurrency;

import java.util.concurrent.atomic.AtomicLong;

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
public class AtomicCounter {
	private AtomicLong value = new AtomicLong(0L);

	public long next() {
		return value.incrementAndGet();
	}
}
