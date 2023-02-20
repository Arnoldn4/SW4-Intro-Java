//Wb3 Q6.
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("This program will reverse your name.");
        System.out.print("Input a string: ");
        char[] letters = reader.nextLine().toCharArray();

        for(int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
            System.out.println("\nThe reversed string is: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
            System.out.println();
    }
}
