//Take two different string input and print them in same line
import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Hw9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st word: ");
        String a = scanner.nextLine();
        System.out.println("Enter 2nd word: ");
        String b = scanner.nextLine();
        System.out.print(" Same : " + a );
        System.out.print(" " + b );
    }
}
