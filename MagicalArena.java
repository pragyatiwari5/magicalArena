package magicalArena;

class MagicalArena {
    private Player winner;

    public void startCombat(Player player1, Player player2) {
        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = player1.getHealth() > player2.getHealth() ? player1 : player2;
        winner = findWinner(attacker, defender);
        System.out.println("*** Winner is : " + winner.toString() + " ***");
    }

    Player findWinner(Player attacker, Player defender) {
        while (attacker.isAlive() && defender.isAlive()) {
            attacker.rollDice();
            defender.rollDice();
            int damage = attacker.damageCreated() - defender.damageDefended();
            if (damage > 0) {
                defender.takeDamage(damage);
                System.out.println(defender + " health reduced by " + damage + " to " + defender.getHealth());
            }
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        if (attacker.isAlive()) return attacker;
        else return defender;
    }

    Player getWinner() {
        return winner;
    }
}
