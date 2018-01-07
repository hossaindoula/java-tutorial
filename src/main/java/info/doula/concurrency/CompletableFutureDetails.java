package info.doula.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDetails {
	CompletableFutureDetails app = new CompletableFutureDetails();

	private static ArrayList<String> numbers = new ArrayList<String>(Arrays.asList("0", "1", "2"));

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		testCompose();
		testCombine();
		testAcceptBoth();
		testAcceptEither();
		testAllOf();
		testAnyOf();
	}

	private static void testAnyOf() throws InterruptedException, ExecutionException {
		System.out.println("==========================");
		System.out.println("Requesting Testing AnyOf");

		CompletableFuture<String> future0 = createCFLongTime(0);
		CompletableFuture<String> future1 = createCF(1);
		CompletableFuture<String> future2 = createCFLongTime(2);

		CompletableFuture<Object> future = CompletableFuture.anyOf(future0, future1, future2);

		// check results
		System.out.println("Future result>> " + future.get());
		System.out.println(
				"All combined Futures result>> " + future0.get() + " | " + future1.get() + " | " + future2.get());
	}

	private static void testAllOf() throws InterruptedException, ExecutionException {
		System.out.println("==========================");
		System.out.println("Requesting Testing AllOf");

		CompletableFuture<String> future0 = createCF(0);
		CompletableFuture<String> future1 = createCFLongTime(1);
		CompletableFuture<String> future2 = createCF(2);

		boolean isDone = CompletableFuture.allOf(future0, future1, future2).isDone();

		// check results
		System.out.println("All futures are completed now>> " + isDone);
		System.out.println("Future result>> " + future0.get() + " | " + future1.get() + " | " + future2.get());
	}

	private static void testAcceptEither() throws InterruptedException, ExecutionException {
		System.out.println("==========================");
		System.out.println("Requesting Testing Accept Either");

		CompletableFuture<String> future = createCFLongTime(1);
		CompletableFuture<String> newFuture = createCF(2);

		future.acceptEither(newFuture, s -> {
			System.out.println("the future which finishs first is: " + s);
		});

		// check results
		System.out.println("Future result>> " + newFuture.get() + " and " + future.get());
	}

	private static void testAcceptBoth() throws InterruptedException, ExecutionException {
		System.out.println("==========================");
		System.out.println("Requesting Testing Accept Both");

		CompletableFuture<String> future = createCF(1); // future 1
		CompletableFuture<String> newFuture = createCFLongTime(2); // future 2

		newFuture.thenAcceptBoth(future, CompletableFutureDetails::showAcceptBoth);

		// check results
		System.out.println("Future result: " + newFuture.get() + " and " + future.get());
	}

	private static void showAcceptBoth(String a, String b) {
		System.out.println("Accept Both: now finish both Futures>> " + a + " and " + b);
	}

	private static void testCombine() throws InterruptedException, ExecutionException {
		System.out.println("==========================");
		System.out.println("Requesting Testing ComBine");

		CompletableFuture<String> future = createCFLongTime(1);
		CompletableFuture<String> newFuture = createCF(2);

		CompletableFuture<String> combinedFuture = future.thenCombine(newFuture, CompletableFutureDetails::appendString);

		// check results
		System.out.println("Future result>> " + future.get());
		System.out.println("newFuture result>> " + newFuture.get());
		System.out.println("combinedFuture result>> " + combinedFuture.get());
	}

	private static String appendString(String a, String b) {
		return a + " now appended to " + b;
	}

	private static void testCompose() throws InterruptedException, ExecutionException {
		System.out.println("==========================");
		System.out.println("Requesting Testing Compose");

		CompletableFuture<String> future = createCF(2);

		CompletableFuture<String> combinedFuture = future.thenCompose(CompletableFutureDetails::calculateCF);

		combinedFuture.thenAccept(result -> System.out.println("accept: " + result));

		// check results
		System.out.println("Future result>> " + future.get());
		System.out.println("combinedFuture result>> " + combinedFuture.get());
	}

	private static CompletableFuture<String> createCF(int index) {
		return CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				try {
					System.out.println("inside future: waiting for detecting index: " + index + "...");
					System.out.println("inside future: done...");

					return numbers.get(index);
				} catch (Throwable e) {
					return "not detected";
				}
			}
		});
	}

	private static CompletableFuture<String> createCFLongTime(int index) {
		return CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				try {
					System.out.println("inside future: waiting for detecting index: " + index + "...");
					for (int i = 1; i <= 5; i++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("running inside Future " + index + "... " + i + " sec");
					}
					System.out.println("inside future: done...");

					return numbers.get(index);
				} catch (Throwable e) {
					return "not detected";
				}
			}
		});
	}

	private static CompletableFuture<String> calculateCF(String s) {

		return CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				System.out.println("> inside new Future");
				return "new Completable Future: " + s;
			}
		});
	}
}
