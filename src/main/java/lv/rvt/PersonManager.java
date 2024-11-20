package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws Exception{
    BufferedReader reader = Helper.getReader("person.csv");
    ArrayList<Person> personList = new ArrayList<>();
    String line;

    reader.readLine();

    while ((line = reader.readLine()) !=null) {
        String[] parts = line.split(", ");

        int age_m = Integer.parseInt(parts[1]);
        int weight_m = Integer.parseInt(parts[2]);
        int height_m = Integer.parseInt(parts[3]);

        Person person = new Person(parts[0], age_m, weight_m, height_m);
    
        personList.add(person);
    }
        return personList;
    }
    
}
