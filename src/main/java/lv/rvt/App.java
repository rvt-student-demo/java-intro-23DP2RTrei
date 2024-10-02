package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{

        public static void main(String[] args){
            printUntil(5); 
        }

        public static void printUntil(int numOfTimes) {
        int n = 1;
        while (n <= numOfTimes) {
            System.out.println(n);
            n++;
        }
    }
}
