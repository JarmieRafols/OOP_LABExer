import java.util.Random;
import java.util.Scanner;

public class TestCharacter {

    public static Dice dice = new Dice();
    public static void main(String[] args) {
        //name, strength, dexterity, intelligence
        Character player1 = new Character("JARM", 30,4,100);
        Character player2 = new Character("PRETZELS", 50,2,100);

        fight(player1, player2);
    }
    static void fight(Character player1, Character player2){
        int round = 1;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while(player1.getCurrentLife() > 0 || player2.getCurrentLife() > 0){
            System.out.println("******************************\n" +
                    "ROUND "+round);

            System.out.println(player1.getName()+" : "+player1.getCurrentLife());
            System.out.println(player2.getName()+" : "+player2.getCurrentLife());

            System.out.print(player1.getName()+", [0] ATTACK or [1] HEAL : ");
            int decision = sc.nextInt();
            int damage = 0;
            int heal = 0;

            if (decision == 0){
                damage = player1.attack();
                System.out.println(player1.getName()+" attacks "+player2.getName()+" for "+damage);
                player2.wound(damage);

                if(player2.getCurrentLife() <= 0){
                    System.out.println("\n"+player1.getName()+" wins!");
                    break;
                }
            }else{
                heal = dice.roll()*player1.getIntelligence();
                System.out.println(player1.getName()+" heals for "+heal);
                player1.heal(heal);
            }

            int enemyMove = r.nextInt(2);

            if (enemyMove == 0){
                damage = player2.attack();
                System.out.println(player2.getName()+" attacks "+player1.getName()+" for "+damage);
                player1.wound(damage);

                if(player1.getCurrentLife() <= 0){
                    System.out.println("\n"+player2.getName()+" wins!");
                    break;
                }
            }else{
                heal = dice.roll()*player2.getIntelligence();
                System.out.println(player2.getName()+" heals for "+heal);
                player2.heal(heal);
            }

            System.out.println();
            round++;
        }
    }
}
