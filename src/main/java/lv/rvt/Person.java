package lv.rvt;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int day, int month, int year, int height, int weight) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
        this.height = height;
        this.weight = weight;
    }

    public Person(String name2, int age, int weight2, int height2, String address) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (!(compared instanceof Person)) return false;
        Person that = (Person) compared;
        return name.equals(that.name) &&
            birthday.equals(that.birthday) &&
            height == that.height &&
            weight == that.weight;
    }

    public char[] toCsvRow() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toCsvRow'");
    }
}
