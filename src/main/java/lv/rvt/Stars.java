package lv.rvt;

import java.util.*;

public class Stars {
    
    public static void printStars(int number) {
        //code goes here
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printSquare(int size) {
        for (int u = 0; u < size; u++){
            System.out.print(" ");
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int h = 0; h < height; h++){
            System.out.print(" ");
            printStars(width);
        }
    }

    public static void prinTriangle(int size) {
        for (int m = 0; m < size; m++){
            printStars(m);
            System.out.print(" ");
            
        }
    }

    // Jūsu metodes būs šeit



}
