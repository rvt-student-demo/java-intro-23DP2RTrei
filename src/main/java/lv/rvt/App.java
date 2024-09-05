package lv.rvt; //klases atrasanas vieta projekta

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        //Mes gribam uzinat no lietotaja vaaru uzvardu uzardu un grupu

        //Un beigās printet visu rindiņā izmantoot string savienošanu
        System.out.println("Ievadiet savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadiet savu uzvardu: ");
        String uz = scanner.nextLine();

        System.out.println("Ievaiet savu grupu: ");
        String grupa = scanner.nextLine();

        System.out.println(name + " " + uz + " " + grupa);

    }

}
