package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.print("Ievadiet skaitli: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break; 
            }
            numbers.add(num); 
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        } 
        System.out.println("Summa ir: " + sum);
    
    
    }

    
}
