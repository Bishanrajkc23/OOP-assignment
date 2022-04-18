//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
import java.util.Scanner;
public class Hw7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double b = scanner.nextDouble();
        double area;
        area = a*b;
        int area1 = (int)area;
        System.out.println("The area of rectangle is: " +area1);
    }

}
