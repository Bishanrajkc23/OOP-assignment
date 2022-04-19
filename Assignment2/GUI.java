import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        String address = JOptionPane.showInputDialog("Enter your address");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your name is: " + name + "\nYour address:" + address + "\nYour age" + age);
        System.exit(0);
    }
}

class GG {
    public static void main(String[] args) {
        double mask1 = Double.parseDouble(JOptionPane.showInputDialog("Enter maths marks"));
        double mask2 = Double.parseDouble(JOptionPane.showInputDialog("Enter science marks"));
        double mask3 = Double.parseDouble(JOptionPane.showInputDialog("Enter nepali marks"));
        double mask4 = Double.parseDouble(JOptionPane.showInputDialog("Enter english marks"));
        double percentage = ((mask1 + mask2+ mask3+ mask4)/400*100);
        int castedper= (int) (percentage);
        JOptionPane.showMessageDialog(null, "Your percentage is: " + castedper + "%");
        System.exit(0);
    }
}
