//Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz.

import javax.swing.*;

public class HW6 {
    public static void main(String[] args) {
        String in1 = JOptionPane.showInputDialog("Enter Name");
        int a = Integer.parseInt(JOptionPane.showInputDialog("roll no"));
        String in2 = JOptionPane.showInputDialog("Enter field of interest");
        JOptionPane.showMessageDialog(null, "name: " + in1 + "\n roll no: " + a + "\n field of interest" + in2 );
        System.exit(0);
    }
}
