package fundamentals;

public class DefuseThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("ERROR OCURRED IN THE THREAD!");
            }
        }
        System.out.println("KABOOOOM YOU FAILED!");
        System.exit(0);
    }
}
