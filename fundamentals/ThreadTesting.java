package fundamentals;

public class ThreadTesting {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TestThread(5));
        thread.start();
        thread.join();
        System.out.println("ACABOU!");
    }
}
