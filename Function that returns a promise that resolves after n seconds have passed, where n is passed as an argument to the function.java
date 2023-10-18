import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class PromiseExample {

    public static CompletableFuture<Void> delay(int seconds) {
        CompletableFuture<Void> completableFuture = new CompletableFuture<>();
        CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(seconds);
                completableFuture.complete(null);
            } catch (InterruptedException e) {
                completableFuture.completeExceptionally(e);
            }
        });
        return completableFuture;
    }

    public static void main(String[] args) {
        int n = 5; // Replace with your desired seconds
        System.out.println("Starting to wait for " + n + " seconds.");
        delay(n).thenRun(() -> System.out.println(n + " seconds have passed."));
    }
}
