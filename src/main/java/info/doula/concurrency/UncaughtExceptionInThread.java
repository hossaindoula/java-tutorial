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
public class UncaughtExceptionInThread {
    public static void main(String[] args) {
        CatchAllThreadExceptionHandler handler = new CatchAllThreadExceptionHandler();

        // Set an uncaught exception handler for main thread  
        Thread.currentThread().setUncaughtExceptionHandler(handler);

        // Throw an exception  
        throw new RuntimeException();
    }
}
