import java.util.Scanner;

public class SkattIRuritania {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inntekt: ");
        double inntekt = Double.parseDouble(input.nextLine());
        double skatt = 0;

        if (inntekt < 10000) {
            skatt = inntekt * 0.1;
        } else if (inntekt >= 10000) {
            double difference = inntekt - 10000;
            skatt = (10000 * 0.1) + (difference * 0.3);
        }

        System.out.println("Skatt: " + skatt);
        input.close();
    }
}
