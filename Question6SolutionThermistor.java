import java.util.Scanner;

public class Question6SolutionThermistor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final double B = 3969;
        final double R0 = 1075;
        final double T0 = 358;

        double r, t;

        System.out.print("Enter Resistance: ");
        r = in.nextDouble();

        in.close();

        double eq1 = B * T0;
        double eq2 = (T0 * Math.log1p((r / R0) - 1)) + B;
        t = (eq1 / eq2) - 273;

        System.out.printf("Liquid Temperature: %8.2f", t);
    }
}