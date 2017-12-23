package info.doula.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * skype: mohammedhossaindoularonnie
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class ReadMostlyData {
    private int value;
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    private Lock rLock = rwLock.readLock();
    private Lock wLock = rwLock.writeLock();

    public ReadMostlyData(int value) {
        this.value = value;
    }

    public int getValue() {
        // Use the read lock, so multiple threads may read concurrently  
        rLock.lock();
        try {
            return this.value;
        } finally {
            rLock.unlock();
        }
    }

    public void setValue(int value) {
        // Use the write lock, so only one thread can write at a time			wLock.lock();  
        try {
            this.value = value;
        } finally {
            wLock.unlock();
        }
    }
}
