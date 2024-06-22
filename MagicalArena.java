package magicalArena;

class MagicalArena {
    private Player winner;

    public void findWinner(Player player1, Player player2) {
            
            Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
            Player defender = player1.getHealth() > player2.getHealth() ? player1 : player2;

            winner = battle(attacker, defender);
            System.out.println("Winner is : "+winner.toString());
    }

    Player battle(Player attacker, Player defender){
        while (attacker.isAlive() && defender.isAlive()) {
            attacker.rollDice();
            defender.rollDice();
            int damage = attacker.damageCreated() - defender.damageDefended();
            defender.takeDamage(damage);
            System.out.println(defender + " health reduced by " + damage + " to " + defender.getHealth());
            swap(attacker, defender);
        }
        if(attacker.isAlive()) return attacker;
        else return defender;
    }

    void swap(Player p1, Player p2) {
        Player temp = p1;
        p1 = p2;
        p2 = temp;
    }
}
