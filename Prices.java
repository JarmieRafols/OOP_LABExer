import java.util.Scanner;
public class Prices {
    private static Scanner sc = new Scanner(System.in);
    private static double[] prices = {2.34, 7.89, 1.50, 34.60, 4.80, 29.7, 87.3, 56.8, 44.09, 38.45, 78.88, 3.45, 28.90, 78.88, 48.99, 99.3, 29.50, 56.89, 19.78, 63.2};
    private static double average = 0;
    public static void main(String[] args){

        System.out.print("The prices are: \n ");
        for (int i=0; i<prices.length; i++ ){
            System.out.print(prices[i] + " , ");
        }
        Menu();
    }

    private static void Menu() {
        try {
            System.out.println("Enter an input below: \n" +
                    "[1] Display the sum of the prices \n" +
                    "[2] Display the values that are less than 5.00 \n" +
                    "[3] Display the average of the prices \n" +
                    "[4] Display all values that are higher than the calculated average values");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    Sum();
                    TryAgain();
                    break;
                case 2:
                    LessValues();
                    TryAgain();
                    break;
                case 3:
                    FindAverage();
                    TryAgain();
                    break;
                case 4:
                    AboveAvg();
                    TryAgain();
                    break;
                default:
                    Menu();
            }
        }catch(NumberFormatException e){
            System.out.println("Please enter an invalid input");
        } Menu();
    }
        private static void Sum(){
        double total = 0;
        for(int i =0; i<prices.length; i++){
            total += prices[i];
        }
        System.out.printf("The sum of the prices are: %.2f \n " , total);
        }
        private static void LessValues() {
            System.out.print("The values less than 5.00 is/are: ");
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < 5.00) {
                    System.out.print(prices[i] + " , ");
                }
            }
        }
        private static void FindAverage() {
            double avg =0;
            for (int i = 0; i < prices.length; i++) {
                avg += prices[i];
                average = avg / (double) prices.length;
            }
            System.out.printf("The average value of the prices is %.2f \n" , average);
        }
        private static void AboveAvg(){
            System.out.printf("The value/s higher than the calculated average %.2f" + average + " is/are \n ");
            for (int i=0; i<prices.length; i++){
                if(prices[i] > average){
                    System.out.print(prices[i] + " , ");
                }
            }
        }
        private static void TryAgain(){
            try {
                System.out.println("\nDo you want to try again? [1] YES or [2] NO");
                int ask = sc.nextInt();
                switch (ask) {
                    case 1:
                        Menu();
                    case 2:
                        System.out.println("Thank You !");
                        System.exit(0);
                    default:
                        TryAgain();
                }
            } catch (NumberFormatException e) {
               System.out.println("Please input [1] or [2] only");
               TryAgain();
            }
        }
}