import java.util.Scanner;
public class TimesTable2 {
    public static void main(String[] args) {

        // create Scanner object
        Scanner reader = new Scanner (System.in);
        // print out, "What times table would you like to make ?"
        System.out.print("What times table would you like to make ?");
        // read the user input, save inside variable "timesTable", read using .nextInt()
        int timesTable= reader.nextInt();
        // use while loop, counter from 1 to 12, incrementing
        // inside the loop, print the times table and calculate timesTable * counter

        int i=1;
        while ( i <= 12){
            System.out.println(i + "x" + timesTable + "=" +i*timesTable);
            i++;
        }
    }
}
