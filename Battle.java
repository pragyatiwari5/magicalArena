//This class represents battle ground for the Magical Arena
class Battle{

    //Players can perform battle in FCFS manner
    public void Battle(Queue<Player> players){

        //Check if Magical Arena has at least two players
        if(players.size()<1) {
            System.out.println("Insuccifient Players");
            return;
        }

        //Sort the queue on the basis of players health
        Comparator<Player> scoreComparator = Comparator.comparingInt(Player::getHealth);
        Collections.sort(players, scoreComparator);

        //Initialize attacking and defending players
        Player attacker = players.poll();
        Player defender = players.poll();

        //Start Battle
        while(attacker.isAlive() && defender.isAlive()){

        }
    }

}