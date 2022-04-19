import javax.swing.*;

//Write a program to calculate sum of four numbers taking user input.
public class HW2 {
    public static void main(String[] args) {
        double mask1 = Double.parseDouble(JOptionPane.showInputDialog("Enter 1st number"));
        double mask2 = Double.parseDouble(JOptionPane.showInputDialog("Enter 2nd number"));
        double mask3 = Double.parseDouble(JOptionPane.showInputDialog("Enter 3rd number"));
        double mask4 = Double.parseDouble(JOptionPane.showInputDialog("Enter 4th number"));
        double percentage = ((mask1 + mask2+ mask3+ mask4));
        int castedper= (int) (percentage);
        JOptionPane.showMessageDialog(null, "Your sum is: " + castedper);
        System.exit(0);
    }
}