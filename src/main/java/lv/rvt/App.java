package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ievadam dāvanas vērtību
        System.out.print("Ievadiet dāvanas vērtību: ");
        double davanasVertiba = scanner.nextDouble();
        double nodoklis = 0;

        // Nodokļa aprēķins atkarībā no vērtības
        if (davanasVertiba < 5000) {
            System.out.println("Nodoklis nav jāmaksā!");
        } else if (davanasVertiba <= 25000) {
            nodoklis = 100 + (davanasVertiba - 5000) * 0.08;
            System.out.println("Nodoklis: " + nodoklis);
        } else if (davanasVertiba <= 55000) {
            nodoklis = 1700 + (davanasVertiba - 25000) * 0.10;
            System.out.println("Nodoklis: " + nodoklis);
        } else if (davanasVertiba <= 200000) {
            nodoklis = 4700 + (davanasVertiba - 55000) * 0.12;
            System.out.println("Nodoklis: " + nodoklis);
        } else if (davanasVertiba <= 1000000) {
            nodoklis = 22100 + (davanasVertiba - 200000) * 0.15;
            System.out.println("Nodoklis: " + nodoklis);
        } else {
            nodoklis = 142100 + (davanasVertiba - 1000000) * 0.17;
            System.out.println("Nodoklis: " + nodoklis);
        }

        scanner.close();
    }
}
