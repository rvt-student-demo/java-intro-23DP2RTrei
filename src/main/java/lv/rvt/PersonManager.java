package lv.rvt;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class PersonManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;

        String[] names = {"Jack", "Peter", "John"};
        int[] ages = {12, 13, 14};
        double[] weights = {40.5, 50.0, 60.0};
        double[] heights = {1.50, 1.60, 1.70};

        System.out.println("Welcome to Person Manager.");
        System.out.println("Available commands:");
        System.out.println("- show  : Display the list of persons with BMI");
        System.out.println("- sort  : Sort persons by name or age");
        System.out.println("- exit  : Exit the program");

        while (isProgramRunning) {
            System.out.print("> ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "exit":
                    System.out.println("Thanks, bye bye!");
                    isProgramRunning = false;
                    break;

                case "show":
                    System.out.printf("| %-10s | %-3s | %-6s | %-6s | %-5s |\n", "Name", "Age", "Weight", "Height", "BMI");
                    System.out.println("-------------------------------------------------");

                    for (int i = 0; i < names.length; i++) {
                        double bmi = weights[i] / (heights[i] * heights[i]);
                        System.out.printf("| %-10s | %-3d | %-6.1f | %-6.2f | %-5.2f |\n",
                                names[i], ages[i], weights[i], heights[i], bmi);
                    }
                    System.out.println("-------------------------------------------------");
                    break;

                case "sort":
                    System.out.println("Choose sorting method: name or age");
                    System.out.print("> ");
                    String sortType = scanner.nextLine().trim().toLowerCase();

                    if (sortType.equals("name")) {
                        sortByName(names, ages, weights, heights);
                    } else if (sortType.equals("age")) {
                        sortByAge(names, ages, weights, heights);
                    } else {
                        System.out.println("Invalid sorting method. Use 'name' or 'age'.");
                    }
                    break;

                default:
                    System.out.println("Unknown command. Use 'show', 'sort', or 'exit'.");
                    break;
            }
        }
        scanner.close();
    }

    private static void sortByName(String[] names, int[] ages, double[] weights, double[] heights) {
        Integer[] indices = new Integer[names.length];
        for (int i = 0; i < names.length; i++) indices[i] = i;

        Arrays.sort(indices, Comparator.comparing(i -> names[i]));

        printSorted(indices, names, ages, weights, heights);
    }

    private static void sortByAge(String[] names, int[] ages, double[] weights, double[] heights) {
        Integer[] indices = new Integer[ages.length];
        for (int i = 0; i < ages.length; i++) indices[i] = i;

        Arrays.sort(indices, Comparator.comparing(i -> ages[i]));

        printSorted(indices, names, ages, weights, heights);
    }

    private static void printSorted(Integer[] indices, String[] names, int[] ages, double[] weights, double[] heights) {
        System.out.printf("| %-10s | %-3s | %-6s | %-6s | %-5s |\n", "Name", "Age", "Weight", "Height", "BMI");
        System.out.println("-------------------------------------------------");

        for (int i : indices) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("| %-10s | %-3d | %-6.1f | %-6.2f | %-5.2f |\n",
                    names[i], ages[i], weights[i], heights[i], bmi);
        }
        System.out.println("-------------------------------------------------");
    }
}