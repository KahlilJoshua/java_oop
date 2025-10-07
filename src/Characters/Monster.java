package Characters;

public abstract class Monster extends Character{
    int hitChance = 10;

    public Monster (String name, int health, int attackDamage){
        super(name, health, attackDamage);
    }

    //Såhär tar monster skada
    @Override
    public void takeDamage(int damage) {
    }
}
