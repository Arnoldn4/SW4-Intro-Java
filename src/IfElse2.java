import java.util.Scanner;
public class IfElse2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // if statement = performs a block of code if the condition to be true
        // logical operator = used to connect two or more expression
        //      && (double ampersand) = (AND) both conditions must be true
        int savings = 10000;
        // if the savings between 0 to 85000, the saving is suitable for family        if (bedroomNum >= 2 && bedroomNum < 6) { // AND, both statements must T            System.out.println("The house is suitable for the family");

        if (savings >= 0 && savings <= 85000) {
            System.out.println("Money is protected.");
    }   else {
            System.out.println("It is above threshold:");

    }
}
}
