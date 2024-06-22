package magicalArena;

public class MagicalArenaDemo {

    public static void main(String[] args) {
     MagicalArena magicalArena = new MagicalArena();

        // Simulate players
        Player playerA = new Player(50, 5, 10, "Player A");
        Player playerB = new Player(100, 10, 5, "Player B");
        magicalArena.findWinner(playerA, playerB);
    }
}
