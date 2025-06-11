package fundamentals;

public class MultiThreading {
    public static void main (String[] args){
        Thread ping = new Thread(new PingpongRunnable("PING"));
        Thread pong = new Thread(new PingpongRunnable("PONG"));
        ping.start();
        pong.start();

        try{
            ping.join();
            pong.join();
        } catch (Exception e) {
            System.out.println("ERROR OCURRED");
        }

        System.out.println("Match Finished!");
    }
}
