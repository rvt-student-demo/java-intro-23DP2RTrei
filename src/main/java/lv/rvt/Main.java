package lv.rvt;

public class Main {
    public static void main(String[] args) {
        // Personas dati
        String[] names = {"Jack", "Peter", "John"};
        int[] ages = {12, 13, 14};
        double[] weights = {40.5, 50.0, 60.0}; // kg
        double[] heights = {1.50, 1.60, 1.70}; // m
        
        // Tabulas galvene
        System.out.printf("| %-10s | %-3s | %-6s | %-6s | %-5s |\n", "Name", "Age", "Weight", "Height", "BMI");
        System.out.println("-------------------------------------------------");
        
        // Aprēķināt un izvadīt katras personas datus
        for (int i = 0; i < names.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("| %-10s | %-3d | %-6.1f | %-6.2f | %-5.2f |\n",
                            names[i], ages[i], weights[i], heights[i], bmi);
        }
        System.out.println("-------------------------------------------------");
    }
}