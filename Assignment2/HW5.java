import javax.swing.*;

//Ask user to give two double input for length and breadth of a rectangle and print area type
//        casted to int.
public class HW5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("length"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("breadth"));
        int area = a*b;
        JOptionPane.showMessageDialog(null, "Area of traingle: " + area  );
        System.exit(0);

    }
}
