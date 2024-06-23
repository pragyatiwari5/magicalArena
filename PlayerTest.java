package magicalArena;

public class PlayerTest {

    public static void main(String[] args) {
        testPlayerInitialization();
        testPlayerIsAlive();
        testPlayerRollDice();
        testPlayerDamageCreated();
        testPlayerDamageDefended();
        testPlayerTakeDamage();
    }

    public static void testPlayerInitialization() {
        Player player = new Player(100, 20, 10, "PlayerX");
        assert player.getHealth() == 100 : "Expected health to be 100, but got " + player.getHealth();
        assert player.getStrength() == 20 : "Expected strength to be 20, but got " + player.getStrength();
        assert player.getAttack() == 10 : "Expected attack to be 10, but got " + player.getAttack();
        assert player.getName().equals("PlayerX") : "Expected name to be Alice, but got " + player.getName();
        System.out.println("Player initialization test passed.");
    }

    public static void testPlayerIsAlive() {
        Player player = new Player(100, 20, 10, "PlayerX");
        assert player.isAlive() : "Expected player to be alive, but player health is " + player.getHealth();
        player.takeDamage(100);
        assert !player.isAlive() : "Expected player to be dead, but player health is " + player.getHealth();
        System.out.println("Player is alive test passed.");
    }

    public static void testPlayerRollDice() {
        Player player = new Player(100, 20, 10, "PlayerX");
        player.rollDice();
        assert (player.getDiceOutput() <= 6 && player.getDiceOutput() >= 1) : "Expected dice roll result to be between 1 to 6, but got " + player.getDiceOutput();
        System.out.println("Player roll dice test passed.");
    }

    public static void testPlayerDamageCreated() {
        Player player = new Player(100, 20, 10, "PlayerX");
        player.rollDice();
        assert player.damageCreated() == 10 * player.getDiceOutput() : "Expected damage to be" + 10 * player.getDiceOutput() + ", but got " + player.damageCreated();
        System.out.println("Player damage created test passed.");
    }

    public static void testPlayerDamageDefended() {
        Player player = new Player(100, 20, 10, "PlayerX");
        player.rollDice();
        assert player.damageDefended() == 20 * player.getDiceOutput() : "Expected damage to be" + 20 * player.getDiceOutput() + ", but got " + player.damageDefended();
        System.out.println("Player damage defended test passed.");
    }

    public static void testPlayerTakeDamage() {
        Player player = new Player(100, 20, 10, "PlayerX");
        player.takeDamage(30);
        assert player.getHealth() == 70 : "Expected health after taking 30 damage to be 70, but got " + player.getHealth();
        System.out.println("Player take damage test passed.");
    }
}
