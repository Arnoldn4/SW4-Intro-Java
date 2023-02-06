import java.util.Arrays;
import java.util.Scanner;
public class ReverseString2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a string:");
        char[] letters = reader.nextLine().toCharArray();

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
    }
}
