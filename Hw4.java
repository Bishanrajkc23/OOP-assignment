import java.net.SecureCacheResponse;
import java.util.Scanner;
//Write a program to take two integer inputs from user and print sum and product of them
public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Sum: " + (a + b ));
        System.out.println("Product: " + (a * b ));
    }
}