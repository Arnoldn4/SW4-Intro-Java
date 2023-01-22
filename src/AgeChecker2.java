import java.util.Scanner;
public class AgeChecker2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // read age value (integer)
        System.out.println("Enter age value : ");
        int age = reader.nextInt();

        System.out.println("Your age is " + age + " years ");

        // if, else statement
        // negative number-> enter positive number, 0-16 -> denied, >17 -> granted
        if (age >= 17) {
            System.out.println("Access granted!");
        }else if (age < 0) {
            System.out.println("Enter positive number only!");
        }else {
            System.out.println("Access denied:");
        }

    }
}

