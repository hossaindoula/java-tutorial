package info.doula.concurrency;

import java.util.concurrent.Exchanger;
import java.util.ArrayList;
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
public class ExchangerProducer extends Thread {
    private Exchanger<ArrayList<Integer>> exchanger;
    private ArrayList<Integer> buffer = new ArrayList<>();
    private int bufferLimit;
    private Random random = new Random();
    private int currentValue = 0; // to produce values		    

    public ExchangerProducer(Exchanger<ArrayList<Integer>> exchanger,
        int bufferLimit) {
        this.exchanger = exchanger;
        this.bufferLimit = bufferLimit;
    }

    public void run() {
        // keep producing integers  
        while (true) {
            try {
                System.out.println("Producer is filling the buffer with data...");

                // Wait for some time by sleeping  
                int sleepTime = random.nextInt(20) + 1;
                Thread.sleep(sleepTime * 1000);

                // Fill the buffer  
                this.fillBuffer();
                System.out.println("Producer has produced:" + buffer);

                // Let us wait for the consumer to exchange data  
                System.out.println("Producer is waiting to exchange the data...");
                buffer = exchanger.exchange(buffer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void fillBuffer() {
        for (int i = 1; i <= bufferLimit; i++) {
            buffer.add(++currentValue);
        }
    }
}
