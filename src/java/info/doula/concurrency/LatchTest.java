package info.doula.concurrency;

import java.util.concurrent.CountDownLatch;

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
public class LatchTest {
    public static void main(String[] args) {
        // Create a countdown latch with 2 as its counter  
        CountDownLatch latch = new CountDownLatch(2);

        // Create and start the main service  
        LatchMainService ms = new LatchMainService(latch);
        ms.start();

        // Create and start two helper services  
        for (int i = 1; i <= 2; i++) {
            LatchHelperService lhs = new LatchHelperService(i, latch);
            lhs.start();
        }
    }
}
