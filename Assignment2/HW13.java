import javax.swing.*;
import java.util.Scanner;
public class HW13{
    public static void main(String[] args) {
//        12. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.

        float eng, math, sci, com;
        double total,percentage;
        Scanner op=new Scanner(System.in);
        /* Input marks of all five subjects */
        JOptionPane.showMessageDialog(null,"Enter three marks of Robert:");
        eng= Float.parseFloat(JOptionPane.showInputDialog(null,"Enter marks of English:"));

        /* Calculate total, percentage */
//        total = eng + math+ com;
//        percentage = (total / 300.0) * 100;
//
//        JOptionPane.showMessageDialog(null,"The total marks obtained Roberts in three subjects is: "+percentage+"%");
    }

}
