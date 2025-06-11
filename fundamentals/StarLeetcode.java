package fundamentals;
import java.util.Stack;

public class StarLeetcode {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            String v = String.valueOf(c);
            if (!stack.isEmpty() && v.equals("*")) {
                stack.pop();
            } else {
                stack.push(v);
            }
        }
        StringBuilder answer = new StringBuilder();
        stack.forEach(answer::append);
        System.out.println(answer.toString());;
    }
}
