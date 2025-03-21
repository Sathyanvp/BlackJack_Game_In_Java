# BlackJack Game

This is a simple console-based Blackjack game implemented in Java.

## Features

* **Betting System:** Players can bet their virtual money.
* **Card Dealing:** The game deals cards to the player and the computer (dealer).
* **Hit and Stand:** Players can choose to "hit" (take another card) or "stand" (keep their current hand).
* **Basic Blackjack Rules:** Implements basic Blackjack rules, including checking for Blackjack (21 with two cards) and busting (going over 21).
* **Win/Loss/Draw:** Determines the winner based on the card values.
* **Money Management:** Tracks the player's virtual money.
* **Error Handling:** Handles invalid inputs and insufficient funds.

## How to Run

1.  **Prerequisites:**
    * Java Development Kit (JDK) installed.
2.  **Compilation:**
    * Open a terminal or command prompt.
    * Navigate to the directory containing the Java files.
    * Compile the Java files using the following command:
        ```bash
        javac BlackJackGame/*.java
        ```
3.  **Execution:**
    * Run the `BlackJackgameRunner` class:
        ```bash
        java BlackJackGame.BlackJackgameRunner
        ```
4.  **Gameplay:**
    * Follow the on-screen prompts to play the game.
    * Enter "yes" to start a new game, "no" to exit.
    * Enter the bet amount when prompted.
    * Enter "hit" or "stand" as prompted.

## Project Structure
BlackJackGame/

├── BlackJackgameRunner.java

├── Calculation.java

├── UserCards.java

└── Winnerclass.java


* `BlackJackgameRunner.java`: The main class that runs the game.
* `Calculation.java`: Class responsible for calculating the sum of card values.
* `UserCards.java`: Class responsible for generating and managing the player's cards.
* `Winnerclass.java`: Class responsible for determining the winner.

## Variables and Data Structures.

* `money`: Integer representing the player's virtual money.
* `bet`: Integer representing the player's current bet.
* `usercards`: `List<Integer>` storing the player's cards.
* `computercards`: `List<Integer>` storing the computer's cards.
* `userValOfCards`: Integer representing the sum of the player's cards.
* `computerValOfCards`: Integer representing the sum of the computer's cards.
* `cards`: `List<Integer>` representing the deck of cards.
* `isgame_finish`: boolean that controls the main game loop.
* `winresult`: String that stores the result of the round.

## Future Improvements

* Implement a graphical user interface (GUI).
* Add more advanced Blackjack rules, such as splitting pairs and doubling down.
* Improve the computer's AI.
* Add more robust error handling.
* Add the ability to change the amount of decks in the game.
