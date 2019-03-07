

import java.util.Scanner;
public class Salary {

    // variable declaration
    public static int regular_hrs, overtime_hrs;
    public static double pay_rate, overtime_pay, overtime1, overtime2;
    public static Scanner sc = new Scanner(System.in);

    // main method
    public static void main(String[] args){
        System.out.println("Hello! This program calculates your weekly salary");
        System.out.println("Enter hourly pay rate: ");
        pay_rate = sc.nextFloat();
        System.out.println("Enter regular hours: ");
        regular_hrs = sc.nextInt();
        System.out.println("Enter overtime hours: ");
        overtime_hrs = sc.nextInt();
        double weeklySalary = OvertimePay(pay_rate, regular_hrs, overtime_hrs);
        System.out.printf("The overtime pay is: %.2f " , weeklySalary);
    }
    // method that calculates the weekly salary through returning the OvertimePay
    private static double OvertimePay(double pay_rate, int regular_hrs, int overtime_hrs){
        overtime1 = (int) (regular_hrs * pay_rate);
        overtime2 = (int) (overtime_hrs * 1.5) * pay_rate;
        overtime_pay = (int) overtime1 + overtime2;
        return overtime_pay;
    }
}
