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
