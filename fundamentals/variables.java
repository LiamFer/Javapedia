package fundamentals;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
//        int value = 2;
//        double dval = 2.5;
//        boolean testBoolean = false;
//        char charac = 't';
//        String name = "wila";
//        System.out.println("w");

//        Scanner sc = new Scanner(System.in);
//        System.out.print("What's your name?");
//        String name = sc.next();
//        System.out.println("Hello " + name);
//        sc.close();

//        int area = RectangleArea();
//        System.out.print("The Rectangle area is " + area);

        Questions();
    }

    public static int RectangleArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the Rectangle Height: ");
        int height = sc.nextInt();

        System.out.print("What's the Rectangle Width: ");
        int width = sc.nextInt();

        sc.close();
        return height * width;
    }
    public static void Questions(){
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}

