package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ievadiet skaitli: ");
    int fac = Integer.valueOf(scanner.nextLine());
    int facSum = 1;

    for (int i = 1; i <= fac; i++) {
        facSum = facSum * i;

    }
    System.out.println(facSum);
    }
}
