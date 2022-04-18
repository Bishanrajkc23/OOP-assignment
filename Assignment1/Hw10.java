//Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//        ( use && || with ternary operator )

import java.util.Scanner;

public class Hw10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a  = scanner.nextInt();
        System.out.print("Enter second Number: ");
        int b  = scanner.nextInt();
        System.out.print("Enter third Number: ");
        int c  = scanner.nextInt();
        String check;
        check = ((a==b)&&(b==c))?"All the Numbers are equal":((a==b)||(b==c)||(a==c))?"Two Numbers are Equal":"None Numbers are Equal";
        System.out.println(check);
    }
}