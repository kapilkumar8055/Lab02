import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.println("Enter the Value of n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("The sum of harmonic series is " + sum);
    }

}

