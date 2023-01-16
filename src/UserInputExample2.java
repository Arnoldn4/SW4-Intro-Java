import java.util.Scanner;

public class UserInputExample2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // read your name
        System.out.println("Enter your name : "); // string name
        String name = myObj.nextLine(); // can read String value

        // read age value (integer)
        System.out.println("Enter age value : ");
        int age = myObj.nextInt();

        System.out.println("Your  name is " +name);
        System.out.println("Your age is " + age + " years ");



    }



}
