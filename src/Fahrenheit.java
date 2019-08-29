import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F = input.nextDouble();
        double celcius = (F - 32 / 1.8);
        System.out.println(celcius);
    }
}
