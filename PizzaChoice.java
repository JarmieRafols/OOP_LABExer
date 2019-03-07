import javax.swing.*;

public class PizzaChoice {
    private static char[] pizza_size = {'S', 'M', 'L', 'X'};
    private static String[] price = {"$6.99", "$8.99", "$12.50", "$15.00"};
    private static String small_size = "Small pizza is worth ";
    private static String medium_size = "Medium pizza is worth ";
    private static String large_size = "Large pizza is worth ";
    private static String extra_size = "Extra large pizza is worth ";
    private static String bye = "Thank you. Have a nice day!";
    private static String invalid = "Please enter a valid input ";

    public static void main(String[] args) {
        Menu();
    }
    private static void Menu(){
        try {
            int input = Integer.parseInt(JOptionPane.showInputDialog("Hi there! Please enter your pizza size \n " +
                    "\n [1] SMALL " +
                    "\n [2] MEDIUM " +
                    "\n [3] LARGE " +
                    "\n [4] EXTRA LARGE "));
            switch (input) {
                case 1:
                    small_size += price[0];
                    JOptionPane.showMessageDialog(null, small_size + pizza_size[0]);
                    TryAgain();
                    break;

                case 2:
                    medium_size += price[1];
                    JOptionPane.showMessageDialog(null, medium_size + pizza_size[1]);
                    TryAgain();
                    break;

                case 3:
                    large_size += price[2];
                    JOptionPane.showMessageDialog(null, large_size + pizza_size[2]);
                    TryAgain();
                    break;
                case 4:
                    extra_size += price[3];
                    JOptionPane.showMessageDialog(null, extra_size + pizza_size[3]);
                    TryAgain();
                    break;

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, invalid);
            Menu();
        }
    }
    private static void TryAgain() {
        try {

            int ask = Integer.parseInt(JOptionPane.showInputDialog("Do you want to try again? [1] YES or [2] NO"));
            switch (ask) {
                case 1:
                    Menu();
                case 2:
                    JOptionPane.showMessageDialog(null, bye);
                    System.exit(0);
                default:
                    TryAgain();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please input [1] or [2] only");
            TryAgain();
        }
    }
}
