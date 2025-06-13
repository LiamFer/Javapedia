package fundamentals;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThreadTesting {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Thread thread = new Thread(new TestThread(5));

        
        CompletableFuture <String> t = CompletableFuture.supplyAsync(new TestSupply()).thenApply(text -> {
            System.out.println(text);
            return "";
        });

        String test = t.get();
        System.out.println("ACABOU!");
    }
}
