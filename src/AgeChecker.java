import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // read age value (integer)
        System.out.println("Enter age value : ");
        int age = reader.nextInt();

        System.out.println("Your age is " + age + " years ");

        // check if the age more than 17, grant access, else no access
        // if, else statement
        if (age <= 17) {
            System.out.println("Access granted!");
        }else if (age>0){
            System.out.println("Enter positive number");
        }else {
            System.out.println("Access denied:");
        }

    }
}
