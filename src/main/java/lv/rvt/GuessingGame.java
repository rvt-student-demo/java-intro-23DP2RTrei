package lv.rvt;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int totalRounds = 10;
        int wonRounds = 0;

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\nround " + round + ":\n");
            int correctNumber = rand.nextInt(10) + 1; 
            int tries = 0;
            boolean won = false;

            System.out.println("I am thinking of a number from 1 to 10.");
            System.out.println("You must guess what it is in three tries.");

            while (tries < 3) {
                System.out.print("Enter a guess: ");
                int guess = scanner.nextInt();
                
                if (guess == correctNumber) {
                    System.out.println("RIGHT!");
                    won = true;
                    wonRounds++;
                    break;
                } else {
                    int difference = Math.abs(correctNumber - guess);
                    if (difference >= 3) {
                        System.out.println("cold");
                    } else if (difference == 2) {
                        System.out.println("warm");
                    } else if (difference == 1) {
                        System.out.println("hot");
                    }
                    System.out.println("Wrong!");
                }
                tries++;
            }

            if (!won) {
                System.out.println("The correct number was " + correctNumber);
            }

            System.out.println("You have won " + wonRounds + " out of " + round + " rounds.");
        }

        System.out.println("\nGame Over!");
        System.out.println("You won " + wonRounds + " out of " + totalRounds + " rounds.");

        if (wonRounds <= 7) {
            System.out.println("Your rating: amateur.");
        } else if (wonRounds == 8) {
            System.out.println("Your rating: advanced.");
        } else if (wonRounds == 9) {
            System.out.println("Your rating: professional.");
        } else if (wonRounds == 10) {
            System.out.println("Your rating: hacker.");
        }
    }
}
