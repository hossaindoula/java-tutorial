package info.doula.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

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
public class PhantomRefDemo {
	public static void main(String[] args) {
		final ReferenceQueue<BigObject> q = new ReferenceQueue<>();
		BigObject bigObject1 = new BigObject (101);
		BigObject bigObject2 = new BigObject (102);
		BigObject bigObject3 = new BigObject (103);
		PhantomReference<BigObject> pr1 = 
					new PhantomReference<>(bigObject1, q);
		PhantomReference<BigObject> pr2 = 
					new PhantomReference<>(bigObject2, q);
		PhantomReference<BigObject> pr3 = 
				  new PhantomReference<>(bigObject3, q);
		
		/* This method will start a thread that will wait for the arrival of new
		   phantom references in reference queue q 
		*/
		startThread(q);
		
		/* You can use bigObject1, bigObject2 and bigObject3 here */
		
		// Set the bigObject1, bigObject2 and bigObject3 to null,
		// so the objects they are referring to may become phantom reachable.
		bigObject1 = null;
		bigObject2 = null;
		bigObject3 = null;
		
		/* Let us invoke garbage collection in a loop. One garbage collection will 
		just finalize the three big objects with ids 101, 102 and 103. They may 
		not be placed in a reference queue. In another garbage collection run, 
		they will become phantom reachable and they will be placed in a queue 
		and the waiting thread will remove them from the queue and will clear 
		their referent's reference. Note that we exit the application when all 
		three objects are cleared inside run() method of thread. Therefore, the 
		following infinite loop is ok for demonstration purpose. If System.gc() 
		does not invoke the garbage collector on your machine, you should replace 
		the following loop with a loop which would create many big objects keeping 
		their reference, so that the garbage collector would run.
		*/
		while (true) {	
			System.gc();
		}
	}

	public static void startThread(final ReferenceQueue<BigObject> q ) {
		/* Create a thread and wait for the reference object’s arrival in the queue */
		Thread t = new Thread(new Runnable() {
			public void run() {
				Reference r = null;
				try {
					// Wait for first phantom reference to be queued
					r =  q.remove();

					// Clear the referent's reference
					r.clear();
						
					// Wait for second phantom reference to be queued
					r = q.remove();

					// Clear the referent's reference
					r.clear();
	
					// Wait for third phantom reference to be queued
					r = q.remove();

					// Clear the referent's reference
					r.clear();

					System.out.println("All three objects have been " + 
					                   "queued and cleared.");
					
					/* Typically, you will release the network connection or 
					   any resources shared by three objects here.
					*/

					// Exit the application
					System.exit(1);
				}
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}				
			}
		} );

		// Start the thread, which will wait for three phantom 
		// references to be queued 
		t.start();	
	}
}
