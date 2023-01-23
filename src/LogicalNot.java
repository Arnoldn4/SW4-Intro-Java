import java.util.Scanner;
public class LogicalNot {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
            System.out.println("Would you like to play the game again?");
        String text = obj.nextLine();
        if (!(text.equals ("Yes") || text.equals("YES") || text.equals ("yes")))
        {
            System.out.println("end the game!");
        }
        else
        {
            System.out.println("proceed!");

        }
    }
}

