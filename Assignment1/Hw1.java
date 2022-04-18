import java.net.SecureCacheResponse;
import java.util.Scanner;

//Write a program to take student details as input and display the result.

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String a = scanner.nextLine();
        System.out.println("Enter Last Name: ");
        String b = scanner.nextLine();
        System.out.println("Enter Address: ");
        String c = scanner.nextLine();
        System.out.println("Enter Age: ");
        String d = scanner.nextLine();
        System.out.println("Enter phone number: ");
        int e = scanner.nextInt();
        scanner.nextLine();
        System.out.println("First Name: " + a );
        System.out.println("Last Name: " + b );
        System.out.println("Address: " + c );
        System.out.println("Age: " + d );
        System.out.println("Phone number: " + e );
    }
}
