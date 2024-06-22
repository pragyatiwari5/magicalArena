//This class represents battle ground for the Magical Arena
class Battle {

    public void Battle(ArrayList<Player> players) {

            //Check if Magical Arena has at least two players
            if (players.size() < 1) {
                System.out.println("Insuccifient Players");
                return;
            }

            //Initialize attacking and defending players
            Comparator<Player> healthComparator = Comparator.comparingInt(Player::getHealth);
            Collections.sort(players, healthComparator);
            Player attacker = players.remove();
            Player defender = players.remove();

            //Start Battle
            while (attacker.isAlive() && defender.isAlive()) {

                //Roll dices for attacker and defender
                attacker.rollDice();
                defender.rollDice();

                //Find damage and set health of the defender
                int damage = attacker.damageCreated() - defender.damageDefended();
                defender.setHealth(damage);

                //swap attacker and defender
                swap(attacker, defender);
            }
    }

    void swap(Player p1, Player p2) {
        Player temp = p1;
        p1 = p2;
        p2 = temp;
    }
}