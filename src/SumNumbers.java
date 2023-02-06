// Wb2 Q5
import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {

        int sumTotal = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print ("Input a number to sum to:");
        int sumTo = reader.nextInt();
        int i = 1;

        while (i  <= sumTo) {
            sumTotal += i;
            i++;
        }
            System.out.println("Sum of numbers from 1 to " + sumTo + " is: " + sumTotal);

    }
}
