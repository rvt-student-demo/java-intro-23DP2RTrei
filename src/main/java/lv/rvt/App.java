package lv.rvt; //klases atrasanas vieta projekta

import java.util.*;

public class App 
{

        public static void main(String[] args){
            divByThree(2, 10); 
        }

        public static void divByThree(int begin, int end) {
            while (begin<=end) {
                if (begin%3 == 0){
                    System.out.println(begin);
                }
                else{
                    begin++;
                    continue;
                }
                begin += 3;
            }
        
    }
}
