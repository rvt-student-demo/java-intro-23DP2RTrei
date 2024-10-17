package lv.rvt; //klases atrasanas vieta projekta

import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int i = rand.nextInt(10);

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.println("Enter a guess: ");
        int n = 0;
        int g = 0;
        while (n != 3) {
            int num = scanner.nextInt();
            if (num != 1) {
                System.out.println("Wrong!");
                n++;
            }
            else{
                System.out.println("Right!");
                System.out.println("You have won the game!");
            }
            g++;
        }
        if (g == 3) {
            System.out.println("The corect number was " + i + ".");
            System.out.println("You have lost the game!");
        }
    
    }

    
}
