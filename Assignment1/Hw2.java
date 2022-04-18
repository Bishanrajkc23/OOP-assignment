import java.net.SecureCacheResponse;
import java.util.Scanner;
//Write a program to calculate sum of four numbers taking user input.
public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = scanner.nextInt();
        System.out.println("Enter 4th number: ");
        int d = scanner.nextInt();
        System.out.println("Sum: " + (a + b + c + d));
    }
}
