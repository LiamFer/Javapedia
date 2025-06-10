package fundamentals;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

public class countdownTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask countdown = new TimerTask() {
            int count = 10;

            @Override
            public void run() {
                System.out.println(count);
                if (count == 0) {
                    this.cancel();
                    timer.cancel();
                }
                count--;
            }
        };
        Box<String> box1 = new Box<>("Dragonslayer");
        Box<Integer> box2 = new Box<>(22);
        Box<Integer> box3 = new Box<>(2222);

        Product<String,Integer> product1 = new Product<>("Ball",10);
        Product<String,Double> product2 = new Product<>("Fridge",249.99);
        Product<String,Float> product3 = new Product<>("Chewgum",0.10f);

        ArrayList<Product> items = new ArrayList<>();
        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.forEach(i -> i.checkProduct());


        timer.schedule(countdown, 0, 1000);
        box2.unbox();
        box1.unbox();
        box3.unbox();
    }
}
