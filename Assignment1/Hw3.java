
//Write a program to take input of the total marks of four subjects of a student and calculate
//        the total percentage secured. Then display the percentage and final result of the student;
//        If equal to or more than 70 -> First Class
//        If more than 59 -> Upper second Class
//        If more than 49 -> Second class
//If more than 39 -> Third class and if below than 40 the result is fail
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter MArk of 1st Subject: ");
        double a = scanner.nextDouble();
        System.out.print("Enter MArk of 2nd Subject: ");
        double b = scanner.nextDouble();
        System.out.print("Enter MArk of 3rd Subject: ");
        double c = scanner.nextDouble();
        System.out.print("Enter MArk of 4th Subject: ");
        double d = scanner.nextDouble();
        double total_mark;
        double percentage;
        String rank;
        total_mark = a+b+c+d;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark/4;
        System.out.println("Total Percentage is :" + percentage);
        rank = (percentage>=70)?"First Class":(percentage>59)?"Upper Second Class":(percentage>49)?"Second Class":(percentage>39)?"Third Class":"Failed";
        System.out.println("Your Grade is :" + rank);
    }
}



