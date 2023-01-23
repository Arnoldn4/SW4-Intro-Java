public class LogicalNot {
    public static void main(String[] args){

            System.out.println("Would you like to play the game again?");
        String text = "yes";
        if (!(text.equals ("Yes") || text.equals("no")))
        {
            System.out.println("end!");
        }
        else
        {
            System.out.println("Yes!");

        }
    }
}
