# Magical Arena

Welcome to the Magical Arena, where players with unique attributes engage in thrilling battles of strategy and luck!

###Table Of Contents

+ [Introduction](###heading-title)
+ [Features](###heading-title)
+ [Technologies](###heading-title)
+ [Game Mechanics](###heading-title)
+ [Classes and Structure](###heading-title)
+ [How to Use](###heading-title)
+ [Example Code](###heading-title)
+ [License](###heading-title)
+ [Credits](###heading-title)

###Introduction

This Java program simulates a magical arena where players with attributes such as health, strength, and attack engage in battles. The game mechanics involve turn-based combat where players roll dice to determine attack and defense outcomes. The goal is to reduce the opponent's health to zero through strategic use of attack and defense attributes.

###Features

1. **Player Attributes:** In the Magical Arena, each player is characterized by five attributes:

    + Health: The vitality of the player. If health reaches 0, the player is defeated.
    + Strength: Determines how effectively a player can defend against incoming attacks.
    + Attack: Defines the potency of a player's offensive capabilities.
    + Name: Player name to identify as winner or looser
    + Dice-Output: Defines the luck for the player as output of dice roll.
    

2. **Turn-based Combat:** Players take turns attacking and defending based on their current health status.
   

3. **Dice Rolling Mechanism:** The outcome of dice rolls influences the damage dealt and defended during combat.
   

4. **Game End Condition:** The game ends when a player's health reaches zero, indicating their defeat.

###Technologies
Java is used as the core programming language for this program.

###Game Mechanics
1. **Initialization:** Players are initialized with positive integer values for health, strength, and attack.
2. **Combat Sequence:** 
   + Both Attacking and Defending Players roll dices.
   + Players with lower health attack first.
   + Players with lower health attack first. 
   + Damage calculation:
     
     >>Damage inflicted by attacker = attack * dice-output</br>
     Damage defended by defender = strength * dice-output</br>
     Damage to defender = max(0, inflicted_damage - defended_damage)      
   + Update defender's health based on the calculated damage.
   + Switch roles and continue until one player's health drops to zero or below.
    
3. **Winner:** A player is considered dead as his health reaches zero and the alive player is the winner.

###Classes and Structure

1. **Player Class:**
    + Attributes: health, strength, attack, diceOutput, name
    + Methods: rollDice(), isAlive(), damageCreated(), damageDefended(), takeDamage(int damage).
    
2. **Magical-Arena Class:**
    + Attribute: winner
    + Methods: startCombat(), findWinner()
    
3. **Magical-Arena-Demo Class:** Provides a simulated demonstration of the program.

4. **Player Test Class:**
    + Methods: testPlayerInitialization(), testPlayerIsAlive(), testPlayerRollDice(), testPlayerDamageCreated(), testPlayerDamageDefended(), testPlayerTakeDamage()
    
5. **Magical-Arena Test Class:**
    + Methods: testStartCombat(), testFindWinner()
    
###How to Use

- Pre-requisites: JDK installed environment.
- Compile the package magicalArena by command: javac magicalArena/*.java
- Execute the simulated battel by command: java magicalArena/MagicalArenaDemo
- Execute Player class test cases by command: java magicalArena/PlayerTest
- Execute Magical-Arena class test cases by command: java magicalArena/MagicalArenaTest

###Example Code

Here's a snippet to demonstrate how players can be initialized and combat can be started:

      package magicalArena;
      //Example Code 
      public class MagicalArenaDemo {
        public static void main(String[] args) {
           MagicalArena magicalArena = new MagicalArena();
           Player playerA = new Player(50, 5, 10, "Player A");
           Player playerB = new Player(100, 10, 5, "Player B");
           magicalArena.startCombat(playerA, playerB);
        }
      }

###Credits

This program is developed by Pragya Tiwari 
</br>email : tiwaripragya3759@gmail.com


