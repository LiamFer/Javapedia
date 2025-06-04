package fundamentals;
import java.util.Random;

public class hypotenuse {
    public static void main(String[] args){
        Random r = new Random();
        int a = r.nextInt(1,10);
        int b = r.nextInt(1,10);

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
