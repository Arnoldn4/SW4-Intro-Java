//Wb3 Q7
public class TwoDimensionalArrayExtension {
    public static void main(String[] args) {
        // extension: create an array to record student's first name and last name, you will have 2 columns in this case
        // data of dummy students' names are: Harry Potter, Ron Weasley, Ginny Weasley, Hermione Granger
        String[][] names = {{"Harry","Potter"},{"Ron","Weasley"},{"Ginny","Weasley"},{"Hermione","Granger"}};
        for (int i = 0; i < names.length; i++) { //to access row
            for (int j = 0; j < names[i].length; j++) { // to access column
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}



