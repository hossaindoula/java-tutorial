package info.doula.concurrency;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * @author Mohammed Hossain Doula <hossaindoula@gmail.com>
 */
public class CompletableFuture1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = new CompletableFuture<>();

        future.complete("42");

        future.thenAccept(System.out::println).thenAccept(v -> System.out.println("done"));

        CompletableFuture.completedFuture("hello");
        CompletableFuture.runAsync(() -> System.out.println("hello"));
        CompletableFuture.runAsync(() -> System.out.println("hello"), Executors.newSingleThreadExecutor());
        CompletableFuture.supplyAsync(() -> UUID.randomUUID().toString());
        CompletableFuture.supplyAsync(() -> UUID.randomUUID().toString(), Executors.newSingleThreadExecutor());

    }

}
