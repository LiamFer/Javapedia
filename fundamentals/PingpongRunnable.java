package fundamentals;

public class PingpongRunnable implements Runnable{
    private String message;
    PingpongRunnable(String message){
        this.message = message;
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            try {
                System.out.printf("%s!\n",message);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("ERROR OCURRED");
            }
        }
    }

}
