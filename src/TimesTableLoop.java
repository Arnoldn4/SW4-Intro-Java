//Wb2 Q4
import java.util.Arrays;
import java.util.Scanner;
public class TimesTableLoop {
    public static void main(String[] args) {

        // create Scanner object
        // print out, "What times table would you like to make ?"
        // read the user input, save inside variable "timesTable", read using .nextInt()
        // use for loop, counter from 1 to 12, incrementing
        // inside the loop, print the times table and calculate timesTable * counter

        Scanner reader = new Scanner(System.in);
        System.out.print ("What times table would you like? :");

        int timesTable= reader.nextInt();
        for(int i=1; i <=12;  i++){
            System.out.println(i + " x "+ timesTable + " = " + i * timesTable );
        }
    }
}
