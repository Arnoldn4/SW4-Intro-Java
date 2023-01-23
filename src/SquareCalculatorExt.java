import java.util.Scanner;
public class SquareCalculatorExt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // assign value width: 13.5 and length: 25.3
        // data type is double to accept decimal number

        System.out.println("Enter width value : ");
        double width = reader.nextDouble();
        System.out.println("Enter length value : ");
        double length = reader.nextDouble();
        System.out.println("The width of rectangle is " + width);
        System.out.println("The length of rectangle is " + length);
        double area = width * length;
        System.out.println("The area of the rectangle is " + area);
        double perimeter = 2 * (width + length) ; // 2L + 2W
        System.out.println("The perimeter of the rectangle is " + perimeter);

    }
}

