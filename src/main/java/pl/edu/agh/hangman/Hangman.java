package pl.edu.agh.hangman;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Random;
import java.util.Scanner;



public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static void main(String[] args) throws IOException
    {

            int maxTries = 7;
            int wordLength;
            boolean solved;
            StringBuffer guessedLetters = new StringBuffer();

            //the fileScan gets the first word for the game
            Scanner fileScan = new Scanner(new FileInputStream("C:\\\\java-hangman\\\\src\\\\main\\\\resources\\\\slowa.txt"));
            String secretWord = fileScan.next();

        //Creates a StringBuffer for the viewing of the letters guessed - READ ONLY!!! change when the program will be running
        // StringBuffer letter = new StringBuffer(secretWord);
       // System.out.println(letter);
       // letter.length();

            //Creates a StringBuffer for the viewing of the letters guessed
            StringBuffer word = new StringBuffer();
            for(int i = 0; i < secretWord.length(); i++)
                word.append("_");
            System.out.println(word);


            System.out.println("Welcome to the game of HANGMAN!!!!");
            System.out.println("You will have 7 chances to guess what the word is.");


            //	System.out.println("Your word is " + wordLength + " letters long.");

            String letter;
            while(maxTries > 0)
            {
                System.out.println("The letters that you have guessed are: " + guessedLetters);
                System.out.print("Please enter a letter to guess: ");
                Scanner inScan = new Scanner(System.in);
                letter = inScan.next();
                guessedLetters.append(letter + " ");

                if(secretWord.indexOf(letter) != (-1))
                {
                    secretWord.indexOf(letter);
                    System.out.println("correct");
                }
                else
                    maxTries--;


                System.out.println("You have " + maxTries + " wrong guesses left.");


            }


    }
}
