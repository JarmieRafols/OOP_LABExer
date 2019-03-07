import java.util.Scanner;

public class IntArray {
    private static Scanner sc = new Scanner(System.in);
    private static int[] integers = new int[5];
    private static int[] reversed_arr = new int[integers.length];

    public static void main(String[] args) {
        integers();
    }

    static void integers() {
        System.out.print("Enter an integer: ");
        integers[0] = sc.nextInt();
        System.out.print("Enter an integer: ");
        integers[1] = sc.nextInt();
        System.out.print("Enter an integer: ");
        integers[2] = sc.nextInt();
        System.out.print("Enter an integer: ");
        integers[3] = sc.nextInt();
        System.out.print("Enter an integer: ");a
        integers[4] = sc.nextInt();
        System.out.print("First to last: ");
        {
            for (int i = 0; i < integers.length; i++) {
                System.out.print(integers[i] + " , ");
            }
            System.out.println();
            System.out.print("Last to first: " + integers[4] + ", " + integers[3] + ", " + integers[2] + ", " + integers[1] + ", " + integers[0]);
        }
    }
}
        /*public static int[] reverse(int[] prices){
        boolean j;
        reversed_arr = new int[prices.length];
            for (int i=0; j = reversed_arr.length -1; i<prices.length, i++, j--){
                reversed_arr[j] = prices [i];
            }
            return reversed_arr;
        }
    }

/* for(int i=0; i<integers.length; i++){
        int temp = integers[i];
        integers[i] = integers[integers.length - 1 - i];
        integers[integers.length - 1 - i] = temp;
        System.out.print(integers[i] + " , ");
        **/
