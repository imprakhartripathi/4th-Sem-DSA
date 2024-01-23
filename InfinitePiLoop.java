import java.math.BigDecimal;
import java.math.RoundingMode;

public class InfinitePiLoop {

    public static BigDecimal calculatePi(int decimalPlaces) {
        BigDecimal one = BigDecimal.ONE;
        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal four = BigDecimal.valueOf(4);
        BigDecimal pi = BigDecimal.ZERO;
        boolean addTerm = true;

        for (int i = 0; ; i++) {
            BigDecimal term = one.divide(BigDecimal.valueOf(2 * i + 1), decimalPlaces + 5, RoundingMode.HALF_UP);

            if (addTerm) {
                pi = pi.add(term);
            } else {
                pi = pi.subtract(term);
            }

            addTerm = !addTerm;

            if (i % 100 == 0) { // Print every 100 iterations (adjust as needed)
                System.out.printf("Iteration %d: %s%n", i, pi.multiply(four).setScale(decimalPlaces, RoundingMode.HALF_UP));
            }
        }
    }

    public static void main(String[] args) {
        try {
            int decimalPlaces = 20; // Change this to the desired number of decimal places
            calculatePi(decimalPlaces);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
