// Wb2 Q5
import java.util.Arrays;
import java.util.Scanner; //import the scanner function
public class SumTo {
    public static void main(String[] args) {
        // initialise sumTotal = 0, to save the total
        int sumTotal = 0;
        // ask user to enter number to sum to
        Scanner reader = new Scanner(System.in); // scanner object
        System.out.println("Input a number to sum to :");
        int sumTo = reader.nextInt(); // read user input and remember it
        System.out.println("You've entered " + sumTo);

        // use while loop to calculate the total
        int counter = 1;
        while (counter <= sumTo) { // 1-2-3----23
            sumTotal = sumTotal + counter;
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        System.out.println("Number to sum to is from 1 to " + sumTo);
        System.out.println("The sum total is " + sumTotal);
    }
}
