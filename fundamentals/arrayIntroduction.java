package fundamentals;

import java.util.Arrays;

public class arrayIntroduction {
    public static void main (String[] args){
        String[] fruits = {"Apple","Test"};
        int size = fruits.length;
        Arrays.sort(fruits);
        for (String fruit : fruits){
            System.out.print(fruit + " - ");
        }

        String[] foods = new String[15];

    }
}
