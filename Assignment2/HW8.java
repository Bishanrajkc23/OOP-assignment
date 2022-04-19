//Write a program to find square of a number
import javax.swing.*;

public class HW8 {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter your number"));
        int c = a*a;
        JOptionPane.showMessageDialog(null, "Square: " + c);
        System.exit(0);
    }
}