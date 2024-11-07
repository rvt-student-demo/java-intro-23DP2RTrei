package lv.rvt;

import java.util.*;
import java.io.*;
import lv.rvt.Account;
import lv.rvt.Person;
import lv.rvt.Room;
import lv.rvt.Product;
import lv.rvt.Agent;
import lv.rvt.Statistics;
public class App 
{

        
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }

}
