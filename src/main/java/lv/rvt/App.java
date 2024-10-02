package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    System.out.println("Ievadiet skaitli: ");
    int i = scanner.nextInt();
    int numnum = 0;
    float avg = 0;
    while (i!=-1) {

        int num = scanner.nextInt();
        sum = sum + i; 
        i = num;
        numnum += 1;
        avg = sum / numnum;
    }
    
    System.out.println("Thx! Bye!");
    System.out.println("Sum: " + sum);
    System.out.println("Numbers: " + numnum);
    System.out.println("Average: " + avg);
    }
}
