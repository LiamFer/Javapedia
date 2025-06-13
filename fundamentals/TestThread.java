package fundamentals;

public class TestThread implements Runnable {
    int times;

    TestThread(int times) {
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.times; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("TESTE RODANDOOO");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
