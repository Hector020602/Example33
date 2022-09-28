import java.util.Scanner;
public class Example33 {

    public static void main(String[] argv) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter a number:");

        double x, y, n, error = 20;
        n = inputValue.nextDouble();

        x = n;
        while (error > 0.000001) {
            y = 0.5 * (x + n / x);
            error = x - y;
            if (error < 0) {
                error = -1 * error;
            }
            x = y;
            System.out.println(x);

        }

    }

}

