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
        Statistics stats = new Statistics();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter numbers:");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }
            stats.addNumber(number);
        }

        System.out.println("Sum:" + stats.sum());
        scanner.close();

    }

}
