package lv.rvt;

import java.util.*;
import java.io.*;
import lv.rvt.Account;
import lv.rvt.Person;
import lv.rvt.Room;
import lv.rvt.Product;
import lv.rvt.Agent;
public class App 
{
    public static void main(String[] args) {

        Agent bond = new Agent("Bond", "James");

        bond.toString();
        System.out.println(bond);

        Agent ionic = new Agent("Iconic", "Bond");
        System.out.println(ionic);
    }

}
