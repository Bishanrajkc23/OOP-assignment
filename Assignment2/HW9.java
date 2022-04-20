import javax.swing.*;
import java.util.Scanner;

public class HW9{
    public static void main(String[] args) {
//        9. Take two different string input and print them in same line. E.g.-
//                INPUT : Codes
//                Dope
//        OUTPUT : CodesDope

        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Enter string: ");
        String str1 = scanner.nextLine();
        JOptionPane.showMessageDialog(null,"Enter second string: ");
        String str2 = scanner.nextLine();

        JOptionPane.showMessageDialog(null,"------String-----");
        JOptionPane.showInputDialog(null,str1);
        JOptionPane.showMessageDialog(null,str2);
    }
}
