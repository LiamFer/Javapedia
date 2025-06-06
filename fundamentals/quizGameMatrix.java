package fundamentals;

import java.util.Scanner;

public class quizGameMatrix {
    public static void main(String[] args) {
        final String[][] questions = {{"What is the name of the main character in Doom Eternal?", "The Slayer", "The Destroyer", "The Reaper", "The Warden"}, {"Which weapon is known for its powerful explosive shot?", "Plasma Rifle", "Super Shotgun", "Rocket Launcher", "Ballista",}, {"What does the Crucible Blade do?", "Fires plasma projectiles", "Shields the player", "Instantly kills most demons", "Opens portals",}, {"Who is the final boss in Doom Eternal's base campaign?", "Icon of Sin", "Marauder", "Khan Maykr", "Hell Priest",}, {"Which upgrade allows the Doom Slayer to slow down time while aiming mid-air?", "Blood Fueled", "Air Control", "Chrono Strike", "Savage Boost",}};
        final int[] answers = {1, 3, 3, 1, 3};
        int score = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                if (j == 0) {
                    System.out.println(questions[i][j]);
                } else {
                    System.out.println(j + ". " + questions[i][j]);
                }
            }
            System.out.print("Answer: ");
            if (sc.nextInt() == answers[i]){
                    score+=1;
            }
        }

        System.out.println("Your total Score is -> " + score + " out of 5 Questions!");
        sc.close();
    }
}
