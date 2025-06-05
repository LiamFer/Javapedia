package fundamentals;


public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(multiply(2, 3,3));
    }

    static double multiply(double a, double b) {
        return a * b;
    }


    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b,int c) {
        return a * b * c;
    }
}
