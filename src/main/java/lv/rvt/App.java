package lv.rvt;

import java.util.*;
import java.io.*;
import lv.rvt.Account;
import lv.rvt.Person;
import lv.rvt.Room;
import lv.rvt.Product;
import lv.rvt.Agent;
import lv.rvt.Statistics;
public class App 
{

        
    public static void main(String[] args) {
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            allNumbers.addNumber(number);

            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        // Print the results
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
        
        scanner.close();

    }

}
