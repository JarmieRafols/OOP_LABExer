import java.util.InputMismatchException;
import java.util.Scanner;

public class Exponent2 {
    static Exponent exp = new Exponent();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // displays the calculated value by the cube method through calling the square method
        // then multiplies it by the number
            try {
                System.out.println("Enter an integer: ");
                int num = sc.nextInt();
                int value = exp.Cube(exp.Square(num)) * num;
                System.out.print("The calculated value is " + value);
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input");
            }
    }

}
