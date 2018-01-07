package info.doula.concurrency;

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
public class VolatileVariable extends Thread {
    private volatile boolean keepRunning = true;

    public static void main(String[] args) {
        // Create the thread
        VolatileVariable vv = new VolatileVariable();

        // Start the thread
        vv.start();

        // Let the main thread sleep for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the thread
        System.out.println("Going to set the stop flag to true...");
        vv.stopThread();
    }

    public void run() {
        System.out.println("Thread started...");

        // keepRunning is volatile. So, for every read, the thread reads its
        // latest value from the main memory
        while (keepRunning) {
            try {
                System.out.println("Going to sleep ...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped...");
    }

    public void stopThread() {
        this.keepRunning = false;
    }
}
