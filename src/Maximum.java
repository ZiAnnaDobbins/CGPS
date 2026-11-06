
import java.io.File;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            double max = Double.MIN_VALUE;

            while (sc.hasNext()) {
                double num = sc.nextDouble();

                if (num > max) {
                    max = num;
                }
            }

            sc.close();

            System.out.println("Maximum value = " + max);

        } catch (Exception e) {
            System.out.println("hello");
        }
    }
}
