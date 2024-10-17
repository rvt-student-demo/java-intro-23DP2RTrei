package lv.rvt;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int i = rand.nextInt(10) + 1; 

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");

        int tries = 0;
        boolean won = false;

        while (tries < 3) {
            System.out.print("Enter a guess: ");
            int guess = scanner.nextInt();
            
            if (guess == i) {
                System.out.println("RIGHT!");
                System.out.println("You have won the game!");
                won = true;
                break; 
            } else {

                int difference = Math.abs(i - guess);

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
            System.out.println("The correct number was " + i + ".");
            System.out.println("You have lost the game!");
        }
    }
}
