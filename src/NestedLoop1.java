// Nested loop: consist of an outer loop and one or  more inner loops
// be careful: your counter must have different  name!!
public class NestedLoop1 {
    public static void main(String[] args) {

        for (int i=0; i<3; i++) { // outer loop starts i = 0, 1, 2
            for (int j=0; j <2; j++) { // inner loop starts j = 0, 1
                System.out.println(i  + " " + j);
            } // inner loop end
        } // outer loop end
        System.out.println("\nPrint numbers from 10 to 19:");

//Task 1 print number 10 to 19
        for (int i=1; i<2; i++){ // outer loop starts i = 0, 1, 2
            for(int j=0;j<10;j++){ // inner loop starts j = 0, 1
                System.out.println(i+" "+j);
            }
        }
   }
}




