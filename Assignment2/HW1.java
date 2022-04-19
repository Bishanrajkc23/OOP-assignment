//Write a program to take student details as input and display the result.
import javax.swing.*;
import java.awt.*;

public class HW1 {
    public static void main(String[] args) {
        String inn = JOptionPane.showInputDialog("Enter input");
        JOptionPane.showMessageDialog(null, "Your ans is: " + inn );
        System.exit(0);
    }
}
