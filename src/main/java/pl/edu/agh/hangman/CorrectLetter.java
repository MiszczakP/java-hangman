package pl.edu.agh.hangman;

import java.util.Scanner;

public class CorrectLetter {

                if(correctLetter == false)
    {
        lives = lives -1; //lose a life
        System.out.println("Computer: I'm sorry, the word has no '"+guessedLetter+"'. You have "+lives+" lives left.");
    }
                 else //otherwise, tell the user they already guessed
    {
        System.out.println("Computer: You already guessed '"+ guessedLetter +"'. Pick another letter.");
    }



