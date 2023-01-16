import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // if statement = performs a block of code if the condition to be true
        //logical operator = used to connect two more expression
        //      && ( double ampersand) = (And) both conditions must be true
        System.out.println("Enter the bedroom number");
        int bedroomNum = reader.nextInt();
        // if the bedroom number between 2 to 5, the house is suitable for family
        if (bedroomNum < 6 && bedroomNum >=2) { // AND, both statements must be T
            System.out.println("The house is suitable for family");

        } else {
            System.out.println(" One bedroom house is not enough");
        }
    }
}
