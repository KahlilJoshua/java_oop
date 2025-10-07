package Characters;

//Karaktär klassen inehåller det som alla karaktärer har gemensamt (namn, hälsa och attack)
public abstract class Character {
    //Variabler för Character
    private String name;
    private int health;
    private int attackDamage;

    // Constructor
    public Character(String name, int health, int attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        System.out.println(name + " has entered the game.");
    }

    //Getters setters
    //name
    protected void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }
    //health
    protected void setHealth(int newHealth){
        this.health = newHealth;
    }
    public int getHealth() {
        return this.health;
    }
    //attackDamage
    protected void setAttackDamage(int newDamage){
        this.attackDamage = newDamage;

    }
    public int getAttackDamage(){
        return attackDamage;
    }

    // Alla sub klasser som skapas av Character måste ha en takeDamage funktion
    public abstract void takeDamage(int damage);
}
