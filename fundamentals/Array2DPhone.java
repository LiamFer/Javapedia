package fundamentals;

import java.util.Scanner;

public class Array2DPhone {
    static char[][] keyboard = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}, {'*', '0', '#'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert your commands to get the location: ");
        String command = sc.nextLine();

        for (char c : command.toCharArray()) {
            System.out.println(c + " found at " + findKey(c));
        }


        sc.close();
    }

    public static String findKey(char target) {
        for(int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < keyboard[i].length; j++){
                if (keyboard[i][j] == target){
                    return "[" + i + "]" + "[" + j + "]";
                }
            }
        }
        return "NOT FOUND!";
    }

}
