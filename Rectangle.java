import java.util.Scanner;

public class Rectangle {

    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);

        displayData(length, width, area);

        scnr.close();
    }

    static double getLength() {
        System.out.println("Enter the length of the rectangle: ");
        int length = scnr.nextInt();
        return length;
    }

    static double getWidth() {
        System.out.println("Enter the width of the rectangle: ");
        int width = scnr.nextInt();
        return width;
    }

    static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }

    static void displayData(double length, double width, double area) {
        System.out.println("rectangle length: " + length);
        System.out.println("rectangle width: " + width);
        System.out.println("rectangle area: " + area);
    }

}
