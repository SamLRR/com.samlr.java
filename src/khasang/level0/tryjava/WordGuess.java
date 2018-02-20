package khasang.level0.tryjava;

import java.util.Arrays;
import java.util.Scanner;

public class WordGuess {


    public static void main(String[] args) {
        guess();
    }

    private static void guess() {
        char[] wordForGuessing = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        char[] guessedWord = new char[wordForGuessing.length];
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(guessedWord.toString());
        //System.out.println("Ведите букву:");


        boolean bWord=true;
        while(bWord){

            System.out.println("Будете отгадывать дальше? (0 - для выхода или введите очередную букву)");
            String userInput = scanner.nextLine();
            char userLetter = userInput.charAt(0);
            if(userLetter==48) System.exit(0);


            for (int i = 0; i < wordForGuessing.length; i++) {
                if(userLetter==wordForGuessing[i]){
                    System.out.println("Верно, есть такая буква");
                    guessedWord[i]=wordForGuessing[i];
                }


            }
            System.out.println(Arrays.toString(guessedWord));
            if(Arrays.equals(wordForGuessing, guessedWord)){
                bWord=false;
                System.out.println("Вы отгадали слово");
            }


        }



    }




}


