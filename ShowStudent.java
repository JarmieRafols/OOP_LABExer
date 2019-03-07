import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args){

        Student show = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nStudent Information: " +
                "\nEnter your ID number: ");
        show.setidNumber(sc.nextInt());
        System.out.println("Enter number of credit hours earned: ");
        show.setcreditHoursEarned(sc.nextInt());
        System.out.println("Enter your points earned : ");
        show.setPointsEarned(sc.nextInt());

        System.out.println("ID number: " + show.getIdNum());
        System.out.println("Credit Hours: " + show.getCreditHours());
        System.out.println("Points earned: "+show.getPoints());
        System.out.println("Your grade point average is: "+ show.getGpa(show.getPoints() , show.getCreditHours()));
    }
}