import javax.swing.*;
import java.util.Scanner;
public class HW10{
    public static void main(String[] args) {
//        10. Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//                ( use && || with ternary operator )

        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter the three numbers: ");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second number: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third number: "));


        if ((num1 == num2) && (num1== num2) && (num2==num3)) {
            JOptionPane.showMessageDialog(null,"All are equal");
        }else if ((num1 == num2) || (num1== num2) || (num2==num3)) {
            JOptionPane.showMessageDialog(null,"2 numbers are equal");
        }else {
            JOptionPane.showMessageDialog(null,"Numbers are not  equal");
        }
    }
}
