import java.util.Scanner;
public class IfElse2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // if statement = performs a block of code if the condition to be true
        // logical operator = used to connect two or more expression
        //      && (double ampersand) = (AND) both conditions must be true

            System.out.println("Enter the savings:");
        int savings = reader.nextInt();
        // if the savings between 0 and 85000, the saving is protected
        // if (savings >= 10000 && savings < 85000) { // AND, both statements must True

        if (savings >= 2 && savings <= 85000)
        {
            System.out.println("Money is protected.");
    }   else
    {
            System.out.println("It is above threshold:");

    }
}
}
