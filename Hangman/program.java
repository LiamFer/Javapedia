package Hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<String> wordsList = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in);
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Windows\\Desktop\\Stuff\\Coding\\Javapedia\\Hangman\\words.txt"));) {
            // Usando uma Stream pela primeira vez
            reader.lines().forEach(word -> wordsList.add(word.toLowerCase()));
            String word = wordsList.get(rand.nextInt(0, wordsList.size()));
            Game game = new Game(word);
            game.start();
        } catch (Exception e) {
            System.out.println("Um Erro ocorreu!");
        }

    }
}
