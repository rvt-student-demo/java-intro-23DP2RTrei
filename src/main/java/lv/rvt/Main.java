package lv.rvt;

public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        // 1. Pārbaude: dažādi cilvēki
        if (leo.equals(lily)) {
            System.out.println("Leo and Lily are identical!");
        } else {
            System.out.println("Leo and Lily are NOT identical.");
        }

        // 2. Pārbaude: Leo ar dažādu svaru
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Leo with different weight is identical!");
        } else {
            System.out.println("Leo with different weight is NOT identical.");
        }

        // 3. Pārbaude: Alternatīvais konstruktors
        Person testPerson = new Person("Leo", 24, 3, 2017, 62, 9);
        if (leo.equals(testPerson)) {
            System.out.println("Alternative constructor works correctly.");
        } else {
            System.out.println("Alternative constructor has issues.");
        }
    }
}