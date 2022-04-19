import javax.swing.*;

//Write a program to take two integer inputs from user and print sum and product of them.
public class HW4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("1st"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("2nd"));
        int c = a+b;
        int d = a*b;
        JOptionPane.showMessageDialog(null, "Sum: " + c + "\nProduct" + d );
        System.exit(0);

    }
}
