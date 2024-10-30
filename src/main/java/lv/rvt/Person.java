package lv.rvt;
import java.util.*;
public class Person {
    private String name;
    private int age;

    //Class constructor
    public Person(String initialName){
        this.name = initialName;
        this.age = 0;
    }
    public void printPerson(){
        System.out.println(this.name + ", age " + this.age + " years");
    }
}
