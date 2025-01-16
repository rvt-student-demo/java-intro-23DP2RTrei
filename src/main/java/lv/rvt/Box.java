package lv.rvt;

public class Box {
    private final double width;
    private final double height;
    private final double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Box(Box oldBox) {
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
    }

    public static void main(String[] args) {
        Box box1 = new Box(3.0, 4.0, 5.0);

        System.out.println("Box 1 Volume: " + box1.volume());
        System.out.println("Box 1 Area: " + box1.area());

        Box biggerBox = box1.biggerBox(box1);
        System.out.println("Bigger Box Volume: " + biggerBox.volume());
        System.out.println("Bigger Box Area: " + biggerBox.area());
        System.out.println("Bigger Box Dimensions: " + biggerBox.width() + " x " + biggerBox.height() + " x " + biggerBox.length());

        Box smallerBox = box1.smallerBox(box1);
        System.out.println("Smaller Box Volume: " + smallerBox.volume());
        System.out.println("Smaller Box Area: " + smallerBox.area());
        System.out.println("Smaller Box Dimensions: " + smallerBox.width() + " x " + smallerBox.height() + " x " + smallerBox.length());
    }
}