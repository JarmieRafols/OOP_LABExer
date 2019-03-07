import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exponent {
    static int num_input, square, cube;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            // prompts user input (number) and displays the calculated values of the number
            System.out.println("Enter an integer: ");
            num_input = sc.nextInt();
            square = Square(num_input);
            System.out.println("The squared value of integer " + num_input + " is: " + square);
            cube = Cube(num_input);
            System.out.println("The cubed value of integer " + num_input + " is: " + cube);
        } catch (InputMismatchException e){
            System.out.println("Please enter a valid input");
        }
    }

        // displays the squared value of the number
        public static int Square(int num_input) {
            int square = (int)(Math.pow(num_input, 2));
            return square;
        }
        // displays the cubed value of the number
        public static int Cube(int num_input) {
            int cube = (int)(Math.pow(num_input, 3));
            return cube;
        }
}
