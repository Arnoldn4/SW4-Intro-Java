// Workbook 3 Q4
public class TestSumAvArray {
    public static void main(String[] args) {

        // create int variable called sum, set to 0
        int sum = 0;
        // create int array, name is numbers, put random 10 numbers inside
        int [] numbers = {2,3,8,4,10,15,14,23,7,16};
        // print them out using for loop or for each loop
        for (int i=0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            // calculate the sum using this formula sum += numbers[i]; inside the for loop
            sum += numbers [i];
        }
        // print the sum
            System.out.println("\nSum of the numbers in the array is: " + sum);

        // ==== TYPE CASTING PROBLEM===
        // calculate the average and print average in double variable (include the fractions)
        // print the average, sum needs to change the data type from int to double
        double average = (double)sum/ numbers.length;
        System.out.println("The average is " + sum + "/" + numbers.length + " = " + average);
    }
}
