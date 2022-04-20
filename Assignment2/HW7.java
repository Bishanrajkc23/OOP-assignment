import javax.swing.*;
import java.util.Scanner;

public class HW7{
    public static void main(String[] args) {
//        Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

        Scanner scanner = new Scanner(System.in);

        // input the length of a square
        double len = Double.parseDouble(JOptionPane.showInputDialog(null,"For area and volume of square\n"+"Enter the length of a square"));

        int area = (int)(len * len);
        int volume = (int)(len*len*len);
        int volume_cube = area*area*area;
        // output
        JOptionPane.showMessageDialog(null,"The input length of square is: "+len+"\n"+"The area  of square is : "+area+"\n"+"The volume  of square is : "+volume+"\n"+
                "Using the same length of square- "+len+" as length of cube.\n"+"The volume of cube is: "+volume_cube);

        double len_tri = Double.parseDouble(JOptionPane.showInputDialog(null,"For area of triangle: "+"Enter the length of a triangle: "));
        double height_tri = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the length of a triangle: "));
        double area_tri = (len_tri*height_tri)/2;

        // output
        JOptionPane.showMessageDialog(null,"The area of triangle is : "+area_tri);

    }
}