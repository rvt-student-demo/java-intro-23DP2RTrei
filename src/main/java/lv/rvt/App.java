package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());

        if (number < 0) {
            System.out.println("Grade: impossible!");
        } else if (number < 50) {
            System.out.println("Grade: failed.");
        } else if (number < 60 ) {
            System.out.println("Grade: 1");
        } else if (number < 70 ) {
            System.out.println("Grade: 2");
        }
        else if (number < 80 ) {
            System.out.println("Grade: 3");
        }
        else if (number < 90 ) {
            System.out.println("Grade: 4");
        }
        else if (number < 100 ) {
            System.out.println("Grade: 5");
        }
        else if (number > 100 ) {
            System.out.println("Grade: icredable");
        }
        
        
    }

}
