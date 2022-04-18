import java.net.SecureCacheResponse;
import java.util.Scanner;
//Ask user to give two double input for length and breadth of a rectangle and print area type
//        casted to int.
public class Hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int a = scanner.nextInt();
        System.out.println("Enter breath: ");
        int b = scanner.nextInt();
        System.out.println("Area: " + (a * b ));
    }
}