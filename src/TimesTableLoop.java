//Wb2 Q4
import java.util.Arrays;
import java.util.Scanner;
public class TimesTableLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print ("What times table would you like? :");

        int timesTable= reader.nextInt();
        for(int counter=1; counter <=12; counter ++){
            System.out.println("timesTable:" + counter + "*"+ timesTable +"="+ counter*timesTable );
        }
    }
}
