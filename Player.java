import java.util.Random;

// Player class representing each player in the arena
class Player {

    //Define Player field attributes
    private int health;
    private int strength;
    private int attack;
    private int diceOutput;

    //Parameterized constructor initialize a player
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.diceOutput = Random.nextInt(6)+1;
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

    public int getDiceOutput(){
        return diceOutput;
    }

    //Returns true if Player is Alive
    public boolean isAlive() {
        return health > 0;
    }

}