import java.util.Scanner; // import Scanner class

public class UserInputExample1 {
    public static void main(String[] args) {
        // this program can read Pokemon name and health value
        // create object scanner
        Scanner myObj = new Scanner(System.in);

        // read Pokemon name
        System.out.println("Enter the Pokemon name : "); // string name
        String name = myObj.nextLine(); // can read String value

        // read Pokemon health value (integer)
        System.out.println("Enter Pokemon health value : ");
        int health = myObj.nextInt();

        System.out.println("Your Pokemon name is " +name);
        System.out.println("Your Pokemon health is " + health);
    }
}
