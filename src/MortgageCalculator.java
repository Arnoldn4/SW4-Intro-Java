// Practice Project.
import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Principal:");
        int principal = scanner.nextInt(); // set to int so as not to limit the amount of money

        System.out.print("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat(); // set to float instead of double interest rate is small
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Period (Years):");
        byte years = scanner.nextByte(); //byte is sufficient because number of years is 30
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest*Math.pow(1 + monthlyInterest, numberOfPayments)
                /monthlyInterest*Math.pow(1 + monthlyInterest, numberOfPayments-1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormatted);

    }
}
