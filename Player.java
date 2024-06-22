package magicalArena;
import java.util.Random;


class Player {

    private int health;
    private int strength;
    private int attack;
    private int diceOutput;
    private String name;

    public Player(int health, int strength, int attack, String name) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }
    
    void rollDice() {
        diceOutput = new Random().nextInt(6) + 1;
    }

    public int damageCreated() {
        return attack * diceOutput;
    }


    public int damageDefended() {
        return strength * diceOutput;
    }


    public void takeDamage(int damage) {
        health -= damage;
        if(health <0) health = 0;
    }
    
    public String toString() { 
    return this.name;
} 
}
