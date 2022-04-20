import javax.swing.*;
import java.util.Scanner;
public class HW11 {
    public static void main(String[] args) {
//        11. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.

        float a,b;
        Scanner scanner = new Scanner(System.in);
        a = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter value for a: "));

        b = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter value for b: "));


        if ((a<50) && (a<b)){
            JOptionPane.showMessageDialog(null,"The condition a<50 and a<b are true");
        }else {
            JOptionPane.showMessageDialog(null,"The condition a<50 and a<b are false");
        }
    }
}
