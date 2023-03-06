// create dice program using Random class
import java.util.Random;
public class DiceProgram {
    public static void main(String[] args) {
        // create instance/object of the Random
        // crazy dice: generate random number between 1 to 12
        Random random = new Random();

        int diceNumber = random.nextInt(12)+1;

        System.out.println("The dice number is " + diceNumber);
    }
}
