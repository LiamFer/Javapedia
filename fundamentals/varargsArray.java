package fundamentals;


public class varargsArray {
    public static void main (String[] args){
        addNumbers(1,2,3,4,5);
    }

    static int addNumbers(int... numbers){
        int total = 0;
        for (int number : numbers){
            total+=number;
        }
        System.out.println("The total amount is equal to " + total);
        return total;
    }
}
