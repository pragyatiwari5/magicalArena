package magicalArena;

public class MagicalArenaTest {

    public static void main(String[] args) {
        testStartCombat();
        testFindWinner();
    }

    public static void testStartCombat() {
        Player player1 = new Player(100, 20, 10, "PlayerA");
        Player player2 = new Player(80, 18, 12, "PlayerB");
        MagicalArena arena = new MagicalArena();
        arena.startCombat(player1, player2);
        Player winner = arena.getWinner();
        assert (winner == player1 || winner == player2) : "No winner found";
        System.out.println("Magical Arena start combat test passed");
    }

    public static void testFindWinner() {
        Player player1 = new Player(100, 20, 10, "PlayerA");
        Player player2 = new Player(80, 18, 12, "PlayerB");
        MagicalArena arena = new MagicalArena();
        Player winner = arena.findWinner(player2, player1);
        assert (winner == player1 || winner == player2) : "No winner found";
        System.out.println("Magical Arena findWinner test passed, winner = " + winner);
    }
}
