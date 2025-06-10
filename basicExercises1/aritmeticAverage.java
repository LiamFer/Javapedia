package basicExercises1;

public class aritmeticAverage {
    public static void main(String[] args) {
        double[][] grades = {{10, 4}, {8, 3}, {6, 2}};
        double total = 0;
        double weight = 0;
        for (double[] grade : grades) {
            total += grade[0] * grade[1];
            weight += grade[1];
        }
        System.out.println(total/weight);
    }
}
