package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievdiet savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadiet savu uzvārdu:");
        String lastname = scanner.nextLine();

        System.out.println("Ievadiet savu grupu");
        String group = scanner.nextLine();


        System.out.println("Students: " +  name + " " + lastname + ", grupa: " + group );
        
    }

}
