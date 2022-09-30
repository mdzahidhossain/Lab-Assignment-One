import java.util.Scanner;

public class Question7SolutionPowerCompany
{
    public static void main(String[] args)
    {
        final double resistance = 10;
        final double power = 260;
        final double voltageAccessed = 120;

        double powerFactor;
        double voltageSourced;

        Scanner in = new Scanner(System.in);

        System.out.print("Power Factor: ");
        powerFactor = in.nextDouble();

        in.close();

        double temp1, temp2, temp3;

        temp1 = Math.pow((voltageAccessed + ((2 * resistance * power) / voltageAccessed)), 2);
        temp2 = Math.pow((2 * resistance * power) / (powerFactor * voltageAccessed), 2);
        temp3 = (1 - Math.pow(powerFactor, 2));

        voltageSourced = Math.sqrt(temp1 + (temp2 * temp3));

        System.out.printf("Voltage Source: %4.3f Vrms\n", voltageSourced);
    }
}
