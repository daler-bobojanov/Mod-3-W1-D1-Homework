import java.util.Scanner;
import java.text.DecimalFormat;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        // Formula from inches to meters --> inches / 39.37
        double formula = userInput / 39.37;
        // To set precision for double values DecimalFormat is good technique. To use this class import java.text
        // .DecimalFormat and create object of it:
        DecimalFormat dec = new DecimalFormat("#0.000");
        System.out.println(dec.format(formula));
    }
}

/*
Requirements:
4. Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter. Example: Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters
 */
