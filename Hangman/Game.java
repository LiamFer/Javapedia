package Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private String word;
    private int correctGuesses = 0;
    private ArrayList<String> guessedWords = new ArrayList<>();

    Game(String word){
        this.word = word;
    }

    void start(){
        Scanner sc = new Scanner(System.in);
        while(guessedWords.size() < 7 && correctGuesses != word.length()){
            System.out.println(7-guessedWords.size() +" Guesses Remaining!\n");
            display();
            System.out.print("Your guess: ");
            guess(sc.next());
        }
        if (correctGuesses == word.length()){
            System.out.println("YOU WON!");
        } else {
            System.out.println("You lost, the word was (" + word + ")!");
        }

    }

    void guess(String letter){
        if(guessedWords.contains(letter)){
            System.out.println("You already guessed " + letter + "!");
        } else if (word.contains(letter)) {
            guessedWords.add(letter);
            for(char c : word.toCharArray()){
                correctGuesses+= letter.equals(String.valueOf(c)) ? 1 : 0;
            }
        } else {
            guessedWords.add(letter);
            System.out.println(letter + " is not in the word!");
        }
    }

    void display(){
        for(char letter : word.toCharArray()){
            if (guessedWords.contains(String.valueOf(letter))){
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }


}
