// Wb2 Q6
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Input a string:");
        char[] letters = reader.nextLine().toCharArray();
        int n = letters.length;

        // reverse the letters array
        for(int i = 0; i < n / 2; i++) {
            char temp = letters[i];
            letters[i] = letters[n - i - 1];
            letters[n - i - 1] = temp;
        }

        System.out.println("String reversed:" + new String(letters));
    }
}
