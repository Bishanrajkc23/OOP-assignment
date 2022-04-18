//Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz.

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String a = scanner.nextLine();
        System.out.println("Roll no.: ");
        int e = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Field Of Interest: ");
        String b = scanner.nextLine();
        System.out.println(" Name: " + a );
        System.out.println("Roll no: " + e );
        System.out.println("Field of interest: " + b );
    }
}
