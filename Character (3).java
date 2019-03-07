
public abstract class Character {
    static Dice dice = new Dice();
    public String name;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int maxLife;
    public int currentLife;

    public Character(String n, int s, int d, int i) {
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;

        maxLife = dice.roll() * (intelligence + dexterity + strength);
        currentLife = maxLife;
    }

    public int attack () {
        return dice.roll() * strength;
    }
    public void wound ( int damage){
        currentLife -= damage;
    }
    public void heal ( int heal){
        if (heal + currentLife > maxLife) {
            currentLife = maxLife;
        } else {
            currentLife += heal;
        }
    }
    public String getName () {
        return name;
    }
    public int getStrength () {
        return strength;
    }
    public int getDexterity () {
        return dexterity;
    }
    public int getIntelligence () {
        return intelligence;
    }
    public int getCurrentLife () {
        return currentLife;
    }
    public int getMaxLife () {
        return maxLife;
    }
}
