import java.util.Scanner;

//Cast
public class Rough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length");
        double length = scanner.nextDouble();
        System.out.println("Breath");
        double breath = scanner.nextDouble();
        double area= length * breath;
        int castedArea = (int) (area);
        System.out.println(castedArea);

    }
}

class si {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principle");
        double p = scanner.nextDouble();
        System.out.println("rate");
        double r = scanner.nextDouble();
        System.out.println("Time");
        double t = scanner.nextDouble();
        double siI= p*t*r;
        int castedsi = (int) (siI);
        System.out.println(castedsi);

    }
}


