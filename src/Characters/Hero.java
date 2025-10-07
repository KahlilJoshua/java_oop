package Characters;
import java.util.Scanner;
public class Hero extends Character{
    private int level;
    private int xp;
    //Skapa hjälte
    public Hero (String name, int health, int attackDamage, int level, int xp){
        super(name, health, attackDamage);
        this.level = 0;
        this.xp = 0;
    }
    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        if(damage > 10){
            System.out.println("OUFFFFF");

        }
        else{
            System.out.println("ouff");
        }
    }//Battle won
}
