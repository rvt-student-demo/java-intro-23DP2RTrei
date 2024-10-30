package lv.rvt;

import java.util.*;
import java.io.*;
import lv.rvt.Account;
import lv.rvt.Person;
import lv.rvt.Room;
import lv.rvt.Product;
public class App 
{

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);
        
        counter.printValue();

        counter.decrement();
        counter.printValue();
        
        counter.decrement();
        counter.printValue();
        
        counter.decrement();
        counter.printValue();
    }


}
