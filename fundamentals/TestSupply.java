package fundamentals;

import java.util.function.Supplier;

public class TestSupply implements Supplier<String> {

    @Override
    public String get(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread Working...");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return "CompletableFuture";
    }
}
