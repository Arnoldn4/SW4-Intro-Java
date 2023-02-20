// Wb2 Q6
// create variable to store the total variant of the number, assign to 0
// three nested for loops to print each digit
// eliminate the duplicate numbers
// print out the total variant of the three digits numbers
public class ThreeDigitCodes {
    public static void main(String[] args) {
        int count = 0; // to count how many unique variant

        for (int i = 1; i <= 4; i++) { // handling the first digit
            for (int j = 1; j <= 4; j++) { // handling the 2nd digit
                for (int k = 1; k <= 4; k++) { // handling the 3rd digit
                    if (i != j && i != k && j != k) {
                        System.out.println(i + " " + j + " " + k);
                        count++;
                    }
                } // end of 3rd loop
            } // end of 2nd loop
        } // end of first loop
        System.out.println("Total number of unique three-digit codes: " + count);
    }
}



