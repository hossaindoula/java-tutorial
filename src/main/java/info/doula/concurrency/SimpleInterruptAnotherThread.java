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
public class SimpleInterruptAnotherThread {
    public static void main(String[] args) {
        Thread t = new Thread(SimpleInterruptAnotherThread::run);
        t.start();

        // Let the main thread sleep for 1 second
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Now interrupt the thread
        t.interrupt();
    }

    public static void run() {
        int counter = 0;

        while (!Thread.interrupted()) {
            counter++;
        }
        System.out.println("Counter:" + counter);
    }
}
