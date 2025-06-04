package fundamentals;

public class compoundInterest {
    public static void main(String[] args){
        double principal = 1000;
        int timesCompounded = 2;
        int years = 2;
        double interestRate = 0.2;
        System.out.println(principal*Math.pow((1+interestRate/timesCompounded),years*timesCompounded));
    }
}
