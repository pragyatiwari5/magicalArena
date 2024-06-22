import java.util.Random;

// Player class representing each player in the arena
class Player {

    //Define Player field attributes
    private int health;
    private int strength;
    private int attack;
    private int diceOutput;

    //Parameterized constructor to initialize a player
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    //Define getters for private fields
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public int getDiceOutput() {
        return diceOutput;
    }

    //Updates health of current player in case of damage
    public void setHealth(int damage) {
        health -= damage;
    }

    //Returns true if Player is Alive
    public boolean isAlive() {
        return health > 0;
    }

    //Sets and returns new diceOutput value for both attacking and defending dice
    void rollDice() {
        diceOutput = new Random().nextInt(6) + 1;
    }

    //Calculate the damage created by the current player
    public int damageCreated() {
        return attack * diceOutput;
    }

    //Calculate the damage defended by the current player
    public int damageDefended() {
        return strength * diceOutput;
    }
}